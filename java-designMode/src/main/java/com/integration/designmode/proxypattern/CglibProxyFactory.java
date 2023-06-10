package com.integration.designmode.proxypattern;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by asseghuh on 2023/6/10
 * @desc: CGLIB动态代理--cglib是通过继承原先的目标角色生成代理类，是基于继承的代理
 */
public class CglibProxyFactory implements MethodInterceptor {

    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> clazz) {
        Enhancer en = new Enhancer();
        //设置代理的父类
        en.setSuperclass(clazz);
        //设置方法回调
        en.setCallback(this);
        //创建代理实例
        return (T)en.create();
    }

    @Override
    //参数中的object是目标对象，method和args是目标对象的方法和参数，methodProxy是方法代理
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = null;

        if ("loadAudio".equals(method.getName())) {
            //通过继承的方法实现代理，因此这里调用invokeSuper
            result = methodProxy.invokeSuper(object, args);
        }
        if ("playAudio".equals(method.getName())) {
            result = methodProxy.invokeSuper(object, args);
        }
        return result;
    }
}
