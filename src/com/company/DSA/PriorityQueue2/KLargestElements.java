/*
You are given with an integer k and an array of integers that contain numbers in random order.
Write a program to find k largest numbers from given array.
You need to save them in an array and return it.
Time complexity should be O(nlogk) and space complexity should be not more than O(k).
Order of elements in the output is not important.
Input Format :
Line 1 : Size of array (n)
Line 2 : Array elements (separated by space)
Line 3 : Integer k
Output Format :
k largest elements
Sample Input :
13
2 12 9 16 10 5 3 20 25 11 1 8 6
4
Sample Output :
12
16
20
25
 */

/*
    Time complexity O(nlogk) :- ((n-k)logk + klogk)
    Space complexity O(k)
 */
package com.company.DSA.PriorityQueue2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElements {

    public static ArrayList<Integer> kLargest(int input[], int k) {

        // Put k elements in min heap priority queue
        // complexity O(klogk)
        // space complexity O(k)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(input[i]);
        }
        // now from k to n, compare every element with top element(min element) of heap
        // if top element is smaller than swap it with element and maintain heap order property in heap
        // complexity :- O((n-k)logk)
        for (int i = k; i < input.length; i++) {
            if (pq.peek() < input[i]) {
                pq.poll(); // remove top element from heap
                pq.add(input[i]); // add element to heap
            }
        }
        return new ArrayList<>(pq);
    }

    public static void main(String[] args) {

        int[] input = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
        int k = 4;
        ArrayList<Integer> ans = kLargest(input, k);
        for (int i : ans){
            System.out.println(i);
        }
    }
}
