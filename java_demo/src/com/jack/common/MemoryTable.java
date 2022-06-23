/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/2 0:17
 */

package com.jack.common;
import java.util.*;

public class MemoryTable {
    private final Hashtable<String,String> hashtable;
    private final String tabName;


    MemoryTable(String tabName){
        this.tabName = tabName;
        this.hashtable = new Hashtable<>();
//        System.out.println("create memory table... " + tabName);
    }

    public String getTabName(){
        return this.tabName;
    }

    public String getValue(String key){
        return this.hashtable.get(key);
    }

    public void insert(String key, String value){
        this.hashtable.put(key, value);
    }

    public void update(String key, String value){
        this.hashtable.replace(key, value);
    }


}
