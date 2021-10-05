package com.company.DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queue<T> {

    private Queue<T> q1;
    private Queue<T> q2;
    int count;

    public StackUsing2Queue(){

        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
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

    // Time complexity : O(n)
    public T top(){

        // if queue is empty
        if (q1.isEmpty()){
            return null;
        }

        // transfer count-1 element from queue1 to queue2
        for (int i = 0; i < count-1; i++){
            T ele = q1.poll();
            q2.add(ele);
        }

        // the element still present in queue1 is top
        // also add top element to the q2
        T topEle = q1.poll();
        q2.add(topEle);

        // now transfer count element from queue2 to queue1
        for (int i = 0; i < count; i++){
            T ele = q2.poll();
            q1.add(ele);
        }

        return topEle;
    }

    // Time Complexity : O(1)
    public void push(T ele){

        q1.add(ele);
        count++;
    }

    public T pop(){

        // if queue is empty
        if (q1.isEmpty()){
            return null;
        }
        // transfer count-1 element from queue1 to queue2
        for (int i = 0; i < count-1; i++){
            T ele = q1.poll();
            q2.add(ele);
        }

        // the element still present in queue1 is top
        // also add top element to the q2
        T topEle = q1.poll();

        // now transfer count element from queue2 to queue1
        for (int i = 0; i < count-1; i++){
            T ele = q2.poll();
            q1.add(ele);
        }
        count--;
        return topEle;
    }

}
