package com.integration.designmode.decoratormode;

/**
 * Created by asseghuh on 2023/5/30
 * @desc: todo
 */
public class Phone5GDecorator extends PhoneDecorator {

    public Phone5GDecorator(Phone phone) {
        super(phone);
    }

    private void add5G() {
        System.out.println("extended capacity: 5G");
    }

    @Override
    public void ican() {
        phone.ican();
        add5G();
    }
}
