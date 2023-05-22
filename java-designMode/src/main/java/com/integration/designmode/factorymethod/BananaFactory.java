package com.integration.designmode.factorymethod;

public class BananaFactory implements FruitFactory{

    @Override
    public Fruit createFruit() {
        return new Banana();
    }
    
}
