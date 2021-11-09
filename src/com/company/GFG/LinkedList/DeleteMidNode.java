package com.company.GFG.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

public class DeleteMidNode {

    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.

        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }

        Node slow = head;
        for (int i = 0; i < (count/2)-1; i++){
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}
