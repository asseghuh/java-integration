package com.integration.designmode.abstractfactory;

public interface Shape {
    void draw();
}

class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("我是正方形");
    }
    
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("我是圆形");
    }
    
}
