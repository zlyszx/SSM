package com.spring.ClassLoadTest;

import com.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByXMLTest {

    @Test
    public void testAutowire() {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire.xml");
        UserController userController = ioc.getBean(UserController.class);
//        UserService bean = ioc.getBean(UserService.class);
        userController.saveUser();
//        bean.saveUser();
    }
}
