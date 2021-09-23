package com.company.DSA.LinkedList1;

import com.company.DSA.LinkedList1.APrintLL.Node;

import java.util.Scanner;

public class DTakeInputLL {

    // O(n**2) complexity
    public static Node<Integer> takeInput1(){

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        Node<Integer> head = null;
        while (data != -1){
            Node<Integer> currentNode = new Node<>(data);
            if (head == null){
                // made this node as head node
                head = currentNode;
            }else{
                Node<Integer> tail = head;
                while (tail.next != null){
                    tail = tail.next;
                }
                // Now tail will refer to last node
                // Connect current node after last node
                tail.next = currentNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    // Optimised take input solution with O(n) complexity
    public static Node<Integer> takeInput2(){

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data != -1){
            Node<Integer> currentNode = new Node<>(data);
            if (head == null){
                // made this node as head node and tail node
                head = currentNode;
                tail = currentNode;
            }else{
                tail.next = currentNode;
                tail = tail.next; // or tail = currentNode
            }

            data = sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node<Integer> head = takeInput1();
        print(head);

        Node<Integer> head2 = takeInput2();
        print(head2);
    }
}
