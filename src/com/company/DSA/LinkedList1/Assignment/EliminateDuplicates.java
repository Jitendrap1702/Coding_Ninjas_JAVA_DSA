
/* Question

    You have been given a singly linked list of integers where the elements are sorted in ascending order.
    Write a function that removes the consecutive duplicate values such that the given list only
    contains unique elements and returns the head to the updated list.

    Sample Input :
    1 2 3 3 3 3 4 4 4 5 5 7 -1

    Sample Output :
    1 2 3 4 5 7

 */

package com.company.DSA.LinkedList1.Assignment;

import com.company.DSA.LinkedList1.APrintLL.Node;

import com.company.DSA.LinkedList1.DTakeInputLL;

public class EliminateDuplicates {

    public static Node<Integer> removeDuplicates(Node<Integer> head) {

        if (head == null){
            return head;
        }

        Node<Integer> temp = head;
        while (temp.next != null){

            if (temp.data.equals(temp.next.data)){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }

        return head;
    }


    public static void main(String[] args) {

        Node<Integer> head = DTakeInputLL.takeInput2();
        Node<Integer> ans = removeDuplicates(head);
        DTakeInputLL.print(ans);
    }
}
