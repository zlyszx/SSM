package com.spring;

import com.spring.proxy.Calculator;
import com.spring.proxy.CalculatorImpl;
import com.spring.proxy.CalculatorStaticProxy;
import org.junit.Test;

public class ProxyStaticTest {

    @Test
    public void testProxy() {

        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        System.out.println(proxy.add(1,2));
        System.out.println(proxy.sub(1,2));
        System.out.println(proxy.mul(1,2));
        System.out.println(proxy.div(1,2));

    }
}
