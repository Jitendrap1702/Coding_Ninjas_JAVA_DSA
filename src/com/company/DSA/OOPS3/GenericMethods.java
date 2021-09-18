package com.company.DSA.OOPS3;

import com.company.DSA.OOPS2.Inheritance.Vehicle;

public class GenericMethods {

    // generic method with T data type
    public static <T> void printArray(T arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Integer arr[] = new Integer[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        printArray(arr);

        String arrS[] = new String[5];
        for (int i = 0; i < arrS.length; i++){
            arrS[i] = String.valueOf((char)('a' + i));
        }
        printArray(arrS);

        Vehicle v[] = new Vehicle[5];
        for (int i = 0; i < v.length; i++){
            v[i] = new Vehicle("black", 230);
        }
        printArray(v);
    }
}
