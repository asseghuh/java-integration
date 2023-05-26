package com.integration.designmode.bridgepattern;

/**
 * Created by asseghuh on 2023/5/24
 * @desc: todo
 */
public abstract class Pay {
    protected PayMode paymode;

    public Pay(PayMode paymode) {
        this.paymode = paymode;
    }

    public abstract void pay();
}
