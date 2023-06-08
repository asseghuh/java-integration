package com.integration.designmode.flyweightmode;

import java.util.HashMap;

/**
 * Created by asseghuh on 2023/6/6
 * @desc: todo
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);
        System.out.println("从缓存中获取"+color+"色的圆");

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("缓存中不存在，先创建"+color+"色的圆，并放入缓存中");
        }
        return circle;
    }
}
