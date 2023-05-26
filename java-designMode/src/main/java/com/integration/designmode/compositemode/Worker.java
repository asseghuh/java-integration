package com.integration.designmode.compositemode;

import java.util.List;

/**
 * Created by asseghuh on 2023/5/26
 * @desc: todo
 */
public class Worker implements Employee{
    //员工姓名
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void add(Employee e) {
    }

    @Override
    public void remove(Employee e) {
    }

    @Override
    public List<Employee> getSubordinates() {
        return null;
    }

    @Override
    public void info() {
        System.out.println("员工-"+name);
    }
}
