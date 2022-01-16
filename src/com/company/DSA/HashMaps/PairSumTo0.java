package com.company.DSA.HashMaps;

import java.util.HashMap;

public class PairSumTo0 {

    public static int PairSum(int[] input, int size) {

        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < input.length; i++){
//            if (map.containsKey(input[i])){
//                map.put(input[i], map.get(input[i])+1);
//            }else{
//                map.put(input[i], 1);
//            }
//        }
//
//        int count = 0;
//        for (int i = 0; i < input.length; i++){
//
//            if (map.containsKey(-input[i])){
//                count += (map.get(input[i])*map.get(-input[i]));
//                map.put(input[i], 0);
//                map.put(-input[i], 0);
//            }
//        }
//        return count;
        int count = 0;
        for (int i = 0; i < input.length; i++){

            // if input[i] = x then check -x is present or not
            // if present then increase count by value of -input[i] key
            if (map.containsKey(-input[i])){
                count += map.get(-input[i]);
            }

            // update occurrence of number in map or add number to map
            if (map.containsKey(input[i])) {
                map.put(input[i], map.get(input[i])+1);
            }
            else{
                map.put(input[i], 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int size = 5;
//        int[] arr = {2, 1, -2, 2, 3};
        int[] arr = {0, 0, 0, 0, 0};
        int ans = PairSum(arr, size);
        System.out.println(ans);
    }
}
