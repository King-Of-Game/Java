/*
author: YiXuan
date: 2022/3/5 15:15
project: java_demo
software: IntelliJ IDEA
*/

package com.jack;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UseCalendar {
    public static void main(String[] args) {
//        createCalendarObj();
        gregorianCalendarDemo();

    }

    /*
    创建一个Calendar对象
     */
    static void createCalendarObj(){
        // 默认是当前日期
        Calendar calendar = Calendar.getInstance();
        // 手动设置日期
        calendar.set(Calendar.YEAR, 2020);
//        calendar.set(Calendar.MONTH, 1);
//        calendar.set(Calendar.DATE, 1);

        // 获得年份
        int year = calendar.get(Calendar.YEAR);
        // 获得月份
        int month = calendar.get(Calendar.MONTH) + 1;
        // 获得日期
        int date = calendar.get(Calendar.DATE);
        // 获得小时
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        // 获得分钟
        int minute = calendar.get(Calendar.MINUTE);
        // 获得秒
        int second = calendar.get(Calendar.SECOND);
        // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.printf("%d-%d-%d %d:%d%d %d", year,month,date,hour,minute,second, day);
    }

    /*
    Calendar类实现了公历日历，GregorianCalendar是Calendar类的一个具体实现。
    Calendar 的getInstance（）方法返回一个默认用当前的语言环境和时区初始化的GregorianCalendar对象
     */
    static void gregorianCalendarDemo(){
        String months[] = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"};

        int year;
        // 初始化 Gregorian 日历
        // 使用当前时间和日期
        // 默认为本地时间和时区
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        // 显示当前时间和日期的信息
        System.out.print("Date: ");
        System.out.print(months[gregorianCalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gregorianCalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gregorianCalendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gregorianCalendar.get(Calendar.HOUR) + ":");
        System.out.print(gregorianCalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gregorianCalendar.get(Calendar.SECOND));

        // 测试当前年份是否为闰年
        if(gregorianCalendar.isLeapYear(year)) {
            System.out.println("当前年份是闰年");
        }
        else {
            System.out.println("当前年份不是闰年");
        }
    }
}
