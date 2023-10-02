package com.qlts_jvw.service.impl;

import com.qlts_jvw.model.AccountModel;
import com.qlts_jvw.service.IAuthService;

public class AuthService implements IAuthService {

	private IUserDAO userDAO;

	public AuthService() {
		userDAO = new UserDAO();
	}
	
	@Override
	public AccountModel login(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
