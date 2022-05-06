package com.jack;

import com.jack.common.*;



public class Main {

    public static void main(String[] args) {
	    // write your code here
//        testUtil();
//        testCache();
        testThread();
    }

    private static void testUtil(){
        Util util = new Util();
        System.out.println(util.randomNumber100());
        System.out.println(util.randomNumber1000());
    }


    private static void testCache(){
        Cache.createTab("tab1");
        Cache.showTab();

        Cache.insertData("tab1", "auto_id", "1");
        String data = Cache.getData("tab1", "auto_id");
        System.out.printf("%s[\"%s\"] = %s\n", "tab1", "auto_id", data);

        Cache.createTab("tab2");
        Cache.showTab();
        Cache.insertData("tab2", "auto_id", "2");
        data = Cache.getData("tab2", "auto_id");
        System.out.printf("%s[\"%s\"] = %s\n", "tab2", "auto_id", data);
    }

    private static void testThread(){
        ThreadDemo threadDemo1 = new ThreadDemo("threadDemo1");
        threadDemo1.start();

        try {
            Thread.sleep(1000);
        }catch (InterruptedException i){
            i.printStackTrace();
        }

        ThreadDemo threadDemo2 = new ThreadDemo("threadDemo2");
        threadDemo2.start();
    }



}


