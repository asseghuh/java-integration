package com.integration.designmode.facadePatern;

/**
 * Created by asseghuh on 2023/5/31
 * @desc:  碰碰车项目
 */
public class BumperCar implements ChildrenPlayItem {
    private int price=88;
    @Override
    public int ticket() {
        System.out.println("购买碰碰车项目票,票价"+price);
        return price;
    }

    @Override
    public void play() {
        System.out.println("玩碰碰车咯...");
    }
}
