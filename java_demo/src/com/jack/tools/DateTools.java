/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/4 12:09
 */

package com.jack.tools;

import com.jack.tools.interfaces.DateInterface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTools implements DateInterface {
    private static DateTools instance = null;
    public static synchronized DateTools getInstance(){
        if (instance == null){
            instance = new DateTools();
        }
        return instance;
    }


    private final long timestamp = System.currentTimeMillis();





    /**
     * 获取当前时间戳
     * @param type 0: 10位时间戳(精确到秒), 1: 13位时间戳(精确到毫秒)
     * @return long
     */
    public long getNowTimestamp(int type){
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
    public long getToday0Timestamp(int type){
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
    public String timestampToStr(long time){
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
    public long strTimeToTimestamp(String formatTime, int type){
        
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
    public void threadSleep(int millis){
        try {
            Thread.sleep(millis);
        }catch (InterruptedException i){
            i.printStackTrace();
        }
    }
}
