
/* Question

    You have been given a singly linked list of integers along with two integers, 'i,' and 'j.'
    Swap the nodes that are present at the 'i-th' and 'j-th' positions.

    Note :- Don't swap data, swap nodes

    Sample Input :
    3 4 5 2 6 1 9 -1
    3 4

    Sample Output :
    3 4 5 6 2 1 9

 */

package com.company.DSA.LinkedList2.Assignment;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;

import java.util.Scanner;

public class DSwapTwoNodes {

    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {

        // nothing to do if i and j are same
        if (i == j){
            return head;
        }

        // search for x (keeps track of currX and prevX)
        Node<Integer> prevX = null;
        Node<Integer> currX = head;
        while (currX != null && i > 0){
            prevX = currX;
            currX = currX.next;
            i--;
        }

        // search for y (keeps track of currY and prevY)
        Node<Integer> prevY = null;
        Node<Integer> currY = head;
        while (currY != null && j > 0){
            prevY = currY;
            currY = currY.next;
            j--;
        }

        // if either x or y is not present, nothing to do
        if (currX == null || currY == null){
            return head;
        }

        // if x is not head of linked list
        if (prevX != null){
            prevX.next = currY;
        }
        // if x is head
        else{
            head = currY;
        }

        // if y is not head of linked list
        if (prevY != null){
            prevY.next = currX;
        }
        // if y is head
        else{
            head = currX;
        }

        // swap next pointers
        Node<Integer> temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        Node<Integer> head = DTakeInputLL.takeInput2();
        Node<Integer> ans = swapNodes(head, i, j);
        DTakeInputLL.print(ans);
    }
}
