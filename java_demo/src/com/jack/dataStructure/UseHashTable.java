/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/1 19:32
 */

package com.jack.dataStructure;
import java.util.*;


/**
 * Java Hashtable 类
 * https://www.runoob.com/java/java-hashTable-class.html
 * Hashtable是原始的java.util的一部分， 是一个Dictionary具体的实现。
 * Hashtable现在集成到了集合框架中。它和HashMap类很相似，但是它支持同步。
 * 像HashMap一样，Hashtable在哈希表中存储键/值对。当使用一个哈希表，要指定用作键的对象，以及要链接到该键的值。
 */
public class UseHashTable {
    public static void main(String[] args) {
        // Create a hash map
        Hashtable<String,Double> balance = new Hashtable<>();
        Enumeration names;
        String str;
        double bal;

        balance.put("Zara", 3434.34);
        balance.put("Mahnaz", 123.22);
        balance.put("Ayan", 1378.00);
        balance.put("Daisy", 99.22);
        balance.put("Qadir", -19.08);

        // Show all balances in hash table.
        names = balance.keys();
        while(names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " +
                    balance.get(str));
        }

        System.out.println("Deposit 1,000 into Zara's account");
        bal = balance.get("Zara");
        balance.put("Zara", bal + 1000);
        System.out.println("Zara's new balance: " + balance.get("Zara"));
    }
}
