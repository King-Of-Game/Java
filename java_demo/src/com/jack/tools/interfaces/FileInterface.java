/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/27 14:29
 */

package com.jack.tools.interfaces;

public interface FileInterface {

    /**
     * 创建目录
     * @param dirPath 目录路径
     */
    public boolean createDir(String dirPath);


    /**
     * 创建文件并写入文本
     * @param filePath 文件路径: "test\\jack.txt"
     * @param content 写入文本内容
     */
    public void writeTextToFile(String filePath, String content);


    /**
     * 从文件中读取文本
     * @param filePath 文件路径: "test\\jack.txt"
     */
    public void readTextFromFile(String filePath);


    /**
     * 递归创建文件
     * @param count 计数
     * @param num 循环次数
     * @param type 0: 梯度创建文件, 1: 平行创建文件
     * @param dirPath 指定路径
     * @param dirName 指定名称创建文件夹
     * @param fileName 指定名称创建文件
     */
    public void recursionCreateFile(int count, int num, int type, String dirPath, String dirName, String fileName);


    /**
     *  递归删除目录及其中的文件
     * @param dirPath 目录路径: "data/"
     */
    public void recursionDelFolder(String dirPath);


    /**
     * 获取指定路径下的信息
     * @param dirPath 目录路径: "data/"
     */
    public void getInfoByDirPath(String dirPath);


    /**
     * 获取当前项目根目录路径
     */
    public String getProjectPath();


    /**
     * 从文件路径中截取目录路径
     * @param filePath 文件路径: "C:\test\jack.txt"
     * @return string "C:\test\"
     */
    public String getDirPathInFilePath(String filePath);
}
