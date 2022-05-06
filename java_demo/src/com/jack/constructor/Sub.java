/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/28 11:39
 */

package com.jack.constructor;

public class Sub extends Super{



    Sub(){
        System.out.println("Constructor sub class without parameter");
    }

    Sub(int id){
        super(id);
        System.out.printf("Constructor sub class with parameter(id: %d)\n", id);
    }


}
