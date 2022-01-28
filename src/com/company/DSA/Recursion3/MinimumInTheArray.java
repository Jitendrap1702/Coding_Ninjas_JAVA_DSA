package com.company.DSA.Recursion3;

public class MinimumInTheArray {

    // it will return min
    public static int findMin(int[] arr, int startIndex){

        // base case
        if (startIndex == arr.length){
            return Integer.MAX_VALUE;
        }
        // small answer
        int smallMin = findMin(arr, startIndex+1);
        // small calculation
        if (arr[startIndex] < smallMin){
            return arr[startIndex];
        }else {
            return smallMin;
        }
    }

    public static void printMin(int[] arr, int startIndex, int minSoFar){

        if (startIndex == arr.length){
            System.out.println(minSoFar);
            return;
        }
        int newMinimum = minSoFar;
        if (arr[startIndex] < minSoFar){
            newMinimum = arr[startIndex];
        }
        printMin(arr, startIndex+1, newMinimum);
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 9, 8};
        // by printing
        printMin(arr, 0, Integer.MAX_VALUE);
        // by returning
        int min = findMin(arr, 0);
        System.out.println(min);
    }
}
