package com.company.GFG.LinkedList;


import java.util.LinkedList;

public class QuickSort {

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static Node partition(Node start, Node end){

        Node pivot_prev = start;
        Node curr = start;
        int pivot = end.data; // we will take end node as pivot
        while (start != end){
            // if start data less than pivot :- update pivot_prev, swap curr with start, update curr
            if (start.data < pivot){
                pivot_prev = curr; // update pivot_prev
                swap(curr.data, start.data); // swap curr with start
                curr = curr.next; // update curr
            }
            // if start data less than or not
            start = start.next;
        }
        // swap curr data and end data (pivot)
        swap(curr.data, end.data);

        // return pivot_prev
        return pivot_prev;
    }

    public static Node quickSort(Node start, Node end){

        // if linked list contain 1 or lesser than 1 nodes
        if (start == end){
            return start;
        }

        // partition function will written previous node of pivot node
        Node pivot_prev = partition(start, end);
        Node left = quickSort(start, pivot_prev);
        Node right = quickSort(pivot_prev.next, end);

        Node leftTail = left;
        while (leftTail.next != null){
            leftTail = leftTail.next;
        }
//        leftTail.next = right;
//        return left;

        if (left != null){
            leftTail.next = right;
            return left;
        }
        else {
            return right;
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 15, 8, 7, 9};
        // build a linked list from array
        Node head = null, curr = null;
        for (int i : arr){
            Node x = new Node(i);
            if (head == null){
                head = x;
                curr = x;
            }
            else{
                curr.next = x;
                curr = x;
            }
        }

        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        Node ans = quickSort(head, curr);

        System.out.println();

        while (ans != null){
            System.out.print(ans.data + " ");
            ans = ans.next;
        }

    }
}
