package com.integration.designmode.decoratormode;

/**
 * Created by asseghuh on 2023/5/30
 * @desc: todo
 */
public class Client {
    public static void main(String[] args) {
        //以华为手机为例进行功能扩展
        System.out.println("华为手机：");
        Phone huawei=new HuaWeiPhone();
        huawei.ican();
        System.out.println();

        System.out.println("华为5G手机：");
        PhoneDecorator huawei5G=new Phone5GDecorator(new HuaWeiPhone());
        huawei5G.ican();
        System.out.println();

        System.out.println("集成ChatGPT的华为5G手机：");
        PhoneDecorator huaWeiAi=new PhoneAiDecorator(huawei5G);
        huaWeiAi.ican();

    }
}
