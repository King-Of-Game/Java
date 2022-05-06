/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/1 14:58
 */

package com.jack.dataStructure;

import java.util.Vector;
import java.util.Enumeration;


/**
 * Java Enumeration接口
 * https://www.runoob.com/java/java-enumeration-interface.html
 * Enumeration接口中定义了一些方法，通过这些方法可以枚举（一次获得一个）对象集合中的元素。
 * boolean hasMoreElements( ) 测试此枚举是否包含更多的元素。
 * Object nextElement( ) 如果此枚举对象至少还有一个可提供的元素，则返回此枚举的下一个元素。
 */
public class UseEnumeration {
    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<String>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}
