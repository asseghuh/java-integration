package com.integration.designmode.adaptermode;

/**
 * Created by asseghuh on 2023/5/23
 * @desc: todo
 */
public interface Player {
    void play(String finename);

    default String getFileType(String filename){
        if(filename.endsWith(".mp3")){
            return "mp3";
        }else if(filename.endsWith(".mp4")){
            return "mp4";
        }else{
            return "unknown";
        }
    }
}
