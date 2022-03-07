
/* Question

    You have been given a linked list of integers.
    Your task is to write a function that deletes a node from a given position, 'POS'.

    Sample Input :
    3 4 5 2 6 1 9 -1
    3

    Sample Output :
    3 4 5 6 1 9

 */

package com.company.DSA.LinkedList1;

import com.company.DSA.LinkedList1.APrintLL.Node;

import java.util.LinkedList;
import java.util.Scanner;

public class FDeleteNodeInLL {

//    public static int lengthOfLL(Node<Integer> head){
//        int length = 0;
//        Node<Integer> temp = head;
//        while (temp != null){
//            length++;
//            temp = temp.next;
//        }
//
//        return length;
//    }

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {

//        // if pos is out of range
//        if (pos < 0 || pos > lengthOfLL(head)){
//            return head;
//        }

        // if pos is 0 and head is not null then update head to next node
        if (pos == 0 && head != null){
            head = head.next;
            return head;
        }else{
            int count = 0;
            Node<Integer> prev = null;
            Node<Integer> curr = head;
            while (count < pos && curr != null){

                prev = curr;
                curr = curr.next;
                count++;
            }
            if (head == null){
                return head;
            }
            if (curr == null){ // or prev.next == null
                return head;
            }
            prev.next = curr.next;
        }
        return head;
    }

    public static Node<Integer> deleteNode2(Node<Integer> head, int pos){

        if (pos == 0){
            return head.next;
        }

        Node<Integer> prev = head;
        while (pos > 1 && prev != null){ // reach at pos-1
            prev = prev.next;
            pos--;
        }
        // delete node at pos
        if (prev != null && prev.next != null){
            prev.next = prev.next.next;
        }
        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node<Integer> head = DTakeInputLL.takeInput2();
        int pos = sc.nextInt();
        Node<Integer> ans = deleteNode2(head, pos);
        DTakeInputLL.print(ans);

    }
}
