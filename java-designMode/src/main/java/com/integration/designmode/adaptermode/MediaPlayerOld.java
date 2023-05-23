package com.integration.designmode.adaptermode;

/**
 * Created by asseghuh on 2023/5/23
 * @desc: todo
 */
public class MediaPlayerOld implements Player{
    @Override
    public void play(String filename) {
        if("mp3".equals(getFileType(filename))){
            System.out.println("播放MP3音频："+filename);
        }else{
            System.out.println("Invalid media ：format not supported");
        }
    }
}
