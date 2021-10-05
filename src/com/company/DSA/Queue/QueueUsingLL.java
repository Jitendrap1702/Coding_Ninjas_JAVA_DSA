package com.company.DSA.Queue;

import com.company.DSA.LinkedList1.APrintLL.Node;

public class QueueUsingLL<T> {

    private Node<T> front;
    private Node<T> rear;
    int count;

    public QueueUsingLL(){
        front = null;
        rear = null;
        count = 0;
    }

    // Time Complexity O(1)
    public int size(){
        return count;
    }

    // Time Complexity O(1)
    public boolean isEmpty(){
        return count == 0;
    }

    // Time Complexity O(1)
    public T front() throws QueueEmptyException {
        if (count == 0){
            throw new QueueEmptyException();
        }
        return front.data;
    }

    // Time Complexity O(1)
    // Add at the end(rear) of the LL
    public void enqueue(T ele){

        Node<T> x = new Node<>(ele);
        count++;
        if (rear == null){
            front = x;
            rear = x;
        }
        rear.next = x;
        rear = x;// rear = rear.next;
    }

    // Time Complexity O(1)
    // remove from front of the LL
    public T dequeue() throws QueueEmptyException {

        if (count == 0){
            throw new QueueEmptyException();
        }
        T ele = front.data;
        front = front.next;
//        if (front == null){
//            rear = null;
//        }
//        count--;
        count--;
        if (count == 0){
            front = null;
            rear = null;
        }
        return ele;
    }

}
