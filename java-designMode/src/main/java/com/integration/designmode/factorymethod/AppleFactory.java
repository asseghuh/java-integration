package com.integration.designmode.factorymethod;

public class AppleFactory implements FruitFactory{

    @Override
    public Fruit createFruit() {
        return new Apple();
    }
    
}
