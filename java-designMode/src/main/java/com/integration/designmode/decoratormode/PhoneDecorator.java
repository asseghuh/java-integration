package com.integration.designmode.decoratormode;

/**
 * Created by asseghuh on 2023/5/30
 * @desc: todo
 */
public abstract class PhoneDecorator implements Phone{
    protected Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }
    public void ican(){
        phone.ican();
    }

}
