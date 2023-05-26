package com.integration.designmode.bridgepattern;

/**
 * Created by asseghuh on 2023/5/24
 * @desc: todo
 */
public class Client {
    public static void main(String[] args) {
        Pay wechatPay1=new WechatPay(new PasswordPay());
        Pay wechatPay2=new WechatPay(new FingerPay());
        wechatPay1.pay();
        wechatPay2.pay();

        System.out.println();

        Pay aliPay1=new AliPay(new PasswordPay());
        Pay aliPay2=new AliPay(new FingerPay());
        aliPay1.pay();
        aliPay2.pay();
    }
}
