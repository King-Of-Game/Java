/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/28 15:15
 */

package com.jack.constructor;

public class UseConstructor {
    public static void main(String[] args) {
        System.out.println(" ----------- 子类继承 -----------");
        Sub sub1 = new Sub();
        Sub sub2 = new Sub(100);
    }
}
