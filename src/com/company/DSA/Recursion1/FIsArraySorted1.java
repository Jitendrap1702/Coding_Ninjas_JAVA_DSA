package com.company.DSA.Recursion1;

import com.company.Fundamentals.Arrays1.ArraySum;

import java.util.Scanner;

public class FIsArraySorted1 {

    public static boolean isSorted(int a[]){

        if (a.length == 1){
            return true;
        }

        if (a[0] > a[1]){
            return false;
        }

        int[] smallArray = new int[a.length-1];
        for (int i = 1; i < a.length; i++){
            smallArray[i-1] = a[i];
        }

        boolean isSmallArraySorted = isSorted(smallArray);
        return isSmallArraySorted;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = ArraySum.takeInputArray();
        Boolean ans = isSorted(arr);
        System.out.println(ans);
    }
}
