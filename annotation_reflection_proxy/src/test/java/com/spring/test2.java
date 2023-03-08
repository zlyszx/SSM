package com.spring;

import com.spring.pojo.Person;
import com.spring.pojo.Student;
import org.junit.Test;

import java.lang.annotation.ElementType;

public class test2 {

    @Test
    public void test() throws ClassNotFoundException {
        Person person = new Student();
        System.out.println(person.name);

        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        Class c2 = Class.forName("com.spring.pojo.Student");
        System.out.println(c2.hashCode());

        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        System.out.println(c1.getSuperclass());

    }

    @Test
    public void test1() {
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = Integer.class;
        Class c8 = void.class;
        Class c9 = Class.class;
        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
        System.out.println("c1: "+c1);
        System.out.println("c2:"+c2);
        System.out.println("c3:"+c3);
        System.out.println("c4:"+c4);
        System.out.println("c5:"+c5);
        System.out.println("c6:"+c6);
        System.out.println("c7:"+c7);
        System.out.println("c8:"+c8);
        System.out.println("c9:"+c9);
        System.out.println("c10:"+c10);
        System.out.println("c11:"+c11);
        //只要元素类型与维度一样,就是同一个"c:"+Class

        System.out.println(c11.hashCode());
        System.out.println(c10.hashCode());
        System.out.println(c11==c10);
    }
}
