/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/5 23:39
 */

package com.jack.threading;


/**
 * 通过继承 Thread 类创建线程
 */
public class GuessANumber extends Thread {
    private int number;
    public GuessANumber(int number) {
        this.number = number;
    }

    public void run() {
        int counter = 0;
        int guess = 0;
        do {
            // 1~100
            guess = (int) (Math.random() * 1000 + 1);
            System.out.println(this.getName() + " guesses " + guess);
            counter++;
        } while(guess != number);
        System.out.printf("The %s guess the correct answer: %d\n", this.getName(), this.number);
        System.out.printf("** spend %d times **\n", counter);
    }
}