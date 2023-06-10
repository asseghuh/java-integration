package com.integration.designmode.proxypattern;



/**
 * Created by asseghuh on 2023/5/23
 * @desc: 视频播放器
 */
public class VPlayer implements Player {
    @Override
    public void loadVideo(String filename) {
        System.out.println("加载MP4视频文件："+filename);
    }

    @Override
    public void playVideo(String filename) {
        System.out.println("播放MP4视频："+filename);
    }
}
