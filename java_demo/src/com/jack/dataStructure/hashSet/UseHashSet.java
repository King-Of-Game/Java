/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/3 0:48
 */

package com.jack.dataStructure.hashSet;


import java.util.HashSet;

/**
 * HashSet
 * https://www.runoob.com/java/java-hashset.html
 * HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。
 * HashSet 允许有 null 值。
 * HashSet 是无序的，即不会记录插入的顺序。
 * HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。
 * HashSet 实现了 Set 接口。
 */

public class UseHashSet {
    private static HashSet<String> hashSet = new HashSet<>();
    static {
        hashSet.add("Google");
        hashSet.add("Runoob");
        hashSet.add("Taobao");
        hashSet.add("Zhihu");
    }


    public static void main(String[] args) {
//        addElement();
//        isExistElement();
//        delElement();
//        clearAllElement();
//        getHashSetSize();
        iterateElement();
    }

    /**
     * 添加元素
     */
    private static void addElement(){
        System.out.println("old HashSet: " + hashSet);
        hashSet.add("BaiDu");
        hashSet.add("Runoob");  //重复元素不会添加
        System.out.println("now HashSet: " + hashSet);
    }

    /**
     * 判断元素是否存在
     */
    private static void isExistElement(){
        boolean result = hashSet.contains("Taobao");
        System.out.println(result);
    }

    /**
     * 删除元素
     */
    private static void delElement(){
        System.out.println("old HashSet: " + hashSet);
        hashSet.remove("Taobao");
        System.out.println("old HashSet: " + hashSet);
    }


    /**
     * 清空元素
     */
    private static void clearAllElement(){
        System.out.println("old HashSet: " + hashSet);
        hashSet.clear();
        System.out.println("old HashSet: " + hashSet);
    }

    /**
     * 统计元素数量
     */
    private static void getHashSetSize(){
        System.out.println("HashSet: " + hashSet);
        int size = hashSet.size();
        System.out.println("HashSet size: "+ size);
    }

    /**
     * 迭代元素
     */
    private static void iterateElement(){
        System.out.println("HashSet: " + hashSet);

        for (String element : hashSet){
            System.out.println(element);
        }
    }
}
