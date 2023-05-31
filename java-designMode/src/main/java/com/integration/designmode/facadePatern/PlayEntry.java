package com.integration.designmode.facadePatern;

import jdk.nashorn.internal.ir.Block;

/**
 * Created by asseghuh on 2023/5/31
 * @desc: todo
 */
public class PlayEntry {

    private ChildrenPlayItem blockPark; //积木乐园
    private ChildrenPlayItem bumperCar; //碰碰车
    private ChildrenPlayItem carousel; //旋转木马

    private int charge;

    public PlayEntry() {
        this.blockPark = new BlockPark();
        this.bumperCar = new BumperCar();
        this.carousel = new Carousel();
        this.charge=0;
    }
    //玩积木
    public void playBlockPark(){
        int itemPrice=blockPark.ticket();
        blockPark.play();
        charge+=itemPrice;
    }
    //玩碰碰车
    public void playBumperCar(){
        int itemPrice=bumperCar.ticket();
        bumperCar.play();
        charge+=itemPrice;
    }
    //玩旋转木马
    public void playCarousel(){
        int itemPrice=carousel.ticket();
        carousel.play();
        charge+=itemPrice;
    }
    //计费
    public void pay(){
        System.out.println("一共要支付的项目票价总额为："+charge);
    }

}
