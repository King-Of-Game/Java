/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/5/4 23:20
 */

package com.jack.generics;


import java.util.ArrayList;
import java.util.List;

/**
 * Java 泛型（generics）
 * https://www.runoob.com/java/java-generics.html
 * 泛型提供了编译时类型安全检测机制，该机制允许程序员在编译时检测到非法的类型。
 * 泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。
 * E - Element (在集合中使用，因为集合中存放的是元素)
 * T - Type（Java 类）
 * K - Key（键）
 * V - Value（值）
 * N - Number（数值类型）
 * ？ - 表示不确定的 java 类型
 * 泛型使用场景：
 *    写一个排序方法，能够对整型数组、字符串数组甚至其他任何类型的数组进行排序
 * 个人总结
 *    泛型的出现简化大量使用方法重载
 */
public class UseGenerics {


    public static void main(String[] args) {
//        printArray();
//        getMaxNum();
//        useGenericsClass();
//        useWildcard1();
        useWildcard2();
    }



    private static <E> void printArray(E[] inputArray){
        for (E element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    /**
     * 使用泛型方法打印不同类型的数组元素
     */
    private static void printArray(){
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "整型数组元素为:" );
        printArray( intArray  ); // 传递一个整型数组

        System.out.println( "\n双精度型数组元素为:" );
        printArray( doubleArray ); // 传递一个双精度型数组

        System.out.println( "\n字符型数组元素为:" );
        printArray( charArray ); // 传递一个字符型数组
    }


    /**
     * 有界的类型参数
     * 例如，一个操作数字的方法可能只希望接受Number或者Number子类的实例。这就是有界类型参数的目的。
     * 要声明一个有界的类型参数，首先列出类型参数的名称，后跟extends关键字，最后紧跟它的上界。
     */
    // 比较三个值并返回最大值
    private static <T extends Comparable<T>> T getMaxNum(T x, T y, T z)
    {
        T max = x; // 假设x是初始最大值
        if ( y.compareTo( max ) > 0 ){
            max = y; //y 更大
        }
        if ( z.compareTo( max ) > 0 ){
            max = z; // 现在 z 更大
        }
        return max; // 返回最大对象
    }
    private static void getMaxNum(){
        System.out.printf( "%d, %d 和 %d 中最大的数为 %d\n\n",
                3, 4, 5, getMaxNum( 3, 4, 5 ) );

        System.out.printf( "%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, getMaxNum( 6.6, 8.8, 7.7 ) );

        System.out.printf( "%s, %s 和 %s 中最大的数为 %s\n","pear",
                "apple", "orange", getMaxNum( "pear", "apple", "orange" ) );
    }


    /**
     * 使用泛型类
     */
    private static void useGenericsClass(){
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.add(10);
        stringBox.add("菜鸟教程");

        System.out.printf("整型值为 :%d\n\n", integerBox.getParam());
        System.out.printf("字符串为 :%s\n", stringBox.getParam());
    }


    /**
     * 类型通配符
     * 1、类型通配符一般是使用 ? 代替具体的类型参数。
     * 例如 List<?> 在逻辑上是 List<String>,List<Integer> 等所有 List<具体类型实参> 的父类。
     * 因为 getData() 方法的参数是 List<?> 类型的，所以 stringList，integerList，numberList 都可以作为这个方法的实参，这就是通配符的作用。
     */
    private static void getData(List<?> list){
        System.out.println("data: " + list.get(0));
    }
    private static void useWildcard1(){
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();

        stringList.add("icon");
        integerList.add(18);
        numberList.add(314);

        getData(stringList);
        getData(integerList);
        getData(numberList);
    }

    /**
     * 类型通配符
     * 2、类型通配符上限通过形如List来定义，如此定义就是通配符泛型值接受Number及其下层子类类型。
     */
    private static void getUperNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }
    private static void useWildcard2(){
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();

        stringList.add("icon");
        integerList.add(18);
        numberList.add(314);

        // 会出现错误，因为 getUperNumber() 方法中的参数已经限定了参数泛型上限为 Number，所以泛型为 String 是不在这个范围之内，所以会报错。
        // getUperNumber(stringList);
        getUperNumber(integerList);
        getUperNumber(numberList);
    }

    /**
     * 3、类型通配符下限通过形如 List<? super Number> 来定义，表示类型只能接受 Number 及其上层父类类型，如 Object 类型的实例。
     */

}
