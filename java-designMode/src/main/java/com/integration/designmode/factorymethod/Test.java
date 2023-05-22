package com.integration.designmode.factorymethod;

public class Test {
    public static void main(String[] args) {
        //生产一个Apple
        FruitFactory appFactory=new AppleFactory();
        Fruit fruit=appFactory.createFruit();
        fruit.printPrice();
    }
    
}
