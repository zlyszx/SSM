package com.spring.ClassLoadTest;

import com.spring.pojo.Person;
import com.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByXMLTest {

    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student studentOne = (Student) ioc.getBean("studentOne");
//        Student studentOne = ioc.getBean("studentTwo",Student.class);
        Person bean = ioc.getBean(Person.class);

        System.out.println(bean);
    }

    @Test
    public void testDI() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student studentOne = (Student) ioc.getBean("studentOne");
//        Student studentOne = ioc.getBean("studentTwo",Student.class);
//        Student student = ioc.getBean("studentFive", Student.class);
        Student student = ioc.getBean("studentSix", Student.class);

        System.out.println(student);
//
//        Clazz clazz = ioc.getBean("clazzOne",Clazz.class);
//        System.out.println(clazz);
    }
}
