package com.integration.designmode.facadePatern;

/**
 * Created by asseghuh on 2023/5/31
 * @desc: 旋转木马
 */
public class Carousel implements ChildrenPlayItem {
    private int price=39;
    @Override
    public int ticket() {
        System.out.println("购买旋转木马项目票,票价"+price);
        return price;
    }

    @Override
    public void play() {
        System.out.println("玩旋转木马咯...");
    }
}
