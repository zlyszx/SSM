package com.spring;

import org.junit.Test;

import java.lang.annotation.Target;

public class test1 extends Object{

    @Test
    public void testClass() throws ClassNotFoundException {

        Class<?> c1 = Class.forName("com.spring.pojo.User");
        System.out.println(c1);

        Class<?> c2 = Class.forName("com.spring.pojo.User");
        Class<?> c3 = Class.forName("com.spring.pojo.User");
        Class<?> c4 = Class.forName("com.spring.pojo.User");


        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());

    }



}
