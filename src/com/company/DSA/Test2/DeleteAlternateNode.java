
/* Question

    Given a Singly Linked List of integers, delete all the alternate nodes in the list.

    Example:
    List: 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
    Alternate nodes will be:  20, 40, and 60.

    Hence after deleting, the list will be:
    Output: 10 -> 30 -> 50 -> null

 */

package com.company.DSA.Test2;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;

public class DeleteAlternateNode {

    public static void deleteAlternateNodes(Node<Integer> head) {

        int count = 1;
        Node<Integer> temp = head;
        Node<Integer> prev = null;
        while (temp != null){

            if (count % 2 == 0){
                prev.next = temp.next;
                temp = temp.next;
                count++;
            }
            else {
                prev = temp;
                temp = temp.next;
                count++;
            }
        }
    }

    public static void main(String[] args) {

        Node<Integer> head = DTakeInputLL.takeInput2();
        deleteAlternateNodes(head);
        DTakeInputLL.print(head);
    }
}
