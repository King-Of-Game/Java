/**
 * @author: YiXuan
 * @project: ajaxDemo
 * @software: IntelliJ IDEA
 * @date: 2022/5/12 16:05
 */

package com.jack.util;


import java.util.Collection;
import java.util.Map;

/**
 Mybatis Mapper.xml标签中使⽤的⾮空判断⼯具类
 * @description: mybatis
<if test="">
使⽤⽅式：
 *
<if test="@com.xxx.xxx.util.MybatisTsetUtil@isNotEmpty(obj)">
 * @author: singleDog
 * @date: 2020/7/20
 */
public class MybatisUtil {
    public static boolean isEmpty(Object o){
        if(o == null){
            return true;
        }
        if(o instanceof String){
            return((String) o).trim().length()==0;
        }
        if(o instanceof Collection){
            return((Collection) o).isEmpty();
        }
        if(o instanceof Map){
            return((Map) o).isEmpty();
        }
        if(o.getClass().isArray()){
            return((Object[]) o).length ==0;
        }
        return false;
    }
    public static boolean isNotEmpty(Object o){
        return!isEmpty(o);
    }
}
