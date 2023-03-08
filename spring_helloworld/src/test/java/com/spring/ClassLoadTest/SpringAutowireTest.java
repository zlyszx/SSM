package com.spring.ClassLoadTest;

import com.spring.controller.UserController;
import com.spring.dao.UserDao;
import com.spring.dao.impl.UserDaoImpl;
import com.spring.service.impl.UserServiceImpl;
import org.junit.Test;

public class SpringAutowireTest {

    @Test
    public void test1() {

        UserDao userDao = new UserDaoImpl();
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao);
        UserController userController = new UserController();
        userController.setUserService(userService);
        userController.saveUser();
    }
}
