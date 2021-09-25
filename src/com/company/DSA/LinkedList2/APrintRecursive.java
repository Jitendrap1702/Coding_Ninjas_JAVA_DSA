package com.company.DSA.LinkedList2;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;

public class APrintRecursive {

    public static void printRecursive(Node<Integer> head){

        // base case
        if (head == null){
            return;
        }
        // small calculation
        System.out.print(head.data + " ");
        // recursive call
        printRecursive(head.next);
    }

    public static void main(String[] args) {

        Node<Integer> head = DTakeInputLL.takeInput2();
        printRecursive(head);
    }
}
