package com.integration.designmode.adaptermode;

/**
 * Created by asseghuh on 2023/5/23
 * @desc: todo
 */
public class MediaPlayer implements Player {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String filename) {
        if("mp3".equals(getFileType(filename))){
            System.out.println("播放MP3音频："+filename);
        }else if("mp4".equals(getFileType(filename))){
            mediaAdapter =new MediaAdapter();
            mediaAdapter.play(filename);
        }else{
            System.out.println("Invalid media ：format not supported");
        }
    }
}
