package com.company.DSA.LinkedList2;

import java.util.LinkedList;

public class HLinkedListInCollections {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 100);
        list.addFirst(80);

        list.remove();
        list.remove(2);
        list.set(0, 99);

        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }
}
