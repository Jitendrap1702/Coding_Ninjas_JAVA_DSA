
/* Question

    Given a large number represented in the form of a linked list.
    Write code to increment the number by 1 in-place(i.e. without using extra space).

    Input format :
    Line 1 : Linked list elements (separated by space and terminated by -1)
    Output Format :
    Line 1: Updated linked list elements

    Sample Input 1 :
    3 9 2 5 -1
    Sample Output 1 :
    3 9 2 6

    Sample Input 2 :
    9 9 9 -1
    Sample Output 1 :
    1 0 0 0

 */

package com.company.DSA.Test2;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;
import com.company.DSA.LinkedList2.DReverse;

public class NextNumber {

    public static Node<Integer> nextLargeNumber(Node<Integer> head) {

        head = DReverse.reverse(head);
        // res is head node of the resultant list
        Node<Integer> res = head;
        Node<Integer> temp = null;

        int carry = 1, sum;

        while (head != null) // while both lists exist
        {
            // Calculate value of next digit in resultant
            // list. The next digit is sum of following
            // things (i) Carry (ii) Next digit of head list
            // (if there is a next digit)
            sum = carry + head.data;

            // update carry for next calculation
            carry = (sum >= 10) ? 1 : 0;

            // update sum if it is greater than 10
            sum = sum % 10;

            // Create a new node with sum as data
            head.data = sum;

            // Move head and second pointers to next nodes
            temp = head;
            head = head.next;
        }

        // if some carry is still there, add a new node to
        // result list.
        if (carry > 0)
            temp.next = new Node<>(carry);

        // return head of the resultant list
        head = DReverse.reverse(res);
        return head;
    }


    public static void main(String[] args) {

        Node<Integer> head = DTakeInputLL.takeInput2();
        Node<Integer> ans = nextLargeNumber(head);
        DTakeInputLL.print(ans);
    }
}
