package com.demo;

import com.demo.controller.UserController;
import com.demo.model.User;
import com.demo.service.UserService;
import com.demo.service.impl.UserServiceImpl;
import com.demo.system.log.Log;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * Created by jacob on 2017/4/17.
 */
public class test {
    ApplicationContext context = new FileSystemXmlApplicationContext("config/spring-mybatis.xml");
    UserController userController =  context.getBean(UserController.class);

    @Test
    public void userinsert(){
        User user = new User();
        user.setName("wang");
        user.setPassword("jing");
        System.out.println(userController.insertUser(user));
    }
    @Test
    public void testcontroller(){
        for (User user : userController.findall()){
            System.out.println(user);
        }
    }
    @Test
    public void delUser(){
        System.out.println(userController.delUser("123243"));
    }
    @Test
    public void update(){
        System.out.println(userController.update("what",1));
    }
}
