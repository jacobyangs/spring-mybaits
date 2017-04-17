package com.demo.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.User;

import java.util.List;

@Transactional(propagation=Propagation.REQUIRES_NEW,readOnly=false,isolation=Isolation.DEFAULT)
public interface UserDAO {
	public boolean insertUser(User user);

	public List<User> findallUser();

	public boolean deleteUser(String name);

	public boolean updateUser(@Param("name") String name, @Param("id") int id);
}
