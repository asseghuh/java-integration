package com.integration.designmode.factorymethod;

public class StaticFruitFactory {

    public static Fruit createFruit(String type) {
        if(type.equalsIgnoreCase("apple")) {
            return new Apple();
        } else if(type.equalsIgnoreCase("banana")) {
            return new Banana();
        } else {
            System.out.println("哎呀！找不到相应的实例化类啦！");
            return null;
        }
    }

    public static void main(String[] args) {
        Fruit fruit=StaticFruitFactory.createFruit("banana");
        fruit.printPrice();
    }
}
