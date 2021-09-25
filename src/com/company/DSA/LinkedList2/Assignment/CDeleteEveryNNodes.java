
/* Question

    You have been given a singly linked list of integers along with two integers, 'M,' and 'N.'
    Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes.
    Continue the same until the end of the linked list.

    To put it in other words, in the given linked list, you need to delete N nodes after every M nodes.

    Sample Input :
    1 2 3 4 5 6 7 8 -1
    2 2

    Sample Output :
    1 2 5 6

 */

package com.company.DSA.LinkedList2.Assignment;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;

import java.util.Scanner;

public class CDeleteEveryNNodes {

    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {

        Node<Integer> curr = head;

        if (M == 0){
            return null;
        }

        if (N == 0){
            return head;
        }

        while (curr != null){

            // skip M elements
            for (int i = 0; i < M-1; i++){
                if (curr == null){
                    return head;
                }else{
                    curr = curr.next;
                }
            }

            if (curr == null){
                return head;
            }

            // Start from next node and delete N nodes
            Node<Integer> temp = curr.next;
            for (int i = 0; i < N; i++){
                if (temp == null){
                    break;
                }else{
                    temp = temp.next;
                }
            }

            // Link the previous list with remaining nodes
            curr.next = temp;
            // Set Current pointer for next iteration
            curr = temp;
        }

        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        Node<Integer> head = DTakeInputLL.takeInput2();
        Node<Integer> ans = skipMdeleteN(head, m, n);
        DTakeInputLL.print(ans);
    }
}
