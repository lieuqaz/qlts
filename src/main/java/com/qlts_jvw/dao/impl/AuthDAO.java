package com.qlts_jvw.dao.impl;

import java.util.List;

import com.qlts_jvw.dao.AbstractDAO;
import com.qlts_jvw.dao.IAuthDAO;
import com.qlts_jvw.mapper.AccountMapper;
import com.qlts_jvw.model.AccountModel;

public class AuthDAO extends AbstractDAO<AccountModel> implements IAuthDAO{

	@Override
	public AccountModel login(String userName, String password) {
		StringBuilder sql = new StringBuilder("SELECT * FROM account");
		sql.append(" WHERE username = ? AND password = ?");
		List<AccountModel> users = query(sql.toString(), new AccountMapper(), userName, password);
		return users.isEmpty() ? null : users.get(0);
	}

}
