package com.company.DSA.OOPS.CDynamicArrayClass;

public class DynamicArray {

    private int data[];
    private int nextElementIndex;

    public DynamicArray(){
        data = new int[5];
        nextElementIndex = 0;
    }

    public int size(){
        return nextElementIndex;
    }

    public boolean isEmpty(){
        return nextElementIndex == 0;
    }

    public int get(int i){
        if (i >= nextElementIndex){
            // Throw error
            return -1;
        }
        return data[i];
    }

    public void set(int i,int ele){
        if (i >= nextElementIndex){
            // Throw error
            return;
        }
        data[i] = ele;
    }

    public void addAtLast(int ele){
        if (nextElementIndex == data.length){
            doubleCapacity();
        }
        data[nextElementIndex] = ele;
        nextElementIndex++;
    }

    private void doubleCapacity() {

        int temp[] = data;
        data = new int[2 * temp.length];
        for (int  i = 0; i < temp.length; i++){
            data[i] = temp[i];
        }

    }

    public int removeLast(){
        if (nextElementIndex == 0){
            return -1;
        }
        int lastEle = data[nextElementIndex-1];// get last index element
        data[nextElementIndex-1] = 0;// remove last index element or set to 0
        nextElementIndex--;// decrease last index element by 1
        return lastEle;
    }

    public void addAtI(int i, int ele){
        if (nextElementIndex == data.length){
            doubleCapacity();
        }
        nextElementIndex++;
        for (int j = nextElementIndex; j > i ; j--){// right shift element from i to nextElementIndex elements
            data[j] = data[j-1];
        }
        data[i] = ele;// put ele at index i
    }

    public int removeIth(int i){ // remove and return ith element
        if (nextElementIndex == 0){
            return -1;
        }
        int eleToRemove = data[i];
        nextElementIndex--;
        for (int j = i+1; j <= nextElementIndex; j++){
            data[j-1] = data[j];
        }
        return eleToRemove;
    }
}
