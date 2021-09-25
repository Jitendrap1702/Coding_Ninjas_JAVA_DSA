package com.company.DSA.LinkedList2;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;

public class GMergeSort {

    public static Node<Integer> midPoint(Node<Integer> head) {

        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){

        if (head1 == null){
            return head2;
        }

        if (head2 == null){
            return head1;
        }

        Node<Integer> t1 = head1, t2 = head2;
        Node<Integer> head;
        Node<Integer> tail;
        if (t1.data < t2.data){
            head = t1;
            tail = t1;
            t1 = t1.next;
        }else{
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        while (t1 != null && t2 != null){

            if (t1.data < t2.data){
                tail.next = t1;
                tail = tail.next;
                t1 = t1.next;
            }else{
                tail.next = t2;
                tail = tail.next;
                t2 = t2.next;
            }
        }

        // one list is over
        // first list is still remaining
        if (t1 != null){
            tail.next = t1;
        }

        // second list is still remaining
        if (t2 != null){
            tail.next = t2;
        }

        return head;
    }

    public static Node<Integer> mergeSort(Node<Integer> head) {

        // Base case
        if (head == null){
            return head;
        }

        if (head.next == null){
            return head;
        }

        // Divide in two parts
        Node<Integer> mid = midPoint(head);
        Node<Integer> part1Head = head;
        Node<Integer> part2Head = mid.next;
        mid.next = null;

        // call mergesort in both part
        Node<Integer> h1 = mergeSort(part1Head);
        Node<Integer> h2 = mergeSort(part2Head);

        // merge both sorted parts and return new head
        Node<Integer> ans = merge(h1, h2);
        return ans;
    }

    public static void main(String[] args) {

        Node<Integer> head = DTakeInputLL.takeInput2();
        Node<Integer> ans = mergeSort(head);
        DTakeInputLL.print(ans);
    }
}
