package com.qlts_jvw.service;

import com.qlts_jvw.model.AccountModel;

public interface IAuthService {
	AccountModel login(String userName, String password);
}
