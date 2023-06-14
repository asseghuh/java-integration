package com.integration.designmode.chainmode;

import java.util.logging.Logger;

/**
 * Created by asseghuh on 2023/6/14
 * @desc: todo
 */
public class Client {
    public static void main(String[] args) {
        //构建责任链
        AbstractLogger errorConsole=new ErrorConsole();
        AbstractLogger warnConsole=new WarnConsole();
        AbstractLogger infoConsole=new InfoConsole();
        errorConsole.setNext(warnConsole);
        warnConsole.setNext(infoConsole);

        //统一由责任链的链头接收请求，分别测试三种类型的信息
        errorConsole.handleMessage(AbstractLogger.INFO, "INFO:正常信息");
        System.out.println();

        errorConsole.handleMessage(AbstractLogger.WARN, "WARN:警告信息");
        System.out.println();

        errorConsole.handleMessage(AbstractLogger.ERROR, "ERROR:错误消息");

    }
}
