package com.company.DSA.Stack;

import java.util.Stack;

public class StackInCollections {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        int[] arr = {2, 3, 5, 1, 9};
        for (int data : arr){
            stack.push(data);
        }
        // top most element
        System.out.println(stack.peek());

        System.out.println(stack.size());

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
