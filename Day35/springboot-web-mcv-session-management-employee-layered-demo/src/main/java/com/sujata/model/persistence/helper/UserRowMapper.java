package com.sujata.model.persistence.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.bean.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		User user=new User(resultSet.getString("username"), resultSet.getString("password"));
		return user;
	}

}
