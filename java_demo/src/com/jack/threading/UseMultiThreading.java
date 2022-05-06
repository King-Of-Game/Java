/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/5 17:04
 */

package com.jack.threading;


/**
 * 多线程编程
 * https://www.runoob.com/java/java-multithreading.html
 * 一条线程指的是进程中一个单一顺序的控制流，一个进程中可以并发多个线程，每条线程并行执行不同的任务。
 * 多线程是多任务的一种特别的形式，但多线程使用了更小的资源开销。
 *
 * 进程：一个进程包括由操作系统分配的内存空间，包含一个或多个线程。
 * 一个线程不能独立的存在，它必须是进程的一部分。
 * 一个进程一直运行，直到所有的非守护线程都结束运行后才能结束。
 *
 * Java 提供了三种创建线程的方法：
 *   通过实现 Runnable 接口
 *   通过继承 Thread 类本身
 *   通过 Callable 和 Future 创建线程
 *
 * 多线程使用场景
 *    I/O密集型
 */
public class UseMultiThreading {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
        demo4();

    }

    private static void demo1(){
        RunnableDemo R1 = new RunnableDemo( "Thread-1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo( "Thread-2");
        R2.start();
    }

    private static void demo2(){
        ThreadDemo T1 = new ThreadDemo( "Thread-1");
        T1.start();

        ThreadDemo T2 = new ThreadDemo( "Thread-2");
        T2.start();
    }

    private static void demo3(){
        Runnable hello = new DisplayMessage("Hello");
        Thread thread1 = new Thread(hello);
        thread1.setDaemon(true);
        thread1.setName("hello");
        System.out.println("Starting hello thread...");
        thread1.start();

        Runnable bye = new DisplayMessage("Goodbye");
        Thread thread2 = new Thread(bye);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.setDaemon(true);
        System.out.println("Starting goodbye thread...");
        thread2.start();


    }

    private static void demo4(){
        System.out.println("Starting thread3...");
        Thread thread3 = new GuessANumber(1);
        thread3.start();
        try {
            thread3.join();
        }catch(InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Starting thread4...");
        Thread thread4 = new GuessANumber(1000);

        thread4.start();
        System.out.println("main() is ending...");
    }



}
