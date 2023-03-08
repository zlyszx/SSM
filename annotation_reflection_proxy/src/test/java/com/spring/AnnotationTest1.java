package com.spring;

import com.spring.defineInterface.MyTest1;
import com.spring.defineInterface.MyTest2;

@MyTest1(aaa="张三",ccc = {"hh","sss"})
public class AnnotationTest1 {

    @MyTest1(aaa="张三1",ccc = {"hh1","sss1"})
    @MyTest2("张三丰")
    public void test1() {

    }

    public static void main(String[] args) {

    }
}
