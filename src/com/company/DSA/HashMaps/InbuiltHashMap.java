package com.company.DSA.HashMaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class InbuiltHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // insert : O(1)
        map.put("abc", 1);
        map.put("def", 4);
        map.put("ghi", 8);

        // size : O(1)
        int size = map.size();
        System.out.println(size);

        // presence of key, value
        // 1. key : O(1)
        if (map.containsKey("abc")){
            System.out.println("abc is present");
        }else{
            System.out.println("abc not present");
        }

        if (map.containsKey("xyz")){
            System.out.println("xyz is present");
        }else {
            System.out.println("xyz not present");
        }

        // 2. value : O(n)
        if (map.containsValue(4)){
            System.out.println("4 is present");
        }else{
            System.out.println("4 is not present");
        }

        // Get Value : O(1)
        int v = map.get("def");
        System.out.println(v);

        //int v1 = map.get("xyz"); // NullPointerException cause key "xyz" is not present in map.
        int v1 = 0;
        if (map.containsKey("xyz")){
            v1 = map.get("xyz");
        }
        System.out.println(v1);

        // get all keys : O(n)
        Set<String> keys = map.keySet(); // it return set of keys
        for (String i : keys){
            System.out.print(i + " ");
        }
        System.out.println();

        // get all values : O(n)
        Collection<Integer> values = map.values(); // collection of values
        for (int i : values){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Map is : " + map);
        System.out.println("The set is : " + map.entrySet()); // return map

        // remove : O(1)
        int ans = map.remove("ghi");
        System.out.println(ans);
        //map.remove("ghi", 8);

    }
}
