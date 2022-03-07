
/* Question

    Given a singly linked list of integers and an integer n,
    find and return the index for the first occurrence of 'n' in the linked list. -1 otherwise.

    Sample Input :
    10 20010 30 400 600 -1
    20010

    Sample Output :
    1

 */
package com.company.DSA.LinkedList2.Assignment;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;

import java.util.Scanner;

public class AFindNode {

    public static int findNodeIterative(Node<Integer> head, int n) {

        int count = 0;
        Node<Integer> temp = head;
        while (temp != null){
            if (temp.data == n){
                return count;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public static int findNodeRec(Node<Integer> head, int n) {

        if(head == null){
            return -1;
        }
        if (head.data == n){
            return 0;
        }

        int smallAns = findNodeRec(head.next, n);
        if (smallAns != -1){
            return 1 + smallAns;
        }else {
            return -1;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();

        Node<Integer> head = DTakeInputLL.takeInput2();
        int index = findNodeRec(head, ele);
        System.out.println(index);
    }
}
