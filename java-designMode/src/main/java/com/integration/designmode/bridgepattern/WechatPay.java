package com.integration.designmode.bridgepattern;

/**
 * Created by asseghuh on 2023/5/24
 * @desc: todo
 */
public class WechatPay extends Pay{

    public WechatPay(PayMode paymode) {
        super(paymode);
    }

    @Override
    public void pay() {
        System.out.println("微信支付:");
        paymode.paymode();
    }
}
