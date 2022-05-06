/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/5 0:27
 */

package com.jack.generics;


/**
 * 泛型类
 * 和泛型方法一样，泛型类的类型参数声明部分也包含一个或多个类型参数，参数间用逗号隔开。
 * 一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
 * 因为他们接受一个或多个参数，这些类被称为参数化的类或参数化的类型。
 */
public class Box<T> {
    private T param;

    public void add(T t) {
        this.param = t;
    }

    public T getParam() {
        return this.param;
    }
}
