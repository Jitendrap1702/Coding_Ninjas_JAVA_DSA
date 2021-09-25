
/* Question

    For a given singly linked list of integers, find and return the node present at the middle of the list.

    Sample Input :
    1 2 3 4 -1

    Sample Output :
    2

 */

package com.company.DSA.LinkedList2;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;

public class EMidPoint {

    public static Node<Integer> midPoint(Node<Integer> head) {

        Node<Integer> slow = head;
        Node<Integer> fast = head;
        
        while (fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        Node<Integer> head = DTakeInputLL.takeInput2();
        Node<Integer> ans = midPoint(head);
        System.out.println(ans.data);
    }
}
