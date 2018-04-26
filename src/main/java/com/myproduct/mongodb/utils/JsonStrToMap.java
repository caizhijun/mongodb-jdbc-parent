package com.myproduct.mongodb.utils;/**
 * Created by Administrator on 2018/4/25.
 */

import com.mongodb.util.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author Caizhijun
 * @Date 2018-04-25 18:07
 **/
public class JsonStrToMap {
    /**
     * json 字符串转化为map格式
     * @param jsonString
     * @return
     */

    public static Map<String, Integer> jsonStrToMap(String jsonString) {
        Object parseObj = JSON.parse(jsonString); // 反序列化 把json 转化为对象
        Map<String, Integer> map = (HashMap<String, Integer>) parseObj; // 把对象转化为map
        return map;
    }
}
