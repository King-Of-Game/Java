/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/5 18:00
 */

package com.jack.threading;

public class ThreadDemo extends Thread {
    private Thread thread;
    private String threadName;

    ThreadDemo( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    @Override
    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    @Override
    public void start () {
        if (thread == null) {
            System.out.println("Starting " +  threadName );
            thread = new Thread (this, threadName);
            thread.start ();
        }
    }
}