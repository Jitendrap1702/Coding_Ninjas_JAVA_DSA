package com.company.DSA.Stack;

import javax.sound.midi.Soundbank;

public class StackUsingArray {
    
    private int[] data;
    private int topIndex; // index of top most element of stack
    
    public StackUsingArray(int n){
        data = new int[n];
        topIndex = -1;
    }

    // time complexity : O(1)
    public int size(){
        return topIndex + 1;
    }

    // time complexity : O(1)
    public boolean isEmpty(){
        return topIndex == -1;
    }

    // time complexity : O(1)
    public void push(int ele) throws StackFullException {

        // if Stack is full
        if (topIndex == data.length-1){
            // throw stack full exception
            //throw new StackFullException();
            doubleCapacity();
        }
        topIndex++;
        data[topIndex] = ele;
    }

    // Time Complexity : O(n)
    // In place of throwing stackFullException we can increase the capacity of our stack
    // to make stack more simple we can use ArrayList in place of array
    public void doubleCapacity(){

        System.out.println("Double Capacity");
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++){
            data[i] = temp[i];
        }
    }

    // time complexity : O(1)
    public int top() throws StackEmptyException {

        if (topIndex == -1){
            // throw stackEmptyException
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    // time complexity : O(1)
    public int pop() throws StackEmptyException {

        if (topIndex == -1){
            // throw stackEmptyException
            throw new StackEmptyException();
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }
}
