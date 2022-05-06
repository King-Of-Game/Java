/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/1 22:18
 */

package com.jack.dataStructure.arrayList;

import java.util.*;


/**
 * Java ArrayList
 * https://www.runoob.com/java/java-arraylist.html
 * ArrayList 类是一个可以动态修改的数组，与普通数组的区别就是它是没有固定大小的限制，我们可以添加或删除元素。
 * ArrayList 是一个数组队列，提供了相关的添加、删除、修改、遍历等功能。
 * 使用场景
 *      频繁访问列表中的某一个元素。
 *      只需要在列表末尾进行添加和删除元素操作。
 */
public class UseArrayList {
    private static ArrayList<String> arrayList = new ArrayList<>();
    static {
        arrayList.add("Google");
        arrayList.add("Runoob");
        arrayList.add("YaHoo");
        arrayList.add("Taobao");
        arrayList.add("Weibo");
    }




    public static void main(String[] args) {
//        demo1();
//        addElement();
//        getElement();
//        updateElement();
//        deleteElement();
//        getElementNum();
        sortElement();
    }

    private static void demo1(){
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        //第一种遍历方法使用 For-Each 遍历 List
        for (String str : list) {            //也可以改写 for(int i=0;i<list.size();i++) 这种形式
            System.out.println(str);
        }

        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for(int i=0;i<strArray.length;i++) //这里也可以改写为  for(String str:strArray) 这种形式
        {
            System.out.println(strArray[i]);
        }

        //第三种遍历 使用迭代器进行相关遍历
        Iterator<String> ite=list.iterator();
        while(ite.hasNext())//判断下一个元素之后有值
        {
            System.out.println(ite.next());
        }
    }

    /**
     * 添加元素
     */
    private static void addElement(){
        arrayList.add("Google");
        arrayList.add("Runoob");
        arrayList.add("Taobao");
        arrayList.add("Weibo");
        System.out.println(arrayList);

        for (String result : arrayList){
            System.out.println(result);
        }

    }

    /**
     * 访问元素
     */
    private static void getElement(){
        System.out.println(arrayList.get(0));

    }

    /**
     * 修改元素
     */
    private static void updateElement(){
        String oldElement = arrayList.set(0, "BaiDu");
        System.out.println("old element: " + oldElement);
        System.out.println(arrayList.get(0));
    }

    /**
     * 删除元素
     */
    private static void deleteElement(){
        System.out.println("old arrayList: " + arrayList);
        arrayList.remove(0);
        System.out.println("now arrayList" + arrayList);
    }

    /**
     * 获取元素数量
     */
    private static void getElementNum(){
        int size = arrayList.size();
        System.out.println(size);
    }

    /**
     * 排序
     */
    private static void sortElement(){
        System.out.println("old arrayList: " + arrayList);
        Collections.sort(arrayList);  // 字母排序
        System.out.println("new arrayList: " + arrayList);
    }
}
