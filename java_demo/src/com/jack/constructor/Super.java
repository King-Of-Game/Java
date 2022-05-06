/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/28 11:37
 */

package com.jack.constructor;


/**
 * 类具有的特征
 * 1. 属性 -> 属性值（变量）
 * 2. 行为 -> 方法
 */
public class Super {
    /**
     *
     * 构造函数的作用：
     * 1. 在类实例化为对象时，初始化类的属性值
     * 2. 在类实例化为对象时，发生了某种行为（调用了某个方法）
     */

    private int id;

    Super(){
        System.out.println("Constructor super class without parameter");
    }

    Super(int id){
        this.id = id;
        System.out.printf("Constructor super class with parameter(id: %d)\n", id);
    }

}
