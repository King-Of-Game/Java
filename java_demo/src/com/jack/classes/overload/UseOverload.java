/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/28 17:57
 */

package com.jack.classes.overload;


/**
 * 重载和重写的区别
 * 核心：
 * 1. 重写是子类继承父类的方法后在原有基础上拓展
 * 2. 重载是在同一个类中有多个相同名字的方法（可以定义为某个对象有多个相似的行为，但细节上又有不同）
 *
 * 区别点    重载方法    重写方法
 * 参数列表	必须修改	  一定不能修改
 * 返回类型	可以修改	  一定不能修改
 * 异常	    可以修改	  可以减少或删除，一定不能抛出新的或者更广的异常
 * 访问	    可以修改	  一定不能做更严格的限制（可以降低限制）
 */



public class UseOverload {
    public int test(){
        System.out.println("test1");
        return 1;
    }

    public void test(int a){
        System.out.println("test2");
    }

    //以下两个参数类型顺序不同
    public String test(int a,String s){
        System.out.println("test3");
        return "return test3";
    }

    public String test(String s,int a){
        System.out.println("test4");
        return "return test4";
    }

    public static void main(String[] args){
        UseOverload o = new UseOverload();
        System.out.println(o.test());
        o.test(1);
        System.out.println(o.test(1,"test3"));
        System.out.println(o.test("test4",1));
    }
}
