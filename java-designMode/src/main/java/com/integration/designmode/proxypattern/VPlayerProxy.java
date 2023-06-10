package com.integration.designmode.proxypattern;

/**
 * Created by asseghuh on 2023/6/8
 * @desc: todo
 */
public class VPlayerProxy implements Player {

    private Player player;

    public VPlayerProxy(Player player) {
        this.player = player;
    }

    @Override
    public void loadVideo(String filename) {
        player.loadVideo(filename);
    }

    @Override
    public void playVideo(String filename) {
        player.playVideo(filename);
    }
}
