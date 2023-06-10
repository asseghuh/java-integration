package com.integration.designmode.proxypattern;

/**
 * Created by asseghuh on 2023/6/8
 * @desc: todo
 */
public class Client1 {
    public static void main(String[] args) {
        //直连方式
        Player vplay=new VPlayer();
        vplay.playVideo("aaa.mp4");
        System.out.println();

        //代理方式
        Player proxy=new VPlayerProxy(vplay);
        proxy.loadVideo("aaa.mp4");
        proxy.playVideo("aaa.mp4");

    }
}
