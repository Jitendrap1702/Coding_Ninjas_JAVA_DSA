
/* Question

    For a given a singly linked list of integers and a position 'i', print the node data at the 'i-th' position.

 */

package com.company.DSA.LinkedList1;

import com.company.DSA.LinkedList1.APrintLL.Node;

public class CPrintIthNode {

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

    public static void printIthNode(Node<Integer> head, int i){

        while (head != null){
            if (i == 0){
                System.out.println(head.data);
                break;
            }
            head = head.next;
            i--;
        }
    }

    public static void main(String[] args) {

        Node<Integer> head = createLinkedList();
        printIthNode(head, 2);
    }
}
