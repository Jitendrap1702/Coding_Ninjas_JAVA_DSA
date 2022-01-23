/*
Given an array of integers, check whether it represents max-heap or not.
Return true if the given array represents max-heap, else return false.
Input Format:
The first line of input contains an integer, that denotes the value of the size of the array.
Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output Format :
The first and only line of output contains true if it represents max-heap and false if it is not a max-heap.
Constraints:
1 <= N <= 10^5
1 <= Ai <= 10^5
Time Limit: 1 sec
Sample Input 1:
8
42 20 18 6 14 11 9 4
Sample Output 1:
true
 */

/*
    1. It should follow complete binary tree property and Heap order property
    2. child element should be less than parent element for every nodes
 */
package com.company.DSA.PriorityQueue2.Assignment;

public class CheckMaxHeap {

    // Recursive approach
    public static boolean isHeap(int[] arr, int i, int n){

        // If a leaf node
        if (i >= (n - 2) / 2)
            return true;

        // If an internal node and is
        // greater than its children,
        // and same is recursively
        // true for the children
        if (arr[i] >= arr[2 * i + 1] &&
                arr[i] >= arr[2 * i + 2]
                && isHeap(arr, 2 * i + 1, n)
                && isHeap(arr, 2 * i + 2, n))
            return true;

        return false;
    }

    public static boolean checkMaxHeap(int arr[]) {

        for (int i = 0; i < arr.length; i++){

            int parentIndex = i;
            int leftChildIndex = 2*parentIndex+1;
            int rightChildIndex = 2*parentIndex+2;
            if (leftChildIndex < arr.length && arr[parentIndex] < arr[leftChildIndex]){
                return false;
            }
            if (rightChildIndex < arr.length && arr[parentIndex] < arr[rightChildIndex]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int n = 8;
        int[] arr = {42, 20, 18, 6, 14, 11, 9, 4};
        boolean ans = checkMaxHeap(arr);
        System.out.println(ans);
    }
}
