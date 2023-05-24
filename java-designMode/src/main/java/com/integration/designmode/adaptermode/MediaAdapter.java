package com.integration.designmode.adaptermode;

/**
 * Created by asseghuh on 2023/5/23
 * @desc: todo
 */
public class MediaAdapter implements Player {
    VideoPlayer videoPlayer;

    public MediaAdapter(){
        videoPlayer=new Mp4Player();
    }

    @Override
    public void play(String filename) {
        videoPlayer.playVideo(filename);
    }
}
