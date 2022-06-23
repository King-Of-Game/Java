///**
// * @author: YiXuan
// * @project: ajaxDemo
// * @software: IntelliJ IDEA
// * @date: 2022/5/12 17:05
// */
//
//package com.jack.util;
//
//import com.alibaba.fastjson.JSON;
//import com.jack.pojo.User;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//
//public class ResponseUtil {
//    // 查询返回多个成功
//    public static String multiOk(int code, List dataList){
//        int total = dataList.size();
//        String list = JSON.toJSONString(dataList);
//        String data = String.format("{\"total\":%d, \"list\":%s}", total, list);
//        return String.format("{\"code\":%d, \"data\":%s}", code, data);
//    }
//
//    // 查询返回单个成功
//    public static String singleOk(int code, Object object){
//        String data = JSON.toJSONString(object);
//        return String.format("{\"code\":%d, \"data\":%s}", code, data);
//    }
//
//
//    // 失败
//    public static String error(int code, String msg){
//        return String.format("{\"code\":%d, \"msg\":\"%s\"}", code, msg);
//    }
//
//
//
//    public static void main(String[] args) {
//        List<User> list = new ArrayList<>();
//        User user = new User(1,"admin","123456","admin");
//        list.add(user);
//        list.add(user);
//        System.out.println(multiOk(200, list));
//
//
//        System.out.println(singleOk(200, user));
//
//
//        System.out.println(error(200, "error"));
//
//    }
//}
