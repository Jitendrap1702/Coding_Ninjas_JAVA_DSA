
/* Question

    You have been given a singly linked list of integers, an integer value called 'data' and
    a position with the name 'pos.'
    Write a function to add a node to the list with the 'data' at the specified position, 'pos.'

    Sample Input :
    3 4 5 2 6 1 9 -1
    3 100

    Sample Output :
    3 4 5 100 2 6 1 9

 */

package com.company.DSA.LinkedList1;

import com.company.DSA.LinkedList1.APrintLL.Node;

import java.util.Scanner;

public class EInsertNodeInLL {

    public static Node insert(Node<Integer> head, int pos, int data){

        // node which we have to insert
        Node<Integer> nodeToBeInserted = new Node<>(data);
        // if pos is 0 then we have to update the head
        if (pos == 0){
            nodeToBeInserted.next = head;
            return nodeToBeInserted;
        }else{
            int count = 0;
            Node<Integer> prev = head;
            while (count < pos - 1 && prev != null){
                prev = prev.next;
                count++;
            }

            // insert the node at pos
            if (prev != null){
                nodeToBeInserted.next = prev.next;
                prev.next = nodeToBeInserted;
            }

            return head;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        int data = sc.nextInt();

        Node<Integer> head = DTakeInputLL.takeInput2();
        Node<Integer> ans = insert(head, pos, data);
        DTakeInputLL.print(ans);
    }
}
