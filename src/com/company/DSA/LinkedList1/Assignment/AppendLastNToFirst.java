
/* Question

    You have been given a singly linked list of integers along with an integer 'N'.
    Write a function to append the last 'N' nodes towards the front of the singly linked list and
    returns the new head to the list.

    Sample Input 1 :
    1 2 3 4 5 -1
    3
    Sample Output 1 :
    3 4 5 1 2

    Sample Input 1 :
    10 20 30 40 50 60 -1
    5
    Sample Output 1 :
    20 30 40 50 60 10

 */

package com.company.DSA.LinkedList1.Assignment;

import com.company.DSA.LinkedList1.APrintLL.Node;

import com.company.DSA.LinkedList1.DTakeInputLL;

import java.util.Scanner;

public class AppendLastNToFirst {

    public static int lengthOfLL(Node<Integer> head){
        int length = 0;
        Node<Integer> temp = head;
        while (temp != null){
            length++;
            temp = temp.next;
        }

        return length;
    }

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {

        if (head == null){
            return head;
        }

        if (n >= lengthOfLL(head) || n <= 0){
            return head;
        }

        int x = lengthOfLL(head) - n -1;
        Node<Integer> temp = head;
        Node<Integer> lastNode = head;
        while (lastNode.next != null){
            if (x > 0){
                temp = temp.next;
            }
            x--;
            lastNode = lastNode.next;
        }

        lastNode.next = head;
        Node<Integer> newHead = temp.next;
        temp.next = null;
        return newHead;
    }

    // Using fast and slow method
    public static Node<Integer> appendLastNToFirst2(Node<Integer> head, int n) {

        if (n == 0 || head == null){
            return head;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        for (int i = 0; i < n; i++){
            fast = fast.next;
        }

        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        Node<Integer> newHead = slow.next;
        fast.next = head;
        slow.next = null;
        return newHead;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node<Integer> head = DTakeInputLL.takeInput2();
        Node<Integer> newHead = appendLastNToFirst(head, n);
        DTakeInputLL.print(newHead);
    }
}
