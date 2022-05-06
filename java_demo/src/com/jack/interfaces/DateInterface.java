/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/27 11:57
 */

package com.jack.interfaces;

 interface DateInterface {

    /**
     * 获取当前时间戳
     * @param type 0: 10位时间戳(精确到秒), 1: 13位时间戳(精确到毫秒)
     * @return long
     */
     long getNowTimestamp(int type);


    /**
     * 获取当天零点时间戳
     * @param type 0: 10位时间戳(精确到秒), 1: 13位时间戳(精确到毫秒)
     * @return long
     */
     long getToday0Timestamp(int type);


    /**
     * 时间戳转换成字符串时间
     * @param time 时间戳
     * @return "yyyy-MM-dd HH:mm:ss"
     */
     String timestampToStr(long time);


    /**
     * 字符串时间转换成时间戳
     * @param formatTime "yyyy-MM-dd HH:mm:ss"
     * @param type 0: 10位时间戳, 1: 13位时间戳
     * @return long 时间戳
     */
     long strTimeToTimestamp(String formatTime, int type);


    /**
     * 当前执行线程休眠
     * @param millis: 毫秒
     */
     void threadSleep(int millis);






}
