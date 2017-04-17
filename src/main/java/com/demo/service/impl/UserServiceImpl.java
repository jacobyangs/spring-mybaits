package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.dao.UserDAO;
import com.demo.model.User;
import com.demo.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
 
    @Autowired
    @Qualifier("userDAO")
    private UserDAO userDAO;
     
    public boolean insertUser(User user) {
        return userDAO.insertUser(user);
    }

    public List<User> findallUser() {
        return userDAO.findallUser();
    }

    @Override
    public boolean delUser(String name) {
        return userDAO.deleteUser(name);
    }

    @Override
    public boolean updateUser(String name, int id) {
        return userDAO.updateUser(name,id);
    }

}