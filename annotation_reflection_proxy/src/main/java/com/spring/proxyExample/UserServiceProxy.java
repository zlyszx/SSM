package com.spring.proxyExample;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserServiceProxy{

    public static UserService createProxy(UserServiceImp userServiceImp) {
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(UserServiceProxy.class.getClassLoader(),
                new Class[]{UserService.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String str = method.getName();
                        if(str.equals("login") ||str.equals("deleteUser") ||str.equals("selectUsers")) {
                            long startTime= System.currentTimeMillis();
                            Object re = method.invoke(userServiceImp,args);
                            long endTime= System.currentTimeMillis();
                            System.out.println(str+ "方法执行耗时："+ (endTime-startTime)/1000.0 +"秒");
                            return re;
                        }else{
                            Object re = method.invoke(userServiceImp,args);
                            return re;
                        }
                    }
                });
        return userServiceProxy;
    }
}
