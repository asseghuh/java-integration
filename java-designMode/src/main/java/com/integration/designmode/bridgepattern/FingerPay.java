package com.integration.designmode.bridgepattern;

/**
 * Created by asseghuh on 2023/5/24
 * @desc: todo
 */
public class FingerPay implements PayMode{
    @Override
    public void paymode() {
        System.out.println("--用指纹支付");
    }
}
