/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/5 12:43
 */

package com.jack.serialization;

import com.jack.serialization.Employee;

import java.io.*;


/**
 * Java 序列化(又称持久化)
 * https://www.runoob.com/java/java-serialization.html
 * Java 提供了一种对象序列化的机制，该机制中，一个对象可以被表示为一个字节序列，该字节序列包括该对象的数据、有关对象的类型的信息和存储在对象中数据的类型。
 * 将序列化对象写入文件之后，可以从文件中读取出来，并且对它进行反序列化，也就是说，对象的类型信息、对象的数据，还有对象中的数据类型可以用来在内存中新建对象。
 * 个人总结
 *    序列化：把程序中的对象转化为字节序列
 *    反序列化：把字节序列转化为程序中的对象
 */
public class UseSerialize {
    public static void main(String[] args) {
//        serializeDemo();
        deserializeDemo();
    }


    /**
     * 序列化
     */
    private static void serializeDemo(){
        Employee employee = new Employee();
        employee.name = "Reyan Ali";
        employee.address = "Phokka Kuan, Ambehta Peer";
        employee.SSN = 11122333;
        employee.number = 101;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data/employee.skateboard");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved in /data/employee.ser");
        }
        catch (IOException i){
            i.printStackTrace();
        }
    }

    /**
     * 反序列化
     */
    private static void deserializeDemo(){
        Employee employee = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("data/employee.skateboard");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }
        catch (IOException i){
            i.printStackTrace();
        }
        catch (ClassNotFoundException i){
            System.out.println("Employee class not found");
            i.printStackTrace();
        }

        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + employee.name);
        System.out.println("Address: " + employee.address);

        /**
         * 当对象被序列化时，属性 SSN 的值为 111222333，但是因为该属性是短暂的，该值没有被发送到输出流。
         * 所以反序列化后 Employee 对象的 SSN 属性为 0。
         */
        System.out.println("SSN: " + employee.SSN);
        System.out.println("Number: " + employee.number);

    }

}
