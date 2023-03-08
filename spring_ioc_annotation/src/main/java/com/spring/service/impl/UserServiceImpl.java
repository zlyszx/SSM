package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
//    @Qualifier("dao")
    private UserDao userDao;

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
