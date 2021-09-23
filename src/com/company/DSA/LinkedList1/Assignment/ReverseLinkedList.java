
/* Question

    You have been given a singly linked list of integers. Write a function to print the list in a reverse order.

    To explain it further, you need to start printing the data from the tail and move towards the head of the list,
    printing the head data at the end.

    Sample Input :
    1 2 3 4 5 -1

    Sample Output :
    5 4 3 2 1

 */

/*
    O(n) time complexity
 */

package com.company.DSA.LinkedList1.Assignment;

import com.company.DSA.LinkedList1.APrintLL.Node;

import com.company.DSA.LinkedList1.DTakeInputLL;

public class ReverseLinkedList {

    public static void printReverse(Node<Integer> root) {

        if (root == null){
            return;
        }
        printReverse(root.next);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        Node<Integer> head = DTakeInputLL.takeInput2();
        printReverse(head);
    }
}
