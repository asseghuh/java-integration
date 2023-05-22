package com.integration.designmode.abstractfactory;

public interface AbstractFactory {
    Shape getShape(String shape);
    Color getColor(String color);
}

class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shape){      
       if("square".equalsIgnoreCase(shape)){
          return new Square();
       } else if("circle".equalsIgnoreCase(shape)){
          return new Circle();
       }else{
            return null;
       }
    }
    
    @Override
    public Color getColor(String color) {
       return null;
    }
 }

 class ColorFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shape){      
        return null;
    }
    
    @Override
    public Color getColor(String color) {
        if("red".equalsIgnoreCase(color)){
            return new Red();
         } else if("blue".equalsIgnoreCase(color)){
            return new Blue();
         }else{
            return null;
         }
    }
 }