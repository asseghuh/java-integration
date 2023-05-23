package com.integration.designmode.adaptermode;

/**
 * Created by asseghuh on 2023/5/23
 * @desc: todo
 */
public class Adapter implements Player {
    VideoPlayer videoPlayer;

    public Adapter(){
        videoPlayer=new Mp4Player();
    }

    @Override
    public void play(String filename) {
        videoPlayer.playVideo(filename);
    }
}
