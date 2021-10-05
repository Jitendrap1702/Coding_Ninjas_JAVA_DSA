package com.company.DSA.Queue;

import java.util.Stack;

public class QueueUsing2Stacks<T> {

    private Stack<T> s1;
    private Stack<T> s2;
    int count;

    public QueueUsing2Stacks(){
        s1 = new Stack<>();
        s2 = new Stack<>();
        count = 0;
    }

    // Time Complexity : O(1)
    public int size(){
        return count;
    }

    // Time Complexity : O(1)
    public boolean isEmpty(){
        return count == 0;
    }

    // Time complexity O(n)
    public T front(){

        // transfer count-1 element from stack1 to stack2
        for (int i = 0; i < count-1; i++){
            T ele = s1.pop();
            s2.push(ele);
        }
        // the element still present in stack1 is front
        T frontEle = s1.peek();

        // now transfer count-1 element from stack2 to stack1
        for (int i = 0; i < count-1; i++){
            T ele = s2.pop();
            s1.push(ele);
        }

        return frontEle;
    }

    // Time Complexity : O(1)
    public void enqueue(T ele){

        s1.push(ele);
        count++;
    }

    // Time Complexity : O(n)
    public T dequeue(){

        // transfer count-1 element from stack1 to stack2
        for (int i = 0; i < count-1; i++){
            T ele = s1.pop();
            s2.push(ele);
        }

        // the element still present in stack1 is front and this element will be removed
        T deqEle = s1.pop();

        // now transfer count-1 element from stack2 to stack1
        for (int i = 0; i < count-1; i++){
            T ele = s2.pop();
            s1.push(ele);
        }
        count--;
        return deqEle;
    }
}
