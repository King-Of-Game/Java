/*
author: YiXuan
date: 2022/2/27 21:39
project: java_demo
software: IntelliJ IDEA
*/

package com.jack;
import com.jack.tools.DateTools;


import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;



public class UseDate {
    public static void main(String[] args) {
//        get_now_date();
//        compare_date();
//        format_date();
//        format_date_by_locale();
//        string_to_date();
//        calc_time();

    }

    /*
    获取当前日期时间
     */
    static void get_now_date(){
        // 初始化 Date 对象
        Date date = new Date();

        // 使用 toString() 函数显示日期时间
        System.out.println(date.toString());
    }

    /*
    日期比较
    1. 使用 getTime() 方法获取两个日期（自1970年1月1日经历的毫秒数值），然后比较这两个值。
    2. 使用方法 before()，after() 和 equals()。例如，一个月的12号比18号早，则 new Date(99, 2, 12).before(new Date (99, 2, 18)) 返回true。
    3. 使用 compareTo() 方法，它是由 Comparable 接口定义的，Date 类实现了这个接口。
     */
    static void compare_date(){
        Date date1 = new Date(99,2,12);
        Date date2 = new Date(99,2,12);
        Boolean is_true;

        is_true = date1.getTime() == date2.getTime();
        System.out.println(is_true);

        is_true = date1.before(date2);
        System.out.println(is_true);

        System.out.println(date1.compareTo(date2));
    }

    /*
    格式化日期
     */
    static void format_date(){
        // 使用 SimpleDateFormat 格式化日期
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为: " + ft.format(dNow));

        // 使用printf格式化日期 (使用两个字母格式，它以 %t 开头并且以下面表格中的一个字母结尾。)
        Date date = new Date();
        //c的使用，全部日期和时间信息
        System.out.printf("全部日期和时间信息：%tc\n",date);
        //f的使用，年-月-日格式
        System.out.printf("年-月-日格式：%tF\n",date);
        //d的使用，月/日/年格式
        System.out.printf("月/日/年格式：%tD\n",date);
        //r的使用，HH:MM:SS PM格式（12时制）
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr\n",date);
        //t的使用，HH:MM:SS格式（24时制）
        System.out.printf("HH:MM:SS格式（24时制）：%tT\n",date);
        //R的使用，HH:MM格式（24时制）
        System.out.printf("HH:MM格式（24时制）：%tR\n",date);
        //C的使用，年前两位
        System.out.printf("年的前两位数字（不足两位前面补0）：%tC\n",date);
        //y的使用，年后两位
        System.out.printf("年的后两位数字（不足两位前面补0）：%ty\n",date);
        //j的使用，一年的天数
        System.out.printf("一年中的天数（即年的第几天）：%tj\n",date);
        //m的使用，月份
        System.out.printf("两位数字的月份（不足两位前面补0）：%tm\n",date);
        //d的使用，日（二位，不够补零）
        System.out.printf("两位数字的日（不足两位前面补0）：%td\n",date);
        //e的使用，日（一位不补零）
        System.out.printf("月份的日（前面不补0）：%te\n",date);


        // 如果需要重复提供日期, 可以利用一个格式化字符串指出要被格式化的参数的索引。
        // 使用toString()显示日期和时间
        System.out.printf("\n%1$s %2$tB %2$td, %2$tY\n", "Due date:", date);
    }

    /*
    根据不同地区的语言环境格式化日期
     */
    static void format_date_by_locale(){
        Date date=new Date();
        //b的使用，月份简称
        String str=String.format(Locale.US,"英文月份简称：%tb",date);
        System.out.println(str);
        System.out.printf("本地月份简称：%tb\n",date);
        //B的使用，月份全称
        str=String.format(Locale.US,"英文月份全称：%tB",date);
        System.out.println(str);
        System.out.printf("本地月份全称：%tB\n",date);
        //a的使用，星期简称
        str=String.format(Locale.US,"英文星期的简称：%ta",date);
        System.out.println(str);
        //A的使用，星期全称
        System.out.printf("本地星期的简称：%tA\n",date);
    }

    /*
    字符串解析成日期对象
     */
    static void string_to_date(){
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = "2022-1-1";
        Date date;

        try{
            date = formatDate.parse(strDate);
            System.out.printf("%tF\n", date);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /*
    测量时间
     */
    static void calc_time()  {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date startTime = new Date();
        System.out.printf("Start time: %s\n", formatDate.format(startTime));
        long startMillis = System.currentTimeMillis();
        try{
            Thread.sleep(3000);
            Date endTime = new Date();
            System.out.printf("end time: %s\n", formatDate.format(endTime));
            long endMillis = System.currentTimeMillis();
            System.out.printf("Difference: %d", endMillis-startMillis);

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
