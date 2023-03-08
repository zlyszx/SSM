package com.spring;

import com.spring.objectframe.ObjectFrame;
import com.spring.pojo.Person;
import com.spring.pojo.User;
import org.junit.Test;

import java.io.FileNotFoundException;

public class TestObjectFrame {

    @Test
    public void save() throws FileNotFoundException, IllegalAccessException {

        User user = new User(1,25,"王五");
        Person person = new Person("张三","男");
        ObjectFrame.saveObject(user);
        ObjectFrame.saveObject(person);
    }

}
