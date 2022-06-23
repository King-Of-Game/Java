/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/6 0:17
 */

package com.jack.tools;

import com.jack.tools.interfaces.RandomInterface;

public class RandomTools implements RandomInterface {
    private static RandomTools instance = null;
    public static synchronized RandomTools getInstance(){
        if (instance == null){
            instance = new RandomTools();
        }
        return instance;
    }


    /**
     * 生成一个随机数，范围：1~100
     * @return int
     */
    public int randomNumber100() {
        return (int) (Math.random() * 100 + 1);
    }


    /**
     * 生成一个随机数，范围：1~1000
     * @return int
     */
    public int randomNumber1000() {
        return (int) (Math.random() * 1000 + 1);
    }
}
