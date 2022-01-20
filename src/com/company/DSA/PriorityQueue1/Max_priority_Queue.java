// There is implementation of max Priority Queue
package com.company.DSA.PriorityQueue1;

import java.util.ArrayList;

public class Max_priority_Queue<T> {

    private ArrayList<Element<T>> heap;

    public Max_priority_Queue(){
        heap = new ArrayList<>();
    }

    public void insert(T value, int priority){

        Element<T> e = new Element<>(value, priority);
        heap.add(e);
        // now perform upheapify
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;
        while (childIndex > 0){
            if (heap.get(childIndex).priority > heap.get(parentIndex).priority){
                // swap both of them
                Element<T> temp = heap.get(parentIndex);
                heap.set(parentIndex, heap.get(childIndex));
                heap.set(childIndex, temp);
                // update indexes
                childIndex = parentIndex;
                parentIndex = (childIndex-1)/2;
            }else {
                return;
            }
        }
    }

    public T getMax() throws PriorityQueueException {
        if (isEmpty()){
            throw new PriorityQueueException();
        }
        return heap.get(0).value;
    }

    public T removeMax() throws PriorityQueueException {
        if (isEmpty()){
            //return Integer.MIN_VALUE;
            throw new PriorityQueueException();
        }
        Element<T> removed = heap.get(0);
        T ans = removed.value;

        heap.set(0, heap.get(size()-1));
        heap.remove(heap.size()-1);

        int parentIndex = 0;
        int leftChildIndex = 2*parentIndex+1;
        int rightChildIndex = 2*parentIndex+2;

        while (leftChildIndex < heap.size()){
            int minIndex = parentIndex;
            if (heap.get(leftChildIndex).priority > heap.get(minIndex).priority){
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < heap.size() && heap.get(rightChildIndex).priority > heap.get(minIndex).priority){
                minIndex = rightChildIndex;
            }
            if (minIndex == parentIndex){
                break;
            }

            Element<T> temp = heap.get(minIndex);
            heap.set(minIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);

            parentIndex = minIndex;
            leftChildIndex = 2*parentIndex+1;
            rightChildIndex = 2*parentIndex+2;
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

class MaxMain{
    public static void main(String[] args) throws PriorityQueueException{

        Max_priority_Queue<String> pq = new Max_priority_Queue<>();
        pq.insert("abc", 15);
        pq.insert("def", 13);
        pq.insert("ghi", 100);
        pq.insert("jkl", 90);
        pq.insert("mno", 120);

        while (!pq.isEmpty()){
            System.out.println(pq.getMax());
            pq.removeMax();
        }
    }
}
