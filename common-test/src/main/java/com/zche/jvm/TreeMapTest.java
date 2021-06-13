package com.zche.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("null", null);
        treeMap.put("aaa", null);
        System.out.println(treeMap.toString());
        ConcurrentMap concurrentMap = new ConcurrentHashMap();
        concurrentMap.put("null", null);
        System.out.println(concurrentMap);

        List l = new ArrayList();
    }
}
