package com.integration.designmode.chainmode;

/**
 * Created by asseghuh on 2023/6/14
 * @desc: todo
 */
public class InfoConsole extends AbstractLogger {

    public InfoConsole(){
        this.level = AbstractLogger.INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("[Info Console] - " + message);
    }
}
