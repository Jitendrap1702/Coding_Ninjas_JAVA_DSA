package com.company.DSA.OOPS3.BoundedGenerics;

import com.company.DSA.OOPS2.Inheritance.Vehicle;

public class Print {

    // So it can receive all the classes which implements PrintInterface
    // generic method with T data type
    public static <T extends PrintInterface> void printArray(T arr[]){
        for (int i = 0; i < arr.length; i++){
            arr[i].print();
        }
    }

    public static void main(String[] args) {

        com.company.DSA.OOPS3.BoundedGenerics.Vehicle v[] = new com.company.DSA.OOPS3.BoundedGenerics.Vehicle[5];
        for (int i = 0; i < v.length; i++){
            v[i] = new com.company.DSA.OOPS3.BoundedGenerics.Vehicle("black", 20*i);
        }

        printArray(v);
    }
}
