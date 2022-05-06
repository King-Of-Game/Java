/*
author: YiXuan
date: 2022/3/5 21:53
project: java_demo
software: IntelliJ IDEA
*/

package com.jack;

import java.util.regex.*;

public class UseRegex {
    public static void main(String[] args) {
//        usePattern1();
//        useMatcher1();
//        useMatcher2();
//        useMatcher3();
//        useMatcher4();
        test();

    }

    /*
    使用了正则表达式 .*runoob.* 用于查找字符串中是否包了 runoob 子串
     */
    static void usePattern1(){
        String content = "I am noob from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? \n" + isMatch);
    }

    /*
    捕获组是把多个字符当一个单独单元进行处理的方法，它通过对括号内的字符分组来创建。
     */
    static void useMatcher1(){
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D+)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }
    }

    /*
    matches 和 lookingAt 方法
    matches 和 lookingAt 方法都用来尝试匹配一个输入序列模式。
    matches 要求整个序列都匹配
    lookingAt 方法虽然不需要整句都匹配，但是需要从第一个字符开始匹配。
     */
    static void useMatcher2(){
        final String REGEX = "foo";
        final String INPUT = "fooooooooooooooooo";
        final String INPUT2 = "ooooofoooooooooooo";
        Pattern pattern;
        Matcher matcher;
        Matcher matcher2;

        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);
        matcher2 = pattern.matcher(INPUT2);

        System.out.println("Current REGEX is: "+REGEX);
        System.out.println("Current INPUT is: "+INPUT);
        System.out.println("Current INPUT2 is: "+INPUT2);


        System.out.println("lookingAt(): "+matcher.lookingAt());
        System.out.println("matches(): "+matcher.matches());
        System.out.println("lookingAt(): "+matcher2.lookingAt());
    }

    /*
    replaceFirst 和 replaceAll 方法
    replaceFirst 和 replaceAll 方法用来替换匹配正则表达式的文本。不同的是，replaceFirst 替换首次匹配，replaceAll 替换所有匹配。
     */
    static void useMatcher3() {

        String REGEX = "dog";
        String INPUT = "The dog says meow. All dogs say meow.";
        String REPLACE = "cat";
        Pattern p = Pattern.compile(REGEX);
        // get a matcher object
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);

    }

    /*
    appendReplacement 和 appendTail 方法
    Matcher 类也提供了appendReplacement 和 appendTail 方法用于文本替换：
     */
    static void useMatcher4() {
        String REGEX = "a*b";
        String INPUT = "aabfooaabfooabfoobkkk";
        String REPLACE = "-";
        Pattern p = Pattern.compile(REGEX);
        // 获取 matcher 对象
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while(m.find()){
            m.appendReplacement(sb,REPLACE);
            System.out.println(sb.toString());
        }
        m.appendTail(sb);
        System.out.println(sb.toString());

    }

    public static void test(){
        String regex=".+\\\\";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("C:\\Users\\87143\\Desktop\\java_demo\\test\\jack.txt");

        while(matcher.find()){
            String result = matcher.group(0).toString();
            System.out.println(result);
        }

    }

}
