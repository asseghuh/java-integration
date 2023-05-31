package com.integration.designmode.facadePatern;

/**
 * Created by asseghuh on 2023/5/31
 * @desc: todo
 */
public class Client {
    public static void main(String[] args) {
        PlayEntry entry=new PlayEntry();
        entry.playBlockPark();
        entry.playBumperCar();
        entry.playCarousel();
        entry.pay();
    }
}
