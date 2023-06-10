package com.integration.designmode.proxypattern;

/**
 * Created by asseghuh on 2023/5/23
 * @desc: 视频播放器接口
 */
public interface Player {
    void loadVideo(String filename);
    void playVideo(String filename);
}
