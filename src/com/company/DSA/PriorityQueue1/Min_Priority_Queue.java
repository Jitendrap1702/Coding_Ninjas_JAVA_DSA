// There is implementation of min Priority Queue
package com.company.DSA.PriorityQueue1;

import java.util.ArrayList;

public class Min_Priority_Queue<T> {

    private ArrayList<Element<T>> heap;

    public Min_Priority_Queue(){
        heap = new ArrayList<>();
    }

    public void insert(T value, int priority){

        Element<T> e = new Element<>(value, priority);
        heap.add(e);
        // now perform upheapify operation till child index > 0 and child priority less than parent priority
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex -1)/2;
        while (childIndex > 0){
            if (heap.get(childIndex).priority < heap.get(parentIndex).priority){
                // swap parent ele with child ele
                Element<T> temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                // update child and parent index
                childIndex = parentIndex;
                parentIndex = (childIndex -1)/2;
            }else {
                return;
            }
        }
    }

    public T getMin() throws PriorityQueueException {
        if (isEmpty()){
            throw new PriorityQueueException();
        }
        return heap.get(0).value;
    }

    public T removeMin() throws PriorityQueueException {
        if (isEmpty()){
            throw new PriorityQueueException();
        }
        // replace min element by last element of array and remove last element
        Element<T> removed = heap.get(0);
        T ans = removed.value;

        heap.set(0, heap.get(size()-1));
        heap.remove(size()-1);
        /* now perform down Heapify operation
         *  while parent index is not leaf
         *  or parent index have less priority than child index priority
         */

        int parentIndex = 0;
        int leftChildIndex = 2*parentIndex+1;
        int rightChildIndex = 2*parentIndex+2;

        // left child is not exist that's mean right child will also not exist
        while (leftChildIndex < heap.size()){
            // By default take parent index as min priority index
            int minIndex = parentIndex;
            // find the min priority index between parentIndex, leftChildIndex and rightChildIndex
            if (heap.get(minIndex).priority > heap.get(leftChildIndex).priority){
                minIndex = leftChildIndex;
            }
            // while comparing with right child index we should check right child index is exist or not
            if (rightChildIndex < heap.size() && heap.get(minIndex).priority > heap.get(rightChildIndex).priority){
                minIndex = rightChildIndex;
            }
            // if minIndex is parent index than no need of swapping because heap will remain same
            if (minIndex == parentIndex){
                break;
            }

            // if minIndex is not parent index (it can be left or right index than we will swap them
            Element<T> temp = heap.get(minIndex);
            heap.set(minIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);
            // update parent index, left child index and right child index
            parentIndex = minIndex;
            leftChildIndex = 2*parentIndex+1;
            rightChildIndex = 2*parentIndex+2;
            // repeat whole process again
            // for new parent index, left child index and right child index
        }
        return ans;
    }

    public int size(){
        return heap.size();
    }

    public boolean isEmpty(){
        return heap.size() == 0;
    }
}

class MinMain{
    public static void main(String[] args) throws PriorityQueueException{

        Min_Priority_Queue<String> pq = new Min_Priority_Queue<>();
        pq.insert("abc", 15);
        pq.insert("def", 13);
        pq.insert("ghi", 100);
        pq.insert("jkl", 90);
        pq.insert("mno", 120);

        while (!pq.isEmpty()){
            System.out.println(pq.getMin());
            pq.removeMin();
        }
    }
}
