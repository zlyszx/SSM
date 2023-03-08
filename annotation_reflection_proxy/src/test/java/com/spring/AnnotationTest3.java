package com.spring;

import com.spring.defineInterface.MyTest3;
import com.spring.pojo.Demo;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationTest3 {

    @Test
    public void parseClass() {
        Class c = Demo.class;
        if(c.isAnnotationPresent(MyTest3.class)) {
            MyTest3 myTest3 =
                    (MyTest3) c.getDeclaredAnnotation(MyTest3.class);
            System.out.println(myTest3.value());
            System.out.println(myTest3.aaa());
            System.out.println(Arrays.toString(myTest3.bbb()));
        }
    }

    @Test
    public void parseMethod() throws NoSuchMethodException {
        Class c = Demo.class;
        Method method = c.getDeclaredMethod("test1");
        if(method.isAnnotationPresent(MyTest3.class)) {
            MyTest3 myTest3 =
                    (MyTest3) method.getDeclaredAnnotation(MyTest3.class);
            System.out.println(myTest3.value());
            System.out.println(myTest3.aaa());
            System.out.println(Arrays.toString(myTest3.bbb()));
        }
    }

}
