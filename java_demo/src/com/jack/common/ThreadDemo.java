/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/6 0:20
 */

package com.jack.common;

import com.jack.tools.*;

import java.util.Date;


/**
 * 线程类模板
 */
public class ThreadDemo extends Thread{
    private Thread thread;
    private String threadName;

    /**
     * 构造函数
     */
    public ThreadDemo(String name){
        this.threadName = name;
        System.out.println("Creating " +  this.threadName);
    }

    @Override
    public void start(){
        System.out.println("Starting " +  threadName);
        this.thread = new Thread(this, this.threadName);
        this.thread.start();
    }

    @Override
    public void run(){
        System.out.println("调用某个对象的方法...");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException i){
            i.printStackTrace();
        }



//        long timestamp = DateTools.getNowTimestamp(0);
//        String timeStr = DateTools.timestampToStr(timestamp);
//        System.out.printf("%d -> %s \n", timestamp, timeStr);
    }





}
