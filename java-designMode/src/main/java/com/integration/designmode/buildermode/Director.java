package com.integration.designmode.buildermode;

/**
 * Created by shengR on 2023/5/8
 * @desc: todo
 */
public class Director {

    //创建单人套餐
    public Product createSingleProducts(){
        return Product.builder()
                .addBurger("奥尔良汉堡")
                .addSnack("薯条")
                .addDrink("中杯可乐")
                .build();
    }

    //创建双人套餐
    public Product createDoubleProducts(){
        return Product.builder()
                .addBurger("奥尔良汉堡").addBurger("巧克力汉堡")
                .addSnack("薯条").addSnack("蛋黄派")
                .addDrink("中杯可乐").addDrink("热牛奶")
                .build();
    }


}
