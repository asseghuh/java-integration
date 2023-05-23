package com.integration.designmode.adaptermode;

/**
 * Created by asseghuh on 2023/5/23
 * @desc: todo
 */
public class MediaPlayer implements Player {

    Adapter adapter;

    @Override
    public void play(String filename) {
        if("mp3".equals(checkFileType(filename))){
            System.out.println("播放MP3音频："+filename);
        }else if("mp4".equals(checkFileType(filename))){
            adapter=new Adapter();
            adapter.play(filename);
        }else{
            System.out.println("Invalid media ：format not supported");
        }
    }

    public String checkFileType(String filename){
        if(filename.endsWith(".mp3")){
            return "mp3";
        }else if(filename.endsWith(".mp4")){
            return "mp4";
        }else{
            return "unknown";
        }
    }
}
