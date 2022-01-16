package com.company.DAA_Practical;

// this method can applied on sorted array for search any element
public class BinarySearch {

    public static int binarySearch(int[] arr, int ele, int start, int end){

        // Base Case :- if x is not present in arr
        if (start > end){
            return -1;
        }

        int mid = (start + end)/2;

        // if ele is less than middle element
        if (arr[mid] > ele){
            return binarySearch(arr, ele, start, mid-1);
        }
        // if ele is greater than middle element
        else if (arr[mid] < ele){
            return binarySearch(arr, ele, mid+1, end);
        }
        // else x is equal to middle element
        else {
            return mid;
        }

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int ele = 2;
        int index = binarySearch(arr, ele, 0, arr.length-1);
        System.out.println(index);
    }
}
