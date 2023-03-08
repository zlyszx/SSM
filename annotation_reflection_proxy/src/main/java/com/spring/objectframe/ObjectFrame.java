package com.spring.objectframe;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class ObjectFrame {

    /**
     * 保存任意对象的字段和其数据到文件中去
     * @param obj
     */
    public static void saveObject(Object obj) throws IllegalAccessException, FileNotFoundException {

        PrintStream ps = new PrintStream(new FileOutputStream("D:\\研究生学习\\后端练习\\SSM\\AnnotationAndReflection\\src\\main\\resources\\data.txt",true));

        Class c = obj.getClass();
        String simpleName = c.getSimpleName();
        ps.println("-----" + simpleName + "-----");

        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {

            String name = field.getName();
            field.setAccessible(true);
            String value = field.get(obj) + "";

            ps.println(name + " = " + value);

        }
        ps.close();

    }

}
