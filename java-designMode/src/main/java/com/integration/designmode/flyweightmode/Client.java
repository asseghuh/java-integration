package com.integration.designmode.flyweightmode;

/**
 * Created by asseghuh on 2023/6/6
 * @desc: todo
 */
public class Client {
    private static final String colors[] = { "Red", "Green", "Blue" };

    public static void main(String[] args) {
        for(int i=0; i < 10; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.draw(getRandomX(),getRandomY());
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
