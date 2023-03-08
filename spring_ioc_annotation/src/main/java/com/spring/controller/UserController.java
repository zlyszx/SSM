package com.spring.controller;

import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
//@Controller("controller")
public class UserController {

    @Autowired
//    @Qualifier("service")
    private UserService userService;

//    public UserController() {
//
//    }


//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }




//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    public void saveUser() {
        userService.saveUser();
    }

}
