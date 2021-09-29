package com.company.DSA.Stack;

public class StackUse {

    public static void main(String[] args) throws StackFullException, StackEmptyException {

        // implement using array
        StackUsingArray stackUsingArray = new StackUsingArray(4);
        int[] arr = {5, 6, 7, 1, 9};
        for (int data : arr){
            stackUsingArray.push(data);
        }

        System.out.println(stackUsingArray.size());
        System.out.println(stackUsingArray.isEmpty());

        while (!stackUsingArray.isEmpty()){
            System.out.println(stackUsingArray.pop());
        }

        // implement using linked list
        StackUsingLL<Integer> stackUsingLL = new StackUsingLL<>();
        for (int data : arr){
            stackUsingLL.push(data);
        }

        System.out.println(stackUsingLL.size());
        System.out.println(stackUsingLL.isEmpty());
        System.out.println(stackUsingLL.top());

        while (!stackUsingLL.isEmpty()){
            System.out.println(stackUsingLL.pop());
        }
    }
}
