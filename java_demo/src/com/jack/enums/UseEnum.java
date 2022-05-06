/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/27 11:08
 */

package com.jack.enums;

public class UseEnum {

    /**
     * Enum.values() 返回枚举类中的对象列表
     */
    public static void main(String[] args) {
        fun1();
//        fun2();
    }


    // 使用枚举 方式一（推荐）
    private static void fun1(){
        ErrorCodeEnum.getMember();
        ErrorCodeEnum.getEnumByString("OK");

        int code = ErrorCodeEnum.HTTP_OK.getCode();
        String msg = ErrorCodeEnum.HTTP_OK.getMsg();
        System.out.printf("%d: %s\n", code,msg);

    }

    // 使用枚举 方式二
    private static void fun2(){
        ErrorCodeEnum errorCodeEnum = ErrorCodeEnum.HTTP_ERROR_PARAM;

        int code = errorCodeEnum.getCode();
        String msg = errorCodeEnum.toString();

        System.out.printf("%d: %s\n", code,msg);
    }
}
