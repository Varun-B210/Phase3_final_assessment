package com.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.LoginUser;
import com.repository.LoginRepository;
import com.service.LoginUserService;

@Service
public class LoginServiceImpl implements LoginUserService{
	
	@Autowired
	LoginRepository lr;

	public LoginUser login(String username, String password) {
		LoginUser user = lr.findByUsername(username);
		System.out.println("User found : " + user);
		return user;
	}

	public boolean changePassword(String username, String newPassword) {
		LoginUser user = lr.findByUsername(username);
		if (Objects.nonNull(user)) {
			lr.changePassword(newPassword, user.getId());
			System.out.println("User " + user.getUsername() + " has successfuly changed the password");
			return true;
		} else {
			System.out.println("Unable to change the password!");
			return false;
	}

}
}
