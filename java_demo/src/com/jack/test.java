/*
author: YiXuan
date: 2022/2/25 21:39
project: java_demo
software: IntelliJ IDEA
*/

package com.jack;

import java.util.HashMap;


enum Direction{
    UP,
    DOWN,
    LEFT,
    RIGHT
}


public class test{
    public static void main(String[] args){
        domo1(4);
    }



    static void domo1(int num){
        HashMap<String, Integer> dict = new HashMap<>();

        saveDataToDict(dict, 1,1,Direction.DOWN, 1, num);
//        System.out.println(dict.keySet());

        for (int i=1; i < num+1; i++ ){
            for (int j=1; j < num+1; j++ ){
                String key = i + "," + j;
                System.out.printf("%2d ",dict.get(key));
                if (j == num) {System.out.println();}
            }
        }
    }

    static HashMap<String, Integer> saveDataToDict(HashMap<String, Integer> dict, int line, int row, Direction direction, int count, int num){
        if (count-1 == num*num){
            return dict;
        }
        else{
            String key = line + "," + row;
//            System.out.printf("(%d, %d) -> %d\n",line,row,count);
            dict.put(key, count);

            if (count % num == 0 ){
                switch (direction) {
                    case UP:
                        return saveDataToDict(dict, line, row+1, Direction.DOWN, count+1, num);
                    default:
                        return saveDataToDict(dict, line, row+1, Direction.UP, count+1, num);
                }
            }
            else
            {
                switch (direction) {
                    case UP:
                        return saveDataToDict(dict, line-1, row, direction, count+1, num);
                    default:
                        return saveDataToDict(dict, line+1, row, direction, count+1, num);
                }
            }

        }
    }


}