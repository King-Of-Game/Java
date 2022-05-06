/*
author: YiXuan
date: 2022/3/6 10:32
project: java_demo
software: IntelliJ IDEA
*/

package com.jack;

public class UseMethod {
    public static void main(String[] args) {
        Double maxDouble = max(1.75, 3.14);
        int maxInt = max(1, 3);
        System.out.printf("%.1f, %d", maxDouble, maxInt);
    }

    /*
    方法重载
     */
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
}
