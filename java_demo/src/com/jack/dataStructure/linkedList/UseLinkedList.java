/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/3 0:20
 */

package com.jack.dataStructure.linkedList;


import java.util.LinkedList;

/**
 * LinkedList
 * https://www.runoob.com/java/java-linkedlist.html
 * 链表（Linked list）是一种常见的基础数据结构，是一种线性表，但是并不会按线性的顺序存储数据，而是在每一个节点里存到下一个节点的地址。
 * 链表可分为单向链表和双向链表。
 *      一个单向链表包含两个值: 当前节点的值和一个指向下一个节点的链接。
 *      一个双向链表有三个整数值: 数值、向后的节点链接、向前的节点链接。
 * 与 ArrayList 区别
 *      LinkedList 的增加和删除的操作效率更高，而查找和修改的操作效率较低。
 *  使用场景
 *      需要通过循环迭代来访问列表中的某些元素。
 *      需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。
 */
public class UseLinkedList {
    private static LinkedList<String> linkedList = new LinkedList<>();
    static {
        linkedList.add("Google");
        linkedList.add("Runoob");
        linkedList.add("Taobao");
        linkedList.add("Weibo");
    }

    public static void main(String[] args) {
//        addHeadElement();
//        addTailElement();
//        delHeadElement();
//        delTailElement();
//        getHeadElement();
//        getTailElement();
        iterateElement();
    }

    /**
     * 在头部添加元素
     */
    private static void addHeadElement(){
        System.out.println("old linkedList: " + linkedList);
        linkedList.addFirst("Wiki");
        System.out.println("now linkedList: " + linkedList);
    }

    /**
     * 在尾部插入元素
     */
    private static void addTailElement(){
        System.out.println("old linkedList: " + linkedList);
        linkedList.addLast("Wiki");
        System.out.println("now linkedList: " + linkedList);
    }

    /**
     * 在头部移除元素
     */
    private static void delHeadElement(){
        System.out.println("old linkedList: " + linkedList);
        linkedList.removeFirst();
        System.out.println("now linkedList: " + linkedList);
    }

    /**
     * 在尾部移除元素
     */
    private static void delTailElement(){
        System.out.println("old linkedList: " + linkedList);
        linkedList.removeLast();
        System.out.println("now linkedList: " + linkedList);
    }

    /**
     * 获取头部元素
     */
    private static void getHeadElement(){
        System.out.println("linkedList: " + linkedList);
        String result = linkedList.getFirst();
        System.out.println("first element: " + result);
    }

    /**
     * 获取尾部元素
     */
    private static void getTailElement(){
        System.out.println("linkedList: " + linkedList);
        String result = linkedList.getLast();
        System.out.println("tail element: " + result);
    }

    /**
     * 获取链表长度（size）
     */
    private static void getLinkedListSize(){
        int size = linkedList.size();
        System.out.println("linkedList size: " + size);
    }


    /**
     * 迭代元素
     */
    private static void iterateElement(){
        for (String element : linkedList){
            System.out.println(element);
        }

        int size = linkedList.size();
        for (int i=0; i<size; i++){
            System.out.println(linkedList.get(i));
        }

    }

}
