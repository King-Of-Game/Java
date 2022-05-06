/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/5 23:39
 */

package com.jack.threading;


/**
 * 通过实现 Runnable 接口创建线程
 */
public class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    public void run() {
        while(true) {
            System.out.println(message);
        }
    }
}