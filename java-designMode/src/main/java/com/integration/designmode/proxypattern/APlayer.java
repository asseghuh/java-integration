package com.integration.designmode.proxypattern;

/**
 * Created by asseghuh on 2023/6/10
 * @desc: 音频播放器
 */
public class APlayer {
    public void loadAudio(String filename) {
        System.out.println("加载MP3音频文件："+filename);
    }

    public void playAudio(String filename) {
        System.out.println("播放MP3："+filename);
    }
}
