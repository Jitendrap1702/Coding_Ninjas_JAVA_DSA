package com.company.DSA.Queue.Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFirstK {

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {

        // create a stack type object
        Stack<Integer> stack = new Stack<>();

        // put k  element from input stack to queue
        for (int i = 0; i < k; i++){
            int ele = input.remove();
            stack.push(ele);
        }

        // put k elements from stack to ans queue
        Queue<Integer> ans = new LinkedList<>();
        while (!stack.isEmpty()){
            int ele = stack.pop();
            ans.add(ele);
        }
        // put remaining elements of input Queue in ans queue
        while (!input.isEmpty()){
            int ele = input.remove();
            ans.add(ele);
        }

        return ans;
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        int[] arr = {1,2,3,4,5};
        for (int i : arr){
            queue.add(i);
        }
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Queue<Integer> ans = reverseKElements(queue, k);
        for (int i = 0; i < arr.length; i++){
            System.out.println(ans.remove());
        }
    }
}
