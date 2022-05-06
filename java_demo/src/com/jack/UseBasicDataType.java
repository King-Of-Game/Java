package com.jack;

enum DataType{
    BYTE,
    SHORT,
    INT,
    LONG,
    FLOAT,
    DOUBLE,
    BOOLEAN,
    CHAR,
    STRING
}

public class UseBasicDataType {

    public static void main(String[] args) {
//        diff_data_type_infos();
//        diff_data_type_default_value();

//        use_byte();
//        use_short();
//        use_int();
//        use_long();
//        use_float();
//        use_double();
//        use_boolean();
//        use_char();
//        use_string();

//        use_final_variable();
//        use_diff_bases();
//        use_unicode_char();
//        use_auto_type_convert();
        use_force_type_convert();
    }

    /*
    byte 数据类型是8位、有符号的，以二进制补码表示的整数；
    最小值是 -128（-2^7）；
    最大值是 127（2^7-1）；
    默认值是 0；
    byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；
    */
    static void use_byte(){
        byte a = 100;
        byte b = -50;
        String dataType = DataType.BYTE.name();
        System.out.printf("Data Type: %s -> byte1: %d, byte2: %d\n", dataType, a, b);
    }

    /*
    short 数据类型是 16 位、有符号的以二进制补码表示的整数
    最小值是 -32768（-2^15）；
    最大值是 32767（2^15 - 1）；
    Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；
    默认值是 0；
    */
    static void use_short(){
        short a = 1000;
        short b = -20000;
        String dataType = DataType.SHORT.name();
        System.out.printf("Data Type: %s -> short1: %d, short2: %d\n", dataType, a, b);
    }

    /*
    int 数据类型是32位、有符号的以二进制补码表示的整数；
    最小值是 -2,147,483,648（-2^31）；
    最大值是 2,147,483,647（2^31 - 1）；
    一般地整型变量默认为 int 类型；
    默认值是 0 ；
    */
    static void use_int(){
        int a = 100000;
        int b = -200000;
        String dataType = DataType.INT.name();
        System.out.printf("Data Type: %s -> int1: %d, int2: %d\n", dataType, a, b);
    }

    /*
    long 数据类型是 64 位、有符号的以二进制补码表示的整数；
    最小值是 -9,223,372,036,854,775,808（-2^63）；
    最大值是 9,223,372,036,854,775,807（2^63 -1）；
    这种类型主要使用在需要比较大整数的系统上；
    默认值是 0L；
    */
    static void use_long(){
        long a = 100000L;
        long b = -200000L;
        String dataType = DataType.LONG.name();
        System.out.printf("Data Type: %s -> long1: %d, long2: %d\n", dataType, a, b);
    }

    /*
    float 数据类型是单精度、32位、符合IEEE 754标准的浮点数；
    float 在储存大型浮点数组的时候可节省内存空间；
    默认值是 0.0f；
    浮点数不能用来表示精确的值，如货币；
    */
    static void use_float(){
        float f1 = 234.5f;
        String dataType = DataType.FLOAT.name();
        System.out.printf("Data Type: %s -> f1: %.2f\n", dataType, f1);
    }

    /*
    double 数据类型是双精度、64 位、符合 IEEE 754 标准的浮点数；
    浮点数的默认类型为 double 类型；
    double类型同样不能表示精确的值，如货币；
    默认值是 0.0d；
    */
    static void use_double(){
        double   d1  = 7D;
        double   d2  = 7.;
        double   d3  =  8.0;
        double   d4  =  8.D;
        double   d5  =  12.9867;
        String dataType = DataType.DOUBLE.name();
        System.out.printf("Data Type: %s -> d1: %f, d2: %f, d3: %f, d4: %f, d5: %f \n", dataType, d1,d2,d3,d4,d5);
    }

    /*
    boolean数据类型表示一位的信息；
    只有两个取值：true 和 false；
    这种类型只作为一种标志来记录 true/false 情况；
    默认值是 false；
    */
    static void use_boolean(){
        boolean isTrue = true;
        String dataType = DataType.BOOLEAN.name();
        System.out.printf("Data Type: %s -> flag: %b \n", dataType, isTrue);
    }

    /*
    char 类型是一个单一的 16 位 Unicode 字符；
    最小值是 \u0000（十进制等效值为 0）；
    最大值是 \uffff（即为 65535）；
    char 数据类型可以储存任何字符；
    默认值是 'u0000'
    */
    static void use_char(){
        char letter = 'A';
        String dataType = DataType.CHAR.name();
        System.out.printf("Data Type: %s -> letter: %c \n", dataType, letter);
    }

