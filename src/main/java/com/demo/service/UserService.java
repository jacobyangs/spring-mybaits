package com.demo.service;

import com.demo.model.User;

import java.util.List;

public interface UserService {

	boolean insertUser(User user);
	List<User> findallUser();
	boolean delUser(String name);
	boolean updateUser(String name,int id);
}
