/*
Given an integer array of size N. Sort this array (in decreasing order) using heap sort.
Note: Space complexity should be O(1).
Input Format:
The first line of input contains an integer, that denotes the value of the size of the array or N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output Format :
The first and only line of output contains array elements after sorting.
 The elements of the array in the output are separated by single space.
Constraints :
1 <= n <= 10^6
Time Limit: 1 sec
Sample Input 1:
6
2 6 8 5 4 3
Sample Output 1:
8 6 5 4 3 2
 */

package com.company.DSA.PriorityQueue2;

import java.util.Scanner;

public class InplaceHeapSort {

    public static void downHeapify(int[] arr, int i, int n) {

        int parentIndex = i;
        int leftChildIndex = 2*parentIndex+1;
        int rightChildIndex = 2*parentIndex+2;
        while (leftChildIndex < n) {

            int minIndex = parentIndex;
            if (arr[leftChildIndex] < arr[minIndex]) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < n && arr[rightChildIndex] < arr[minIndex]) {
                minIndex = rightChildIndex;
            }
            if (minIndex == parentIndex) {
                return;
            }
            // swap minIndex with parenIndex
            int temp2 = arr[minIndex];
            arr[minIndex] = arr[parentIndex];
            arr[parentIndex] = temp2;
            // update indexes
            parentIndex = minIndex;
            leftChildIndex = 2*parentIndex+1;
            rightChildIndex = 2*parentIndex+2;
        }
    }

    // O(nlogn)
    public static void inplaceHeapSort(int arr[]) {

        int n = arr.length;
        /* Build Heap :- O(nlogn)
           By performing up heapify operation
           we will take one by one elements from unsorted array to heap
           in the beginning arr[0] will be heap part and other elements will be in unsorted array part

        for (int i = 1; i < n; i++){
            int childIndex = i;
            int parentIndex = (childIndex-1)/2;
            while (childIndex > 0){
                if (arr[childIndex] < arr[parentIndex]){
                    // swap
                    int temp = arr[childIndex];
                    arr[childIndex] = arr[parentIndex];
                    arr[parentIndex] = temp;
                    // update indexes
                    childIndex = parentIndex;
                    parentIndex = (childIndex-1)/2;
                }else {
                    return;
                }
            }
        }
         */

        /* Build the heap :- O(n)
            By performing down heapify only in non-leaf nodes
         */
        for (int i = (n/2)-1; i >= 0; i--) {
            downHeapify(arr, i, n);
        }

        /* convert built heap to sorted array :- O(nlogn)
            * Remove elements from starting one by one , and put them at respective last position
            right array part will be sorted array
            left array part will be treated as heap
            we will put elements from heap to sorted part
             * by swapping first element of heap with first element of sorted array
             * and maintaining heap order property in heap part by down heapify operation
         */
        for (int i = n-1; i >= 0; i--) {
            // swap ith and 0th element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // from 0 to i-1 maintain heap
            // for maintaining heap perform down heapify operation on heap
            downHeapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        inplaceHeapSort(arr);
        for (int j: arr){
            System.out.print(j + " ");
        }
    }
}