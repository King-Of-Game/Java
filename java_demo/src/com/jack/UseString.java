/*
author: YiXuan
date: 2022/2/26 20:05
project: java_demo
software: IntelliJ IDEA
*/

package com.jack;

public class UseString {
    public static void main(String[] args) {
        demo1();
//        demo2();
//        demo3();
//        demo4();
    }

    /*
    String 创建的字符串存储在公共池中，而 new 创建的字符串对象在堆上
    */
    static void demo1() {

        String s1 = "Runoob";              // String 直接创建
        String s2 = "Runoob";              // String 直接创建
        String s3 = s1;                    // 相同引用
        String s4 = new String("Runoob");   // String 对象创建
        String s5 = new String("Runoob");   // String 对象创建
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }

    /*
    通过 char字符数组 初始化字符串对象
    */
    static void demo2() {
        char[] charList = {'a', 'b', 'c'};
        String str1 = new String(charList);
        System.out.println(str1);

    }

    /*
    获取字符串长度
    */
    static void demo3() {
        String str1 = "www.runoob.com";
        int length = str1.length();
        System.out.printf("%s: length -> %d", str1, length);
    }

    /*
    连接两个字符串
    */
    static void demo4() {
        String str1 = "hello";
        String str2 = str1.concat(" world!");
        System.out.println(str2);
    }
}
