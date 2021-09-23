
/* Question

    For a given singly linked list of integers, find and return its length. Do it using an iterative method.

 */

package com.company.DSA.LinkedList1;

import com.company.DSA.LinkedList1.APrintLL.Node;

public class BLengthOfLL2 {

    public static Node<Integer> createLinkedList(){

        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return n1; // return head
    }

    public static int lengthOfLL(Node<Integer> head){
        int length = 0;
        Node<Integer> temp = head;
        while (temp != null){
            length++;
            temp = temp.next;
        }

        return length;
    }

    public static void main(String[] args) {

        Node<Integer> head = createLinkedList();
        int length = lengthOfLL(head);
        System.out.println(length);
    }
}