    /*
    string 用于存储字符串
    默认值是 null
    */
    static void use_string(){
        String words = "apple";
        String dataType = DataType.STRING.name();
        System.out.printf("Data Type: %s -> words: %s \n", dataType, words);
    }

    /*
    引用类型
    在Java中，引用类型的变量非常类似于C/C++的指针。引用类型指向一个对象，指向对象的变量是引用变量。这些变量在声明时被指定为一个特定的类型，比如 Employee、Puppy 等。变量一旦声明后，类型就不能被改变了。
    对象、数组都是引用数据类型。
    所有引用类型的默认值都是null。
    一个引用变量可以用来引用任何与之兼容的类型。
    例子：Site site = new Site("Runoob")。
    */

    /*
    常量
    常量在程序运行时是不能被修改的。
    在 Java 中使用 final 关键字来修饰常量，声明方式和变量类似
    */
    static void use_final_variable(){
        final double PI = 3.1415926;
        System.out.printf("PI: %f is a final variable\n", PI);
    }

    /*
    byte、int、long、和short都可以用十进制、16进制以及8进制的方式来表示。
    前缀 0 表示 8 进制，而前缀 0x 代表 16 进制
    */
    static void use_diff_bases(){
        int decimal = 100;
        int octal = 0144;
        int hexa =  0x64;
        System.out.printf("decimal(100): %d \noctal(0144): %d \nhexa(0x64): %d\n", decimal, octal, hexa);
    }

    /*
    字符串常量和字符变量都可以包含任何 Unicode 字符
    */
    static void use_unicode_char(){
        char a = '\u0001';
        String b = "\u0001";
        System.out.printf("unicode('\\u0001'): %s \nunicode(\"\\u0001\"): %s\n", a, b);
    }

    /*
    自动类型转换
    整型、实型（常量）、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算。
    低  ------------------------------------>  高
    byte,short,char—> int —> long—> float —> double
    1. 不能对boolean类型进行类型转换。
    2. 不能把对象类型转换成不相关类的对象。
    3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。
    4. 转换过程中可能导致溢出或损失精度，
    5. 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入
     */
    static void use_auto_type_convert(){
        byte b = (byte)128;
        byte c = (byte)127;
        System.out.printf("int(128) -> byte: %d\n", b);
        System.out.printf("int(127) -> byte: %d\n", c);

        float f1 = 23.7f;
        float f2 = -45.89f;
        System.out.printf("float(23.7) -> int: %d\n", (int)f1);
        System.out.printf("float(-45.89f) -> int: %d\n", (int)f2);

        //必须满足转换前的数据类型的位数要低于转换后的数据类型
        //例如: short数据类型的位数为16位，就可以自动转换位数为32的int类型，同样float数据类型的位数为32，可以自动转换为64位的double类型。
        char c1='a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.printf("char('a') -> int: %d\n", i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2+1;//char 类型和 int 类型计算
        System.out.printf("char('A'+1) -> int: %d\n", i2);
    }

    /*
    强制类型转换
    1. 条件是转换的数据类型必须是兼容的。
    2. 格式：(type)value type是要强制类型转换后的数据类型
    */
    static void use_force_type_convert(){
        int i1 = 123;
        byte b = (byte)i1;//强制类型转换为byte
        System.out.printf("int(123) -> byte: %d", b);
    }

    /*
    隐含强制类型转换
    1、 整数的默认类型是 int。
    2. 小数默认是 double 类型浮点型，在定义 float 类型时必须在数字后面跟上 F 或者 f。
    */


    //不同数据类型的：二进制位数，包装类，最小值，最大值
    static void diff_data_type_infos(){
        // byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);
    }

    //不同数据类型的默认值
    static boolean bool;
    static byte by;
    static char ch;
    static double d;
    static float f;
    static int i;
    static long l;
    static short sh;
    static String str;
    static void diff_data_type_default_value(){
        System.out.println("Bool :" + bool);
        System.out.println("Byte :" + by);
        System.out.println("Character:" + ch);
        System.out.println("Double :" + d);
        System.out.println("Float :" + f);
        System.out.println("Integer :" + i);
        System.out.println("Long :" + l);
        System.out.println("Short :" + sh);
        System.out.println("String :" + str);
    }



}


