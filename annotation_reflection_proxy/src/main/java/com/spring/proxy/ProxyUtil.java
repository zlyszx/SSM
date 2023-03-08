package com.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {

    public static Star createProxy(BigStar bigStar) {
        /**
         * ClassLoader loader 用于指定一个类加载器
         * Class<?>[] interfaces 指定生成的代理长什么样子，也就是有哪些方法
         * InvocationHandler h 指定生成的代理对象要干什么事情
         */

        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class}, new InvocationHandler() {
                    @Override //回调方法
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("sing")) {
                            System.out.println("准备话筒，收钱20万");
                            return method.invoke(bigStar,args);
                        }else if (method.getName().equals("dance")){
                            System.out.println("准备场地，收钱100万");
                            return method.invoke(bigStar,args);
                        }else {
                            return method.invoke(bigStar,args);
                        }
                    }
                });
        return starProxy;
    }
}
