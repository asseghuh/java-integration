package com.integration.designmode.chainmode;

/**
 * Created by asseghuh on 2023/6/14
 * @desc: todo
 */
public class ErrorConsole extends AbstractLogger {

    public ErrorConsole(){
        this.level = AbstractLogger.ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("[Error Console] - " + message);
    }
}
