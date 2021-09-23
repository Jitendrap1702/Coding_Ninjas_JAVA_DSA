package com.company.DSA.ArrayList;

import com.company.Fundamentals.Arrays1.ArraySum;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {

    public static ArrayList<Integer> removeConsecutiveDuplicates(int[] arr){

        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for (int i = 1 ; i < arr.length ; i++){

            if (arr[i] != arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = ArraySum.takeInputArray();
        ArrayList<Integer> ans = removeConsecutiveDuplicates(arr);
        for (int i : ans){
            System.out.println(i);
        }
    }
}
