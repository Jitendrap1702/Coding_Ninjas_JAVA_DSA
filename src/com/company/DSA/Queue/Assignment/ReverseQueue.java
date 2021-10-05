package com.company.DSA.Queue.Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    // Reverse using Stack
    // Time complexity : O(n)
    public static void reverseQueue(Queue<Integer> input) {

        // create a stack type object
        Stack<Integer> stack = new Stack<>();
        // transfer all element from input queue to stack
        while (!input.isEmpty()){
            int ele = input.remove();
            stack.push(ele);
        }
        // transfer all element from stack to input queue
        while (!stack.isEmpty()){
            int ele = stack.pop();
            input.add(ele);
        }
    }

    /*
    * Wrong solution : - will improve
    * Reverse using Queue
    * Time complexity : O(n**2)
    */
    public static void reverseQueueUsingQueue(Queue<Integer> input){

        // create helper Queue
        Queue<Integer> helperQueue = new LinkedList<>();
        int len = input.size();
        for (int i = 0; i < len-1; i++){

            for (int j = 0; j < len-i-1; j++){
                int ele = input.remove();
                helperQueue.add(ele);
            }

            int temp = input.remove();
            input.add(temp);

            for (int j = 0; j < len-i-1; j++){
                int ele = helperQueue.remove();
                input.add(ele);
            }

        }
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        int[] arr = {1,2,3,4,5};
        for (int i : arr){
            queue.add(i);
        }
        reverseQueueUsingQueue(queue);
        for (int i = 0; i < arr.length; i++){
            System.out.println(queue.remove());
        }
    }
}
