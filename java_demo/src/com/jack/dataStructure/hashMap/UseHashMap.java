/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/3 22:43
 */

package com.jack.dataStructure.hashMap;


import java.util.HashMap;

/**
 * HashMap
 * https://www.runoob.com/java/java-hashmap.html
 * HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
 * HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。
 * HashMap 是无序的，即不会记录插入的顺序。
 * HashMap 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。
 */
public class UseHashMap {
    private static HashMap<Integer, String> hashMap = new HashMap<>();
    static {
        hashMap.put(1, "Google");
        hashMap.put(2, "Runoob");
        hashMap.put(3, "Taobao");
        hashMap.put(4, "Zhihu");
    }

    public static void main(String[] args) {
//        createHashMap();
//        getElement();
//        delElement();
//        clearAll();
//        getSize();
        iterateElement();
    }

    /**
     * 创建一个字符串（String）类型的 key 和字符串（String）类型的 value
     */
    private static void createHashMap(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("one", "Google");
        hashMap.put("two", "Runoob");
        hashMap.put("three", "Taobao");
        hashMap.put("four", "Zhihu");
        System.out.println(hashMap);
    }

    /**
     * 访问元素
     */
    private static void getElement(){
        System.out.println(hashMap);
        System.out.println(hashMap.get(3));
    }

    /**
     * 删除元素
     */
    private static void delElement(){
        System.out.println("old HashMap: " + hashMap);
        hashMap.remove(1);
        System.out.println("new HashMap: " + hashMap);
    }

    /**
     * 删除所有键值对
     */
    private static void clearAll(){
        System.out.println("old HashMap: " + hashMap);
        hashMap.clear();
        System.out.println("new HashMap: " + hashMap);
    }

    /**
     * 计算 HashMap 中的元素数量
     */
    private static void getSize(){
        System.out.println("HashMap: " + hashMap);
        int size = hashMap.size();
        System.out.println("HashMap size: " + size);
    }

    /**
     * 迭代元素
     */
    private static void iterateElement(){
        System.out.println("HashMap: " + hashMap);

        // 迭代所有 key-value
        for (int key : hashMap.keySet()){
            System.out.printf("%d: %s\n", key, hashMap.get(key));
        }

        // 迭代所有 value
        for (String value : hashMap.values()){
            System.out.printf("value: %s\n", value);
        }
    }
}
