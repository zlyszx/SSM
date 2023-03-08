package com.spring.ClassLoadTest;

import com.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

    @Test
    public void test() {
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取
        HelloWorld helloWorld = (HelloWorld) ioc.getBean("helloworld");
        helloWorld.sayHello();
    }
}
