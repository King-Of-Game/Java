/*
author: YiXuan
date: 2022/2/27 14:43
project: java_demo
software: IntelliJ IDEA
*/

package com.jack;

import java.util.Arrays;

public class UseArray {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
        reverse_array();
    }

    /*
    创建数组的方式1
     */
    static void demo1(){
        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);
    }

    /*
    创建数组方式2
     */
    static void demo2(){
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // 打印所有数组元素
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);
        // 查找最大元素
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        System.out.println("Max is " + max);
    }

    /*
    使用 for-each 遍历数组
     */
    static void demo3(){
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // 打印所有数组元素
        for (double element: myList){
            System.out.println(element);
        }
    }

    /*
    反转数组并返回
     */
    static int[] reverse_array(){
        int[] list = {1,2,3};
        System.out.println("before reverse: " + Arrays.toString(list));
        int length = list.length;
        int[] result = new int[length];
        for (int i = 0, j = length-1; i < length; i++, j--){
            result[j] = list[i];
        }
        System.out.println("after reverse: " + Arrays.toString(result));
        return result;
    }

    /*
    多维数组的动态初始化（以二维数组为例）
     */
    static void multidimensional_array(){
         // 直接为每一维分配空间，格式如下：
         // 二维数组 a 可以看成一个两行三列的数组。
         int[][] a = new int[2][3];

         // 从最高维开始，分别为每一维分配空间
        String[][] s = new String[2][];
        s[0] = new String[2];
        s[1] = new String[3];
        s[0][0] = new String("Good");
        s[0][1] = new String("Luck");
        s[1][0] = new String("to");
        s[1][1] = new String("you");
        s[1][2] = new String("!");
    }
}
