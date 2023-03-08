package com.spring;

import com.spring.pojo.Student;
import com.spring.pojo.User;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class test3 {

    @Test
    public void testGetClass() {

        Class c1 = Student.class;
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        System.out.println(c1.getFields());
        System.out.println(c1.getMethods());

    }

    @Test
    public void testGetConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class c = User.class;

        Constructor constructor0 = c.getDeclaredConstructor();

//        for(Constructor constructor: constructors) {
//            System.out.println(constructor.getName() + "--->" + constructor.getParameterCount());
//        }
        System.out.println(constructor0.getName() + "--->" + constructor0.getParameterCount());

        //表示禁止检查访问控制（暴力反射）
        constructor0.setAccessible(true);
        User user= (User) constructor0.newInstance();
        System.out.println(user);

        Constructor constructor1 = c.getDeclaredConstructor(int.class, int.class, String.class);

        System.out.println(constructor1.getName() + "--->" + constructor1.getParameterCount());

    }

    @Test
    public void testGetFields() throws NoSuchFieldException, IllegalAccessException {

        Class user= User.class;

        //获取类的全部成员变量
        Field[] fields = user.getDeclaredFields();

        for (Field field:fields) {
            System.out.println(field.getName() + "--->" + field.getType());
        }

        //定位某个成员变量
        Field fName = user.getDeclaredField("age");
        System.out.println(fName.getName() + "-->" + fName.getType());


        User user1= new User();
        fName.setAccessible(true);
        fName.set(user1,1);
        System.out.println(user1);

        int age1 = (int) fName.get(user1);
        System.out.println(age1);
    }

    @Test
    public void testGetMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class user = User.class;
//        Method[] methods = user.getDeclaredMethods();
//
//        for (Method method:methods) {
//            System.out.println(method.getName()+ "--->"
//                            + method.getParameterCount() + "--->"
//                            + method.getReturnType());
//        }

        Method sing = user.getDeclaredMethod("sing");
        System.out.println(sing.getName()+ "--->"
                + sing.getParameterCount() + "--->"
                + sing.getReturnType());

        Method sing1 = user.getDeclaredMethod("sing",String.class,Integer.class);
        System.out.println(sing1.getName()+ "--->"
                + sing1.getParameterCount() + "--->"
                + sing1.getReturnType());

        User user1= new User();
        sing.setAccessible(true);
        sing.invoke(user1);

        String str = (String) sing1.invoke(user1,"kun",20);
        System.out.println(str);
    }
}
