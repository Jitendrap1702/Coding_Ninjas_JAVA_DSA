
/* Question

    Given a singly linked list of integers and position 'i',
    delete the node present at the 'i-th' position in the linked list recursively.

    Sample Input :
    3 4 5 2 6 1 9 -1
    3

    Sample Output :
    3 4 5 6 1 9

 */

package com.company.DSA.LinkedList2;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;

import java.util.Scanner;

public class CDeleteRecursive {

    // Time Complexity O(n)
    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {

        if (head == null){
            return head;
        }
        if (pos == 0){
            return head.next;
        }

        head.next = deleteNodeRec(head.next, pos-1);
        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();

        Node<Integer> head = DTakeInputLL.takeInput2();
        Node<Integer> ans = deleteNodeRec(head, pos);
        DTakeInputLL.print(ans);
    }
}
