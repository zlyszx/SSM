package com.spring;

import com.spring.proxy.BigStar;
import com.spring.proxy.ProxyUtil;
import com.spring.proxy.Star;
import org.junit.Test;

public class TestProxy {

    @Test
    public void test() {
        BigStar bigStar = new BigStar("高圆圆");
        Star proxy = ProxyUtil.createProxy(bigStar);
        String s = proxy.sing("勇气");
        System.out.println(s);

        proxy.dance();
    }
}
