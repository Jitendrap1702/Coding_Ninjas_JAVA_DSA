
/* Question

    Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and
    return its modified list.
    'k' is a positive integer and is less than or equal to the length of the linked list.
    If the number of nodes is not a multiple of 'k,' then left-out nodes, in the end, should be reversed as well.

    Example :
    Given this linked list: 1 -> 2 -> 3 -> 4 -> 5

    For k = 2, you should return: 2 -> 1 -> 4 -> 3 -> 5

    For k = 3, you should return: 3 -> 2 -> 1 -> 5 -> 4

 */

package com.company.DSA.LinkedList2.Assignment;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;
import com.company.DSA.LinkedList2.DoubleNode;
import java.util.Scanner;


public class EKReverse {

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

    public static Node<Integer> kReverse(Node<Integer> head, int k) {

        if (head == null || head.next == null || k <= 0){
            return head;
        }

        Node<Integer> currHead = head;
        Node<Integer> currTail = head;

        int count = 1;
        while (currTail .next != null && count < k){
            currTail = currTail.next;
            count++;
        }

        Node<Integer> nextHead = currTail.next;
        currTail.next = null;
        DoubleNode x = reverseBetter(currHead);
        x.tail.next = kReverse(nextHead, k);

        return x.head;
    }


    // reverse every k part iteratively and then call recursion in remaining part
    public static Node<Integer> kReverse2(Node<Integer> head, int k){
        if (head == null){
            return head;
        }

        Node<Integer> curr = head;
        Node<Integer> prev = null;
        Node<Integer> next = null;

        // reverse k part iteratively
        int count = 0;
        while (count < k && curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;

        }

        // recursively reverse (K+1)th to last node  and point to head(which is now tail of first k part)
        if (next != null){
            head.next = kReverse2(next, k);
        }

        // prev is now head of linked list
        return prev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        Node<Integer> head = DTakeInputLL.takeInput2();
        Node<Integer> ans = kReverse(head, k);
        DTakeInputLL.print(ans);
    }
}
