package com.service;

import com.entity.LoginUser;

public interface LoginUserService {
	
	LoginUser login(String username, String password);
	boolean changePassword(String username, String newPassword);
	
}
