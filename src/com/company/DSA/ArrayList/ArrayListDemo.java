package com.company.DSA.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);

        arr.add(1, 80);
        arr.set(2, 90);
        System.out.println(arr.size());
        System.out.println(arr.get(1) + " " + arr.get(2));

        // Traverse in arrayList
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

        // Traverse using Enhanced for loop or for each loop
        for (int i : arr){
            System.out.println(i);
        }

        // remove element from ArrayList
        // 1. using index
        System.out.println(arr.remove(1));
        // 2. using object
        Integer i = 10;
        System.out.println(arr.remove(i));
    }
}
