package com.jack.tools;

import java.util.HashMap;
import java.util.Map;



public class PackResponse {
    private static PackResponse instance = null;
    public static synchronized PackResponse getInstance(){
        if (instance == null){
            instance = new PackResponse();
        }
        return instance;
    }

    private Map<String, Object> basicData;
    private Map<String, Object> listData;

    public Map<String, Object> errorData(int code, String msg){
        basicData = new HashMap<>();
        basicData.put("code", code);
        basicData.put("msg", msg);

        try {
            basicData.remove("data");
        }catch (NullPointerException ignored){
        }

        return basicData;
    }

    public Map<String, Object> singleData(int code, String msg, Object data){
        basicData = new HashMap<>();
        basicData.put("code", code);
        basicData.put("msg", msg);
        basicData.put("data", data);


        return basicData;
    }

    public Map<String, Object> multiData(int code, String msg, int count, Object data){
        basicData = new HashMap<>();
        basicData.put("code", code);
        basicData.put("msg", msg);

        listData = new HashMap<>();
        listData.put("count", count);
        listData.put("list", data);
        basicData.put("data", listData);

        return basicData;
    }
}
