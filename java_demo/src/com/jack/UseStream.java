/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/4 12:09
 */

package com.jack;
import com.jack.tools.FileTools;



public class UseStream {
    public static void main(String[] args) {

        FileTools fileTools = FileTools.getInstance();
        fileTools.recursionCreateFile(1, 2, 1, "data", "test", "jack.txt");


    }


    /**
     * 递归创建文件
     * @param count 计数
     * @param num 循环次数
     * @param type 0: 梯度创建文件, 1: 平行创建文件
     * @param dirPath 指定路径
     * @param dirName 指定名称创建文件夹
     * @param fileName 指定名称创建文件
     */
  /*  private static void recursionCreateFile(int count, int num, int type, String dirPath, String dirName, String fileName){
        if (count > num){
            System.out.println("创建完成");
        }
        else {
            String newDirName = dirName + count;
            String newDirPath = dirPath + "\\" + newDirName;
            String filePath = newDirPath + "\\" + fileName;
            String textContent = count + "";
            // 梯度创建
            if (type == 0){
                FileTools.writeTextToFile(filePath, textContent);
                recursionCreateFile(count+1, num, type, newDirPath, dirName, fileName);
            }
            // 平行创建
            else {
                FileTools.writeTextToFile(filePath, textContent);
                recursionCreateFile(count+1, num, type, dirPath, dirName, fileName);
            }
        }
    }*/



}
