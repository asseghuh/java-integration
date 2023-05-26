package com.integration.designmode.bridgepattern;

/**
 * Created by asseghuh on 2023/5/24
 * @desc: todo
 */
public class AliPay extends Pay{

    public AliPay(PayMode paymode) {
        super(paymode);
    }

    @Override
    public void pay() {
        System.out.println("支付宝支付:");
        paymode.paymode();
    }
}
