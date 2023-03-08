package com.spring.pojo;

import com.spring.defineInterface.MyTest3;

@MyTest3(value = "str1",bbb = {"a1","b1"})
public class Demo {

    @MyTest3(value = "str",bbb = {"a","b"})
    public void test1(){}
}
