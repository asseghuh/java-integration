package com.integration.designmode.compositemode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asseghuh on 2023/5/26
 * @desc: todo
 */
public class Leader implements Employee{
    //领导姓名
    private String name;
    //下属集合
    private List<Employee> subordinates;

    public Leader(String name) {
        this.name = name;
        this.subordinates= new ArrayList<>();
    }

    @Override
    public void add(Employee e) {
        subordinates.add(e);
    }

    @Override
    public void remove(Employee e) {
        subordinates.remove(e);
    }

    @Override
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public void info() {
        System.out.println("领导-"+name);
        for(Employee e:subordinates){
            e.info();
        }
    }
}
