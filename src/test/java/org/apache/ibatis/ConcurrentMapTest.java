package org.apache.ibatis;

import org.apache.ibatis.reflection.Reflector;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author : phi
 * @date : 2022/2/7
 */
public class ConcurrentMapTest {
    public static void main(String[] args) {
        String s = "s";
        ConcurrentMap<Class<?>, Reflector> reflectorMap = new ConcurrentHashMap<>();
        reflectorMap.computeIfAbsent(s.getClass(), Reflector::new);
        System.out.println();
    }
}
