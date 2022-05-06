/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/3/27 12:13
 */

package com.jack;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
//        scannerNext();
//        scannerNextLine();
//        scannerNumber();
        scannerMultiNumberToCalc();
    }


    // 使用 next方法
    public static void scannerNext(){
        // 从键盘接收输入字符
        Scanner scanner = new Scanner(System.in);

        // next 方式接收
        System.out.println("NEXT 方式接收输入：");
        // 判断是否还有输入
        if (scanner.hasNext()){
            String content = scanner.next();
            System.out.printf("输入的字符串： %s\n", content);
        }
        scanner.close();
    }

    /**
     next() 与 nextLine() 区别
     next():

     1、一定要读取到有效字符后才可以结束输入。
     2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
     3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
     next() 不能得到带有空格的字符串。
     nextLine()：

     1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
     2、可以获得空白。
     */

    //使用 nextLine 方法
    public static void scannerNextLine(){
        // 从键盘接收输入字符
        Scanner scanner = new Scanner(System.in);

        // next 方式接收
        System.out.println("nextLine 方式接收输入：");
        // 判断是否还有输入
        if (scanner.hasNextLine()){
            String content = scanner.nextLine();
            System.out.printf("输入的字符串： %s\n", content);
        }
        scanner.close();
    }


    // 输入整数或小数
    public static void scannerNumber() {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
        int i = 0;
        float f = 0.0f;
        System.out.print("输入整数：");
        if (scan.hasNextInt()) {
            // 判断输入的是否是整数
            i = scan.nextInt();
            // 接收整数
            System.out.println("整数数据：" + i);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是整数！");
        }
        System.out.print("输入小数：");
        if (scan.hasNextFloat()) {
            // 判断输入的是否是小数
            f = scan.nextFloat();
            // 接收小数
            System.out.println("小数数据：" + f);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是小数！");
        }
        scan.close();
    }


    // 输入多个数字来进行计算，遇到非数字输入结束
    public static void scannerMultiNumberToCalc(){
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        double sum = 0;
        System.out.println("请输入多个数字，输入非数字内容以结束");
        while (scanner.hasNextDouble()){
            double content = scanner.nextDouble();
            num += 1;
            sum += content;
        }
        scanner.close();
        System.out.printf("输入数字之和: %.2f\n", sum);
        System.out.printf("输入数字平均值: %f\n", sum/num);
        System.out.printf("输入数字平均值(精确到两位小数): %.2f\n", sum/num);
    }


}
