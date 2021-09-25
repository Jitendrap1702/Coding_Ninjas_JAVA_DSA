
/* Question

    You have been given two sorted(in ascending order) singly linked lists of integers.
    Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order)
    and return the new head to the list.

    Sample Input :
    2 5 8 12 -1
    3 6 9 -1

    Sample Output :
    2 3 5 6 8 9 12

 */

package com.company.DSA.LinkedList2;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;

public class FMergeTwoSorted {

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

    public static void main(String[] args) {

        Node<Integer> head1 = DTakeInputLL.takeInput2();
        Node<Integer> head2 = DTakeInputLL.takeInput2();

        Node<Integer> ans = merge(head1, head2);
        DTakeInputLL.print(ans);
    }
}
