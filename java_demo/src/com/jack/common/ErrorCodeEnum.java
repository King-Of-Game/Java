/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/5 19:27
 */

package com.jack.common;

public enum ErrorCodeEnum {
    /**
     * 常用错误码
     */
    OK(0,"成功"),
    ERROR_PARAM(1,"参数错误"),


    /**
     * HTTP 错误码
     * 200~299 成功
     * 500~599 服务器内部错误
     */
    HTTP_OK(200,"成功"),
    HTTP_ERROR_PARAM(501,"请求参数错误");


    private int code;
    private String msg;

    /**
     * 构造方法
     * @param code: 状态码
     * @param msg: 对应信息
     */
    ErrorCodeEnum(int code, String msg){
        this.code = code;
        this.msg = msg;
    }


    /**
     * 返回不同枚举常量对应的消息
     * @return string
     */
    public String getMsg(){
        return this.msg;
    }


    /**
     * 返回不同枚举常量对应的错误码
     * @return int
     */
    public int getCode(){
        return this.code;
    }


    /**
     * 打印枚举中每个成员的索引和值
     * values() 返回枚举类中所有的值。
     * ordinal() 方法可以找到每个枚举常量的索引，就像数组索引一样。
     */
    public static void getMember(){
        for (ErrorCodeEnum errorCodeEnum : ErrorCodeEnum.values()){
            int index = errorCodeEnum.ordinal();
            System.out.printf("ErrorCode[%d] = %s\n", index, errorCodeEnum.name());
        }
    }

    /**
     * 通过指定字符串找到对应的枚举常量
     * valueOf() 方法返回指定字符串值的枚举常量。
     * @param str
     */
    public static void getEnumByString(String str){
        ErrorCodeEnum errorCodeEnum = ErrorCodeEnum.valueOf(str);
        System.out.println(errorCodeEnum);
    }
}
