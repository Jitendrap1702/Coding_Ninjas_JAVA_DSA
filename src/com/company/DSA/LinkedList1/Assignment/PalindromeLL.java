package com.company.DSA.LinkedList1.Assignment;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;

public class PalindromeLL {


    // O(n) time complexity
    public static boolean isPalindrome(Node<Integer> head) {

        if (head == null){
            return true;
        }

        // 1. find the mid of the given linked list
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while (fast != null && fast.next != null && fast.next.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. reverse the second part of linked list
        Node<Integer> curr = slow.next;
        slow.next = null; // to divide linked list in two parts
        Node<Integer> prev = null;
        while (curr != null){
            Node<Integer> temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // 3. here pre is the head of second linked list and head will be the head first linked list
        fast = prev;
        slow = head;

        // 4. now we will compare the elements of both linked list
        while (fast != null && slow != null){
            if (!fast.data.equals(slow.data)){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {

        Node<Integer> head = DTakeInputLL.takeInput2();
        boolean ans = isPalindrome(head);
        System.out.println(ans);
    }
}
