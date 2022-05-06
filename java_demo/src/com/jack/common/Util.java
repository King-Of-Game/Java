/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/27 14:35
 */

package com.jack.common;

import com.jack.interfaces.ToolInterface;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util implements ToolInterface {
    public static long timestamp = System.currentTimeMillis();
    public static long oneDayMilliseconds = 60*60*24*1000;
    public static String format = "yyyy-MM-dd HH:mm:ss";

    /**
     * 获取当前时间戳
     * @param type 0: 10位时间戳(精确到秒), 1: 13位时间戳(精确到毫秒)
     * @return long
     */
    @Override
    public long getNowTimestamp(int type) {
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
    @Override
    public long getToday0Timestamp(int type) {
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
    @Override
    public String timestampToStr(long time) {
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
    @Override
    public long strTimeToTimestamp(String formatTime, int type) {
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
    @Override
    public void threadSleep(int millis){
        try {
            Thread.sleep(millis);
        }catch (InterruptedException i){
            i.printStackTrace();
        }
    }




    /**
     * 创建目录
     * @param dirPath 目录路径
     */
    @Override
    public void createDir(String dirPath) {
        File dir = new File(dirPath);
        dir.mkdirs();
    }


    /**
     * 创建文件并写入文本
     * @param filePath 文件路径: "test\\jack.txt"
     * @param content 写入文本内容
     */
    @Override
    public void writeTextToFile(String filePath, String content) {
        // 先根据文件路径创建目录，否则找不到路径 FileOutputStream 对象会报错
        String dirPath = getDirPathInFilePath(filePath);
        createDir(dirPath);

        File file = new File(filePath);
        try {
            // 构建FileOutputStream对象,文件不存在会自动新建
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            // 构建OutputStreamWriter对象（本质上是一个输出流缓冲区）,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");

            // 以追加的方式写入到缓冲区
            outputStreamWriter.append(content);
            // 换行
            outputStreamWriter.append("\r\n");
            // 关闭写入流，同时把缓冲区的内容写入文件
            outputStreamWriter.close();

            // 关闭输出流，释放系统资源
            fileOutputStream.close();
        }catch (IOException error){
            error.printStackTrace();
        }
    }


    /**
     * 从文件中读取文本
     * @param filePath 文件路径: "test\\jack.txt"
     */
    @Override
    public void readTextFromFile(String filePath) {
        File file = new File(filePath);
        try{
            // 构建FileInputStream对象
            FileInputStream fileInputStream = new FileInputStream(file);
            // 构建InputStreamReader对象,编码与写入相同
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

            // 创建一个字符串缓冲区，接收读取的文本
            StringBuilder stringBuilder = new StringBuilder();
            while (inputStreamReader.ready()){
                stringBuilder.append((char) inputStreamReader.read());
            }
            System.out.println(stringBuilder.toString());
            // 关闭读取流
            inputStreamReader.close();

            // 关闭输入流，释放资源
            fileInputStream.close();
        }catch (IOException error){
            error.printStackTrace();
        }
    }


    /**
     *  递归删除目录及其中的文件
     * @param dirPath 目录路径: "data/"
     */
    @Override
    public void recursionDelFolder(String dirPath) {
        File folder = new File(dirPath);
        delFolder(folder);
        System.out.println("删除完成！");
    }
    private void delFolder(File folder){
        getInfoByFolder(folder);
        File[] files = folder.listFiles();
        if (files != null){
            for (File file : files){
                if (file.isDirectory()){
                    delFolder(file);
                }
                else{
                    System.out.println("正在删除文件: " + file);
                    file.delete();
                }
            }
        }
        System.out.println("正在删除目录: " + folder.getName());
        folder.delete();
    }


    /**
     * 获取指定路径下的信息
     * @param dirPath 目录路径: "data/"
     */
    @Override
    public void getInfoByDirPath(String dirPath) {
        File folder = new File(dirPath);
        getInfoByFolder(folder);
    }

    /**
     * 获取指定目录下的信息
     * @param folder java File对象
     */
    private void getInfoByFolder(File folder) {
        if (folder.isDirectory() && folder.exists()){
            System.out.printf("指定路径: %s\n", folder);
            for (String obj : folder.list()){
                String newDir = folder + "\\" + obj;
                File f = new File(newDir);
                if (f.isDirectory()){
                    System.out.printf("%s 是目录\n", newDir);
                }
                else{
                    System.out.printf("%s 是文件\n", newDir);
                }
            }
        }
        else{
            System.out.println("指定路径是文件或者不存在！");
        }
    }


    /**
     * 获取当前项目根目录路径
     */
    @Override
    public String getProjectPath() {
        String ProjectPath = System.getProperty("user.dir");
        return ProjectPath;
    }


    /**
     * 从文件路径中截取目录路径
     * @param filePath 文件路径: "C:\test\jack.txt"
     * @return string "C:\test\"
     */
    @Override
    public String getDirPathInFilePath(String filePath) {
        String regex=".+\\\\";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(filePath);

        if (matcher.find()){
            String result = matcher.group(0);
            return result;
        }
        else {
            return "";
        }
    }


    /**
     * 生成一个随机数，范围：1~100
     * @return int
     */
    @Override
    public int randomNumber100() {
        return (int) (Math.random() * 100 + 1);
    }


    /**
     * 生成一个随机数，范围：1~1000
     * @return int
     */
    @Override
    public int randomNumber1000() {
        return (int) (Math.random() * 1000 + 1);
    }


}
