package com.czweb.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {


    public static  void main(String[] args){
        List<Map<String,Object>> list = new ArrayList<>();

        Map map = new HashMap<>();
        map.put("id",456);
        map.put("name","张三");
        map.put("pwd","123");
        map.put("address","深圳");

        Map map1 = new HashMap<>();
        map1.put("id",789);
        map1.put("name","李四");
        map1.put("pwd","123");
        map1.put("address","上海");


        list.add(map);
        list.add(map1);


    }


}
