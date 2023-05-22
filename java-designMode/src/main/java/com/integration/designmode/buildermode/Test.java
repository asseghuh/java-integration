package com.integration.designmode.buildermode;

/**
 * Created by shengR on 2023/5/8
 * @desc: todo
 */
public class Test {
    public static void main(String[] args) {
        Product product=Product.builder()
                .addBurger("奥尔良汉堡")
                .addBurger("巧克力汉堡")
                .addSnack("薯条")
                .addDrink("中杯可乐")
                .build();
        product.showProduct();

    }
}
