package com.integration.designmode.buildermode;

import java.util.List;

/**
 * Created by shengR on 2023/5/8
 * @desc: todo
 */
public class Product {
    private List<String> burgers;
    private List<String> snacks;
    private List<String> drinks;

    public Product(List<String> burgers, List<String> snacks, List<String> drinks) {
        this.burgers = burgers;
        this.snacks = snacks;
        this.drinks = drinks;
    }

    public static ProductBuilder builder(){
        return new ProductBuilder();
    }

    public void showProduct() {
        int i=burgers.size();
        int j=snacks.size();
        int k=drinks.size();
        String res="已经创建了一份套餐，该套餐包含："+"\n"
                +i+"个汉堡，"+burgers.toString()+"\n"
                +j+"份小食，"+snacks.toString()+"\n"
                +k+"瓶饮料，"+drinks.toString();
        System.out.println(res);
    }
}
