/**
 * @author:    YiXuan
 * @project:   java_demo
 * @software:  IntelliJ IDEA
 * @date:      2022/3/17 15:41
 */

package com.jack.tools;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileTools {


    /**
     * 创建目录
     * @param dirPath 目录路径
     */
    public static void createDir(String dirPath){
        File dir = new File(dirPath);
        dir.mkdirs();
    }


    /**
     * 创建文件并写入文本
     * @param filePath 文件路径: "test\\jack.txt"
     * @param content 写入文本内容
     */
    public static void writeTextToFile(String filePath, String content){
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
    public static void readTextFromFile(String filePath){
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
    public static void recursionDelFolder(String dirPath){
        File folder = new File(dirPath);
        delFolder(folder);
        System.out.println("删除完成！");
    }
    private static void delFolder(File folder){
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
    public static void getInfoByDirPath(String dirPath){
        File folder = new File(dirPath);
        getInfoByFolder(folder);
    }

    /**
     * 获取指定目录下的信息
     * @param folder java File对象
     */
    private static void getInfoByFolder(File folder){
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
    public static String getProjectPath(){
        String ProjectPath = System.getProperty("user.dir");
        return ProjectPath;
    }


    /**
     * 从文件路径中截取目录路径
     * @param filePath 文件路径: "C:\test\jack.txt"
     * @return string "C:\test\"
     */
    public static String getDirPathInFilePath(String filePath) {
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
}
