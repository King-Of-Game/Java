/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/1 16:34
 */

package com.jack.dataStructure;
import java.util.*;


/**
 * Java Stack 类
 * https://www.runoob.com/java/java-stack-class.html
 * 栈是Vector的一个子类，它实现了一个标准的后进先出的栈。
 * 堆栈只定义了默认构造函数，用来创建一个空栈。
 */
public class UseStack {
    static void showPush(Stack<Integer> stack, int num) {
        stack.push(num);
        System.out.println("push(" + num + ")");
        System.out.println("now stack: " + stack);
    }

    static void showPop(Stack<Integer> stack) {
        System.out.print("pop -> ");
        Integer num = stack.pop();
        System.out.println(num);
        System.out.println("now stack: " + stack);
    }

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack();
        System.out.println("stack: " + stack);
        showPush(stack, 42);
        showPush(stack, 66);
        showPush(stack, 99);

        System.out.println("=========================");

        showPop(stack);
        showPop(stack);
        showPop(stack);
        try {
            showPop(stack);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}
