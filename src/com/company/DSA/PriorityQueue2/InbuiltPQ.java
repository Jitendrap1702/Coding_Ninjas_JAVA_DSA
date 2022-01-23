package com.company.DSA.PriorityQueue2;

import java.util.PriorityQueue;

/* This is also known as heap sort
    time complexity : O(nlogn)
    space complexity : O(n)
    for reducing this space complexity, we use Inplace Heap Sort Algo
 */

public class InbuiltPQ {

    public static void main(String[] args) {

        int[] arr = {4, 3, 7, 6, 9, 10, 1, 2};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // insert in priority queue
        for (int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
        }
        // remove and get top element from priority queue
        for (int i = 0; i < arr.length; i++){
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
