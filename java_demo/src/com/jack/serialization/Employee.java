/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/5 16:10
 */

package com.jack.serialization;


/**
 * 一个类的对象要想序列化成功，必须满足两个条件：
 * 该类必须实现 java.io.Serializable 接口。
 * 该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的。
 * 检验一个类的实例是否能序列化十分简单， 只需要查看该类有没有实现 java.io.Serializable接口。
 */
public class Employee implements java.io.Serializable{
    public String name;
    public String address;
    /**
     * static 修饰的成员变量无法序列化，无法写到文件。
     * 如果不希望某个成员变量写到文件，同时又不希望使用 static 关键字， 那么可以使用 transient。
     * transient 关键字表示瞬态，被 transient 修饰的成员变量无法被序列化。
     */
    public transient int SSN;
    public int number;
    public void mailCheck()
    {
        System.out.printf("Mailing a check to %s %s \n", name, address);
    }
}
