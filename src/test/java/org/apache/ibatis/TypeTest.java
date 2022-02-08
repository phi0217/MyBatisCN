package org.apache.ibatis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : phi
 * @date : 2022/2/7
 */
public class TypeTest {
    public static void main(String[] args) {
        Long l = 0L;
        System.out.println(l.getClass().getTypeName());

        List<Object> objectList = new ArrayList<>();
        objectList.add(l);
        objectList.add(1);
        objectList.add("a");
        System.out.println(objectList.getClass().getTypeName());

        List<Object> objectList2 = new ArrayList<>();
        objectList2.add("sss");
        objectList2.add("ssss");
        System.out.println(objectList2.getClass().getTypeName());
        System.out.println(objectList2.getClass().isArray());
        System.out.println(objectList2.getClass().getComponentType());

        Map<String, List<Object>> map = new HashMap<>();
        map.put("1", objectList);
        map.put("2", objectList2);
        System.out.println(map.getClass().getTypeName());
        System.out.println(map.getClass().getComponentType());

        int[] s = {1, 2, 4};
        System.out.println(s.getClass().isArray());
        System.out.println(s.getClass().getComponentType());

        Class<Map> mapClass = Map.class;
        System.out.println(mapClass);
        System.out.println(mapClass.getTypeName());
        Class<? extends Map> aClass = map.getClass();
        System.out.println(aClass);
        System.out.println(aClass.getTypeName());

        System.out.println(HashMap.class == aClass);
    }
}
