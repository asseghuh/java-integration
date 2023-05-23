package com.integration.designmode.adaptermode;

/**
 * Created by asseghuh on 2023/5/23
 * @desc: todo
 */
public class Mp4Player implements VideoPlayer {
    @Override
    public void playVideo(String filename) {
        System.out.println("播放MP4视频："+filename);
    }
}
