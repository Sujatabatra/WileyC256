package com.sujata.model.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sujata.bean.User;

import com.sujata.model.persistence.helper.UserRowMapper;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public User getUser(String username, String password) {
		User user=null;
		try {
		String query="SELECT * FROM MYUSERS where USERNAME=? and PASSWORD=?";
		user=jdbcTemplate.queryForObject(query, new UserRowMapper(), username,password);
		}
		catch(EmptyResultDataAccessException ex) {
			return user;
		}
		return user;
	}

}
