package com.integration.designmode.proxypattern;

import java.lang.reflect.Proxy;

/**
 * Created by asseghuh on 2023/6/10
 * @desc: todo
 */
public class Client3 {
    public static void main(String[] args) {
        APlayer aplayer=new APlayer();
        APlayer proxy = new CglibProxyFactory().getProxy(aplayer.getClass());
        //验证代理类的父类
        System.out.println("代理类的父类："+proxy.getClass().getSuperclass().getSimpleName());
        System.out.println();

        proxy.loadAudio("荷塘月色.mp3");
        proxy.playAudio("荷塘月色.mp3");
    }
}
