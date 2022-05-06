/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/4 22:35
 */

package com.jack.dataStructure.iterator;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Java Iterator（迭代器）
 * https://www.runoob.com/java/java-iterator.html
 * Java Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法，可用于迭代 ArrayList 和 HashSet 等集合。
 * Iterator 是 Java 迭代器最简单的实现，ListIterator 是 Collection API 中的接口， 它扩展了 Iterator 接口。
 */
public class UseIterator {
    private static ArrayList<String> arrayList = new ArrayList<>();
    static {
        arrayList.add("Google");
        arrayList.add("Runoob");
        arrayList.add("Taobao");
        arrayList.add("Zhihu");
    }

    public static void main(String[] args) {
//        getIterator();
//        iterateElement();
        delElement();
    }


    /**
     * 获取迭代器
     */
    private static void getIterator(){
        System.out.println(arrayList);
        Iterator<String> iterator = arrayList.iterator();
        // 输出集合中的第一个元素
        System.out.println(iterator.next());
    }


    /**
     * 循环打印迭代器中的元素
     */
    private static void iterateElement(){
        System.out.println(arrayList);
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * 从迭代器删除元数
     */
    private static void delElement(){
        System.out.println("old arrayList: " + arrayList);

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            if (element.equals("Taobao")){
                iterator.remove();
            }
        }
        System.out.println("new arrayList: " + arrayList);

    }

}
