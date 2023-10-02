package com.qlts_jvw.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.qlts_jvw.model.AccountModel;

public class AccountMapper implements RowMapper<AccountModel>{

	@Override
	public AccountModel mapRow(ResultSet resultSet) {
		try {
			AccountModel user = new AccountModel();
			user.setId(resultSet.getString("id"));
			user.setUsername(resultSet.getString("username"));
			user.setPassword(resultSet.getString("password"));
			user.setFullname(resultSet.getString("fullname"));
			return user;
		} catch (SQLException e) {
			return null;
		}	
	}

}
