package com.integration.designmode.buildermode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shengR on 2023/5/8
 * @desc: todo
 */
public class ProductBuilder {
    private List<String> burgers;
    private List<String> snacks;
    private List<String> drinks;

    public ProductBuilder() {
        this.burgers = new ArrayList<>();
        this.snacks = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }

    public ProductBuilder addBurger(String burger){
        burgers.add(burger);
        return this;
    }

    public ProductBuilder addSnack(String snack){
        snacks.add(snack);
        return this;
    }

    public ProductBuilder addDrink(String drink){
        drinks.add(drink);
        return this;
    }

    public Product build(){
        return new Product(burgers,snacks,drinks);
    }
}
