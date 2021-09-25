
/* Question

    Given a singly linked list of integers, reverse it using recursion and return the head to the modified list.
    You have to do this in O(N) time complexity where N is the size of the linked list.

    Sample Input :
    1 2 3 4 5 6 7 8 -1

    Sample Output :
    8 7 6 5 4 3 2 1

 */

package com.company.DSA.LinkedList2;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;

public class DReverse {

    // Iterative Method :- O(n) Time complexity
    public static Node<Integer> reverse(Node<Integer> head) {

        Node<Integer> prev = null;
        Node<Integer> curr = head;

        while (curr != null) {

            Node<Integer> temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    // Recursive method :- O(n**2) time complexity
    public static Node<Integer> reverse2(Node<Integer> head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> reverseHead = reverse2(head.next);
        Node<Integer> tail = reverseHead;
        while (tail.next != null){
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;
        return reverseHead;
    }

    // Recursive method :- O(n) time complexity
    public static DoubleNode reverseBetter(Node<Integer> head) {

        DoubleNode ans;
        if (head == null || head.next == null) {
            ans = new DoubleNode(head, head);
            return ans;
        }
        // This double node will have both head and tail of reversed LL
        DoubleNode smallAns = reverseBetter(head.next);
        smallAns.tail.next = head;
        head.next = null;

        ans = new DoubleNode(smallAns.head, head);
        return ans;
    }

    public static Node<Integer> reverseBetterMain(Node<Integer> head){
        DoubleNode ans = reverseBetter(head);
        return ans.head;
    }

    // Best Recursive method :- time complexity O(n)

    public static Node<Integer> reverseBest(Node<Integer> head){

        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> smallHead = reverseBest(head.next);
        head.next.next = head;
        head.next = null;
        return smallHead;
    }


    public static void main(String[] args) {

        Node<Integer> head = DTakeInputLL.takeInput2();
        // iterative
//        Node<Integer> ans = reverse(head);
//        DTakeInputLL.print(ans);

        // recursive
//        Node<Integer> ans2 = reverse2(head);
//        DTakeInputLL.print(ans2);

        // recursive better
//        Node<Integer> ans = reverseBetterMain(head);
//        DTakeInputLL.print(ans);

        // recursive Best
        Node<Integer> ans = reverseBest(head);
        DTakeInputLL.print(ans);
    }
}
