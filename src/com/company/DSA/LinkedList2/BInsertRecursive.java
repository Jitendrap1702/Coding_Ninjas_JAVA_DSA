package com.company.DSA.LinkedList2;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;

import java.util.Scanner;

public class BInsertRecursive {

    public static Node<Integer> insertRecursive(Node<Integer> head, Node<Integer> nodeToBeInserted, int pos){

        // Base case
        if (head == null && pos > 0){
            return head;
        }
        if (pos == 0){
            nodeToBeInserted.next = head;
            return nodeToBeInserted;
        }else {
            head.next = insertRecursive(head.next, nodeToBeInserted, pos - 1);
            return head;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        int data = sc.nextInt();
        Node<Integer> nodeToBeInserted = new Node<>(data);

        Node<Integer> head = DTakeInputLL.takeInput2();
        Node<Integer> ans = insertRecursive(head, nodeToBeInserted, pos);
        DTakeInputLL.print(ans);
    }
}
