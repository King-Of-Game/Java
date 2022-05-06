/*
author: YiXuan
date: 2022/2/27 13:07
project: java_demo
software: IntelliJ IDEA
*/

package com.jack;


/*
使用场景：当对字符串进行多次修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
 */
public class UseStringBuffer {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    /*
    StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类
     */
    static void demo1(){
        StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob..");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        // 从索引8的位置插入字符串
        sb.insert(8, "Java");
        System.out.println(sb);
        // 删除索引5~7的字符串
        sb.delete(5,8);
        System.out.println(sb);
    }

    /*
    在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类
     */
    static void demo2(){
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
    }

}
