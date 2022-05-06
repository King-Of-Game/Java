/*
author: YiXuan
date: 2022/2/26 19:27
project: java_demo
software: IntelliJ IDEA
*/

package com.jack;

public class UseMath {
    public static void main(String[] args) {
//        commonly_fun();
        commonly_rounding();
    }

    /*
    Math对象常用函数
    */
    static void commonly_fun(){
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));
        System.out.println("1的反正切值： " + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);
    }

    /*
    Math 的 floor,round 和 ceil 方法实例比较

    */
    static void commonly_rounding(){
        double[] nums = { 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };
        for (double num : nums) {
            System.out.println("Math.floor(" + num + ")=" + Math.floor(num));
            System.out.println("Math.round(" + num + ")=" + Math.round(num));
            System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));
        }
    }
}
