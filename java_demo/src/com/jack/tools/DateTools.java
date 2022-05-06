/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/4 12:09
 */

package com.jack.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTools {
    /**
     * 获取当前时间戳
     * @param type 0: 10位时间戳(精确到秒), 1: 13位时间戳(精确到毫秒)
     * @return long
     */
    public static long getNowTimestamp(int type){
        long timestamp = System.currentTimeMillis();
        if (type == 0){
            return timestamp/1000;
        }
        else{
            return timestamp;
        }
    }


    /**
     * 获取当天零点时间戳
     * @param type 0: 10位时间戳(精确到秒), 1: 13位时间戳(精确到毫秒)
     * @return long
     */
    public static long getToday0Timestamp(int type){
        long timestamp = System.currentTimeMillis();
        long oneDayMilliseconds = 60*60*24*1000;
        long Today0Timestamp = timestamp - (timestamp + 60*60*8*1000) % oneDayMilliseconds;
        if (type == 0){
            return Today0Timestamp/1000;
        }
        else{
            return Today0Timestamp;
        }
    }


    /**
     * 时间戳转换成字符串时间
     * @param time 时间戳
     * @return "yyyy-MM-dd HH:mm:ss"
     */
    public static String timestampToStr(long time){
        String format = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        int length = String.valueOf(time).length();
        if (length == 10){
            Date date = new Date(time*1000);
            return simpleDateFormat.format(date);
        }
        if (length == 13){
            Date date = new Date(time);
            return simpleDateFormat.format(date);
        }
        else{
            throw new IllegalArgumentException();
        }
    }


    /**
     * 字符串时间转换成时间戳
     * @param formatTime "yyyy-MM-dd HH:mm:ss"
     * @param type 0: 10位时间戳, 1: 13位时间戳
     * @return long 时间戳
     */
    public static long strTimeToTimestamp(String formatTime, int type){
        String format = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        try {
            long timestamp = simpleDateFormat.parse(formatTime).getTime();
            if (type == 0){
                return timestamp / 1000;
            }
            else {
                return timestamp;
            }
        }catch (ParseException error){
            error.printStackTrace();
            return 0;
        }
    }

    /**
     * 当前执行线程休眠
     * @param millis: 毫秒
     */
    public static void threadSleep(int millis){
        try {
            Thread.sleep(millis);
        }catch (InterruptedException i){
            i.printStackTrace();
        }
    }
}
