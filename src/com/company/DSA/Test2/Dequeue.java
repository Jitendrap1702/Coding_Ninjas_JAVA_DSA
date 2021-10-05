
/* Question

    You need to implement a class for Dequeue i.e. for double ended queue. In this queue,
    elements can be inserted and deleted from both the ends.
    You don't need to double the capacity.
    You need to implement the following functions -

    1. constructor
    You need to create the appropriate constructor. Size for the queue passed is 10.

    2. insertFront -
    This function takes an element as input and insert the element at the front of queue.
    Insert the element only if queue is not full. And if queue is full, print -1 and return.

    3. insertRear -
    This function takes an element as input and insert the element at the end of queue.
    Insert the element only if queue is not full. And if queue is full, print -1 and return.

    4. deleteFront -
    This function removes an element from the front of queue. Print -1 if queue is empty.

    5. deleteRear -
    This function removes an element from the end of queue. Print -1 if queue is empty.

    6. getFront -
    Returns the element which is at front of the queue. Return -1 if queue is empty.

    7. getRear -
    Returns the element which is at end of the queue. Return -1 if queue is empty.

 */

package com.company.DSA.Test2;

public class Dequeue {

    int[] data;
    int rear;
    int front;
    int count;

    public Dequeue(int n){

        data = new int[n];
        rear = -1;
        front = -1;
        count = 0;
    }

    public void insertFront(int ele){

        if (count == data.length){
            System.out.println(-1);
            return;
        }

        if (count == 0){
            rear = 0;
            front = 0;
        }
        else if (front == 0){
            front = data.length-1;
        }
        else{
            front--;
        }
        count++;
        data[front] = ele;
    }

    public void insertRear(int ele){

        if (count == data.length){
            System.out.println(-1);
            return;
        }

        if (count == 0){
            rear = 0;
            front = 0;
        }
        else if (rear == data.length-1){
            rear = 0;
        }
        else{
            rear++;
        }
        count++;
        data[rear] = ele;
    }

    public int deleteFront(){

        if (count == 0){
            return -1;
        }

        int frontEle = data[front];
        count--;

        //If only one element is present
        if(front == rear) {
            front = rear = -1;
        }
        //If front points to the last element
        else if(front == data.length-1) {
            front = 0;
        }
        else {
            ++front;
        }

        return frontEle;
    }

    public int deleteRear(){

        if (count == 0){
            return -1;
        }

        int rearEle = data[rear];
        count--;

        //If only one element is present
        if(front == rear) {
            front = rear = -1;
        }
        //If rear points to the first position element
        else if(rear == 0) {
            rear = data.length - 1;
        }
        else {
            --rear;
        }

        return rearEle;
    }

    public int getFront(){

        if (count == 0){
            return -1;
        }
        return data[front];
    }

    public int getRear(){

        if (count == 0){
            return -1;
        }
        return data[rear];
    }
}
