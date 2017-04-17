package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.User;
import com.demo.service.UserService;

import java.util.List;

@Controller
public class UserController {
 
	@Autowired
	private UserService userService;
	
    public List<User> findall(){
        return userService.findallUser();
    }

    public boolean insertUser(User user){
        return userService.insertUser(user);
    }
    public boolean delUser(String name){
        return userService.delUser(name);
    }
    public boolean update(String name,int id){
        return userService.updateUser(name,id);
    }
     
}