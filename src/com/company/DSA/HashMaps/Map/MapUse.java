package com.company.DSA.HashMaps.Map;

public class MapUse {

    public static void main(String[] args) {

        Map<String, Integer> map = new Map<>();
        for (int i = 0; i < 20; i++){
            map.insert("abc" + i, i+1);
            System.out.println(map.loadFactor());
        }

        map.remove("abc3");
        map.remove("abc7");

        for (int i = 0; i < 20; i++){
            System.out.println("abc" + i + ":" + map.getValue("abc" + i));
        }
    }
}
