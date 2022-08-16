package com.sujata.model.persistence;

import com.sujata.bean.User;

public interface UserDao {

	User getUser(String username,String password);
}
