package com.integration.designmode.decoratormode;

/**
 * Created by asseghuh on 2023/5/30
 * @desc: todo
 */
public class PhoneAiDecorator extends PhoneDecorator{

    public PhoneAiDecorator(Phone phone) {
        super(phone);
    }
    private void addAi() {
        System.out.println("extended capacity: chatGPT");
    }

    @Override
    public void ican() {
        phone.ican();
        addAi();
    }
}
