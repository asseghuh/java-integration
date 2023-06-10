package com.integration.designmode.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by asseghuh on 2023/6/9
 * @desc: jdk动态代理--基于接口的代理
 */
public class JDKProxyFactory implements InvocationHandler {

    //需要被代理的对象
    private Object object;

    public JDKProxyFactory(Object object) {
        this.object = object;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),//当前线程的上下文ClassLoader
                object.getClass().getInterfaces(), //代理需要实现的接口
                this); // 处理器自身
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;

        if ("loadVideo".equals(method.getName())) {
            result=method.invoke(object, args);
        }

        if ("playVideo".equals(method.getName())) {
            System.out.println("前置增强");
            result=method.invoke(object, args);
            System.out.println("后置增强");
        }
        return result;
    }
}
