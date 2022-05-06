/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/27 14:33
 */

package com.jack.interfaces;


/**
 * 标记接口
 * 最常用的继承接口是没有包含任何方法的接口。
 * 标记接口是没有任何方法和属性的接口.它仅仅表明它的类属于一个特定的类型,供其他代码来测试允许做一些事情。
 * 标记接口作用：简单形象的说就是给某个对象打个标（盖个戳），使对象拥有某个或某些特权。
 */
public interface ToolInterface extends DateInterface, FileInterface, RandomInterface{
}
