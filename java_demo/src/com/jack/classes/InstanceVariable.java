/*
author: YiXuan
date: 2022/2/20 18:42
project: java_demo
software: IntelliJ IDEA
*/

package com.jack.classes;

public class InstanceVariable {
    public String name;
    // 私有变量，仅在该类可见
    private double salary;
    //在构造器中对name赋值
    public InstanceVariable (String name){
        this.name = name;
    }
    //设定salary的值
    public void setSalary(double empSal){
        this.salary = empSal;
    }
    // 打印信息
    public void printInfo() {
        System.out.println("名字 : " + name);
        System.out.println("薪水 : " + salary);
    }
}
