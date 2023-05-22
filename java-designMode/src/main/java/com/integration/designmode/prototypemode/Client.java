package com.integration.designmode.prototypemode;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by shengR on 2023/5/12
 * @desc: todo
 */
public class Client {
    public static void main(String[] args) {
        //创建原型对象ClonePeople
        IdentityCard idcard=new IdentityCard("1234567890");
        ClonePeople people=new ClonePeople("KangKang",12,idcard);
        //克隆
        ClonePeople anotherPeople = (ClonePeople)people.clone();
        System.out.println(anotherPeople.toString());
        //判断克隆对象是否相等
        System.out.println("克隆对象是否相等："+ (people==anotherPeople));
        //判断子对象是否相等
        System.out.println("子对象是否相等："+(people.getIdCard()==anotherPeople.getIdCard()));

    }
}
