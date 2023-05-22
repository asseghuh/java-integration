package com.integration.designmode.abstractfactory;

public interface Color {
    void fill();
}

class Red implements Color{
    @Override
    public void fill() {
        System.out.println("我是红色");
    }
    
}

class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("我是蓝色");
    }
    
}
