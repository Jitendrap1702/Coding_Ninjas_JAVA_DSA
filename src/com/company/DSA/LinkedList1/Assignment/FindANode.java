
/* Question

    You have been given a singly linked list of integers.
    Write a function that returns the index/position of integer data denoted by 'N' (if it exists).
    Return -1 otherwise.

    Note : Assume that the Indexing for the singly linked list always starts from 0.

    Sample Input 1 :
    3 4 5 2 6 1 9 -1
    5
    Sample Output 1 :
    2

    Sample Input 2 :
    10 20 30 40 50 60 70 -1
    6
    Sample Output 2 :
    -1

 */

package com.company.DSA.LinkedList1.Assignment;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;

import java.util.Scanner;

public class FindANode {

    public static int findNode(Node<Integer> head, int n) {
        int pos = 0;
        Node<Integer> temp = head;
        while (temp != null){
            if (temp.data == n){
                return pos;
            }
            pos++;
            temp = temp.next;
        }
        // if element not found then return -1
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node<Integer> head = DTakeInputLL.takeInput2();
        int pos = findNode(head, n);
        System.out.println(pos);
    }
}
