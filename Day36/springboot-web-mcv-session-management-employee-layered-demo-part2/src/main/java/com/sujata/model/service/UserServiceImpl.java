package com.sujata.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.User;
import com.sujata.model.persistence.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public boolean checkUser(User user) {
		if(userDao.getUser(user.getUserName(), user.getPassword())!=null)
			return true;
		return false;
	}
}
