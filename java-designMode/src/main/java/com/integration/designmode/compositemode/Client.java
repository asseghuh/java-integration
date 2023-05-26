package com.integration.designmode.compositemode;

/**
 * Created by asseghuh on 2023/5/26
 * @desc: todo
 */
public class Client {
    public static void main(String[] args) {
        Employee ceo=new Leader("ceo");
        Employee devLeader=new Leader("devLeader");
        Employee fatLeader=new Leader("fatLeader");
        ceo.add(devLeader);
        ceo.add(fatLeader);

        Employee devWorker01=new Worker("devWorker01");
        Employee devWorker02=new Worker("devWorder02");
        devLeader.add(devWorker01);
        devLeader.add(devWorker02);

        Employee fatWorker01=new Worker("fatWorker01");
        Employee fatWorker02=new Worker("fatWorder02");
        fatLeader.add(fatWorker01);
        fatLeader.add(fatWorker02);

        //打印整个公司架构
        ceo.info();
        System.out.println();

        //打印开发部门架构
        devLeader.info();
        System.out.println();

        //测试部门开除员工fatWorker01后的人员结构
        fatLeader.remove(fatWorker01);
        fatLeader.info();

    }
}
