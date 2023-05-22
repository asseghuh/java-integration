package com.integration.designmode.abstractfactory;

public class FactoryProducer {
    //工厂创造器
    public static AbstractFactory createFactory(String choice){
        if("shape".equalsIgnoreCase(choice)){
           return new ShapeFactory();
        } else if("color".equalsIgnoreCase(choice)){
           return new ColorFactory();
        }else{
            return null;
        }
     }
}
