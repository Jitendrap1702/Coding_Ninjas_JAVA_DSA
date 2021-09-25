
/* Question

    For a given singly linked list of integers, arrange the elements such that all the even numbers are placed after the odd numbers.
    The relative order of the odd and even terms should remain unchanged.

    Sample Input :
    1 4 5 2 -1

    Sample Output :
    1 5 4 2

 */
package com.company.DSA.LinkedList2.Assignment;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;

public class BEvenAfterOdd {

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {

        Node<Integer> even = null;
        Node<Integer> tailEven = null;
        Node<Integer> odd = null;
        Node<Integer> tailOdd = null;

        while (head != null){

            if (head.data % 2 == 0){
                if (even == null){
                    even = head;
                }else{
                    tailEven.next = head;
                }
                tailEven = head;
            }else{
                if (odd == null){
                    odd = head;
                }else{
                    tailOdd.next = head;
                }
                tailOdd = head;
            }
            head = head.next;
        }

        // connect even after odd
        if (odd == null){
            return even;
        }
        else if (even == null){
            return odd;
        }
        else{
            tailOdd.next = even;
            tailEven.next = null;
            return odd;
        }
    }

    public static void main(String[] args) {

        Node<Integer> head = DTakeInputLL.takeInput2();
        Node<Integer> ans = evenAfterOdd(head);
        DTakeInputLL.print(ans);
    }
}
