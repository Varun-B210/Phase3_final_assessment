package com.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entity.LoginUser;

@Repository
public interface LoginRepository extends CrudRepository<LoginUser, Long> {
	
	LoginUser findByUsername(String username);
	
	@Modifying
	@Transactional
	@Query("update LoginUser log set log.password=:password where log.id=:id")
	void changePassword(@Param(value = "password") String password, @Param(value = "id") int i);

	LoginUser findByUsernameAndPassword(String username, String password);

}
