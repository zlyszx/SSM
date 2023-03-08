package com.spring.factory;

import com.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;

public class UserFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
