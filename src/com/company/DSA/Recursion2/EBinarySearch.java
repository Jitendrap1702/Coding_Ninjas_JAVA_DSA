package com.company.DSA.Recursion2;

import com.company.Fundamentals.Arrays1.ArraySum;

import java.util.Scanner;

public class EBinarySearch {

    public static int binarySearch(int[] arr, int x, int startIndex, int lastIndex){

        // Base Case :- if x is not present in arr
        if (startIndex > lastIndex){
            return -1;
        }

        int midIndex = (startIndex + lastIndex)/2;
        // if x is less than middle element
        if (arr[midIndex] > x){
            int smallOutput = binarySearch(arr, x, startIndex, midIndex-1);
            return smallOutput;
        }
        // if x is greater than middle element
        else if (arr[midIndex] < x){
            int smallOutput = binarySearch(arr, x, midIndex + 1, lastIndex);
            return smallOutput;
        }
        // else x is equal to middle element
        else {
            return midIndex;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = ArraySum.takeInputArray();
        int x = sc.nextInt();

        int index = binarySearch(arr, x, 0, arr.length-1);
        System.out.println(index);
    }
}
