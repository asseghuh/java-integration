package com.integration.designmode.compositemode;

import java.util.List;

/**
 * Created by asseghuh on 2023/5/26
 * @desc: todo
 */
public interface Employee {
    //添加下属员工
    void add(Employee e);
    //移除下属员工
    void remove(Employee e);
    //获取所有下属员工
    List<Employee> getSubordinates();
    //打印员工信息
    void info();
}
