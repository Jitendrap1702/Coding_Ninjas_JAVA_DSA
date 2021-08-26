package com.company.DSA.OOPS.CDynamicArrayClass;

public class DynamicArrayUse {

    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();
        d.addAtLast(6);
        d.addAtLast(7);
        d.addAtLast(8);
        d.addAtLast(9);
        d.addAtLast(10);
        d.addAtLast(11);

        // print array
        for (int i = 0; i < d.size(); i++){
            System.out.println(d.get(i));
        }

        // size of array
        System.out.println(d.size());

        // add at i and print
        d.addAtI(0, 23);
        // print array
        for (int i = 0; i < d.size(); i++){
            System.out.println(d.get(i));
        }

        System.out.println("size :- " + d.size());

        //Remove element from ith index
        int ele = d.removeIth(2);
        System.out.println(ele);
        for (int i = 0; i < d.size(); i++){
            System.out.println(d.get(i));
        }
    }
}
