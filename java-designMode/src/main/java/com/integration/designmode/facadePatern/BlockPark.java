package com.integration.designmode.facadePatern;

/**
 * Created by asseghuh on 2023/5/31
 * @desc: 积木乐园
 */
public class BlockPark implements ChildrenPlayItem {
    private int price=12;
    @Override
    public int ticket() {
        System.out.println("购买积木乐园项目票,票价"+price);
        return price;
    }

    @Override
    public void play() {
        System.out.println("堆积木咯...");
    }
}
