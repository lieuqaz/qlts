package com.qlts_jvw.dao;

import com.qlts_jvw.model.AccountModel;

public interface IAuthDAO extends GenericDAO<AccountModel>{
	AccountModel login(String userName, String password);
}
