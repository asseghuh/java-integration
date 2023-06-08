package com.integration.designmode.flyweightmode;

/**
 * Created by asseghuh on 2023/6/6
 * @desc: todo
 */
public class Circle implements Shape{
    private String color;
    private int radius;

    public Circle(String color){
        this.color = color;
        this.radius = 10;
    }

    @Override
    public void draw(int x,int y) {
        System.out.println("--在坐标("+x+","+y+")处画圆： [颜色 : " + color
                +", 半径 :" + radius+"]");
    }

}
