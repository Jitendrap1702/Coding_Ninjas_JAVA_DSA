package com.company.DSA.LinkedList2.Assignment;

import com.company.DSA.LinkedList1.APrintLL.Node;
import com.company.DSA.LinkedList1.DTakeInputLL;

public class FBubbleSort {

    public static int lengthOfLL(Node<Integer> head){
        int length = 0;
        Node<Integer> temp = head;
        while (temp != null){
            length++;
            temp = temp.next;
        }

        return length;
    }

    public static Node<Integer> bubbleSort(Node<Integer> head) {

        Node<Integer> last = null;
        while (last != head){
            Node<Integer> p = head;
            while (p.next != last){
                Node<Integer> q = p.next;
                if (p.data > q.data){
                    int temp = q.data;
                    q.data = p.data;
                    p.data = temp;
                }
                p = p.next;
            }
            last = p;
        }
        return last;
    }

    public static void main(String[] args) {

        Node<Integer> head = DTakeInputLL.takeInput2();
        Node<Integer> ans = bubbleSort(head);
        DTakeInputLL.print(ans);
    }
}
