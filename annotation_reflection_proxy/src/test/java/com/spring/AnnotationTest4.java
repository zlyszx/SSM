package com.spring;

import com.spring.defineInterface.MyTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class AnnotationTest4 {

    @MyTest
    public void test1() {
        System.out.println("===test1===");
    }

//    @MyTest
    public void test2() {
        System.out.println("===test2===");
    }

//    @MyTest
    public void test3() {
        System.out.println("===test3===");
    }

    @MyTest
    public void test4() {
        System.out.println("===test4===");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class c = AnnotationTest4.class;
        Method[] methods = c.getDeclaredMethods();
        AnnotationTest4 annotationTest4= new AnnotationTest4();
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTest.class)) {
                method.invoke(annotationTest4);
            }
        }

    }
}
