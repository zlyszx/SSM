package com.spring;

import com.spring.proxy.BigStar;
import com.spring.proxy.ProxyUtil;
import com.spring.proxy.Star;
import com.spring.proxyExample.UserService;
import com.spring.proxyExample.UserServiceImp;
import com.spring.proxyExample.UserServiceProxy;
import org.junit.Test;

public class TestProxyExample {

    @Test
    public void test() throws InterruptedException {

        UserServiceImp userServiceImp =new UserServiceImp();
        UserService proxy = UserServiceProxy.createProxy(userServiceImp);
        proxy.login("admin","123456");
        proxy.deleteUser();
        proxy.selectUsers();
    }
}
