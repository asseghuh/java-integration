package com.integration.designmode.adaptermode;

/**
 * Created by asseghuh on 2023/5/23
 * @desc: todo
 */
public class Client {
    public static void main(String[] args) {
        Player play=new MediaPlayerOld();
        play.play("aaa.mp3");
        play.play("bbb.mp4");
        play.play("ccc.mp5");
    }
}
