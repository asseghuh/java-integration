package com.integration.designmode.chainmode;

/**
 * Created by asseghuh on 2023/6/14
 * @desc: todo
 */
public class WarnConsole extends AbstractLogger {

    public WarnConsole(){
        this.level = AbstractLogger.WARN;
    }

    @Override
    protected void write(String message) {
        System.out.println("[Warn Console] - " + message);
    }
}
