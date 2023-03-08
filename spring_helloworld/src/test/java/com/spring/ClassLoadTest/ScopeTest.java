package com.spring.ClassLoadTest;

import com.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class ScopeTest {

    @Test
    public void testScope() throws SQLException {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");
//        DruidDataSource dataSource = ioc.getBean(DruidDataSource.class);
//        System.out.println(dataSource.getConnection());

        Student student1 = ioc.getBean(Student.class);
        Student student2 = ioc.getBean(Student.class);

        System.out.println(student1.equals(student2));

//        String str1 = "haoxu";
//        String str2 = "haoxu";
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());


    }
}
