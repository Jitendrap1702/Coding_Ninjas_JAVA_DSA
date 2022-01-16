package com.company.DAA_Practical;

import com.company.DSA.OOPS3.ChainedGenericPairs.Pair;

public class MinMaxElementOfArrayUsingDivideAndConquer {

    public static Pair<Integer, Integer> minMax(int[] arr, int start, int end){

        // when array have only one element
        if (start == end){
            return new Pair<>(arr[start], arr[end]);
        }
        // when array have only two element
        else if (start + 1 == end){
            return new Pair<>(Math.max(arr[start], arr[end]), Math.min(arr[start], arr[end]));
        }
        // when array have more than 2 element
        int mid = start + ((end-start)/2);
        Pair<Integer, Integer> p1 = minMax(arr, start, mid);
        Pair<Integer, Integer> p2 = minMax(arr, mid+1, end);

        return new Pair<>(Math.max(p1.getFirst(), p2.getFirst()), Math.min(p1.getSecond(), p2.getSecond()));
    }

    public static void main(String[] args) {

        int[] arr = {17, 3, 5, 18, 20, 50, -1, -19};
        Pair<Integer, Integer> ans = minMax(arr, 0, arr.length-1);
        System.out.println("Minimum : " + ans.getSecond());
        System.out.println("Maximum : " + ans.getFirst());
    }
}
