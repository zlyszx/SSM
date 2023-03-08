package com.spring.ClassLoadTest;

import com.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class IocByAnnotationTest {

    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        //这里controller是自定义id名称
//        UserController userController = (UserController) ioc.getBean("controller");
//        System.out.println(userController);
//        UserService userService = ioc.getBean("userServiceImpl",UserService.class);
//        System.out.println(userService);
//        UserDao userDao = ioc.getBean(UserDao.class);
//        System.out.println(userDao);

        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }

}
