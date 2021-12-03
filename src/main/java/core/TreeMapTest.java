package core;

import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap();
        // treeMap.put("a","abc");
        treeMap.put(null, "xyz");

        System.out.println(treeMap);
    }
}
