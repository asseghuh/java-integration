package com.integration.designmode.abstractfactory;

public class Test {
    public static void main(String[] args) {
        //测试形状工厂
        AbstractFactory absFactory01=FactoryProducer.createFactory("shape");
        absFactory01.getShape("circle").draw();

        //测试颜色工厂
        AbstractFactory absFactory02=FactoryProducer.createFactory("color");
        absFactory02.getColor("red").fill();

        //不使用工厂创造器，直接new的形式
        AbstractFactory absFactory03=new ColorFactory();
        absFactory03.getColor("blue").fill();

    }
}
