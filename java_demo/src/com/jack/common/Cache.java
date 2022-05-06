/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/2 0:27
 */

package com.jack.common;



import java.util.HashMap;
import java.util.Map;


/**
 * 缓存
 * 使用Map<> 存储 tabName -> tabObj（登记式单例类）
 */
public class Cache {
    private final static Map<String,MemoryTable> singleMap = new HashMap<>();

    /**
     * 打印当前已登记的 tab
     */
    public static void showTab(){
        System.out.println("=========== now exists tab ===========");
        for (String tab : singleMap.keySet()){
            System.out.println(tab);
        }
        System.out.println("=========== now exists tab ===========\n");
    }

    /**
     * 创建 tab 并登记
     * @param tabName: 表名
     */
    public static void createTab(String tabName){
        MemoryTable memoryTable = new MemoryTable(tabName);
        singleMap.put(tabName, memoryTable);
    }

    /**
     * 根据表名获取对应的表
     * @param tabName: 表名
     * @return MemoryTable实例
     */
    public static MemoryTable getTab(String tabName){
        MemoryTable memoryTable = singleMap.get(tabName);
        if (memoryTable == null){
            System.out.printf("Please create table %s first!!! \n", tabName);
            throw new NullPointerException();
        }
        return singleMap.get(tabName);
    }

    /**
     * 获取对应表下的key的值
     * @param tabName: 表名
     * @param key: 键
     * @return value: 数据
     */
    public static String getData(String tabName, String key){
        MemoryTable memoryTable = getTab(tabName);
        return memoryTable.getValue(key);
    }

    /**
     * 往对应的表插入key 和 value
     * @param tabName: 表名
     * @param key: 键
     * @param value: 值
     */
    public static void insertData(String tabName, String key, String value){
        MemoryTable memoryTable = getTab(tabName);
        memoryTable.insert(key, value);
    }

    /**
     * 更新对应的表下key的value
     * @param tabName: 表名
     * @param key: 键
     * @param value: 值
     */
    public static void updateData(String tabName, String key, String value){
        MemoryTable memoryTable = getTab(tabName);
        memoryTable.update(key, value);
    }
}
