
/*
Given a binary tree, write code to create a separate linked list for each level.
You need to return the array which contains head of each level linked list.
Input format :
The first line of input contains data of the nodes of the tree in level order form.
The data of the nodes of the tree is separated by space. If any node does not have left or right child,
take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore,
it will not be a part of the data of any node.
Output format :
Each level linked list is printed in new line (elements are separated by space).
Constraints:
Time Limit: 1 second
Sample Input 1:
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 1:
5
6 10
2 3
9
 */

package com.company.DSA.BST2.Assignment;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;
import com.company.DSA.LinkedList1.APrintLL.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelWiseLinkedList {

    public static ArrayList<Node<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){

        ArrayList<Node<Integer>> ans = new ArrayList<>();

        if (root == null){
            return ans;
        }

        // create a queue to store root at each level of tree
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        // Add root to the Queue
        queue.add(root);

        while (!queue.isEmpty()){

            int size = queue.size();
            if (size == 0){
                break;
            }

            // create a linked list
            Node<Integer> head = null;
            Node<Integer> tail = null;
            // remove and print each node at current level
            while (size > 0){

                // take out front node
                BinaryTreeNode<Integer> front = queue.remove();

                // add to linked list
                if (head == null){
                    head = new Node(front.data);
                    tail = head;
                }else {
                    tail.next = new Node<>(front.data);
                    tail = tail.next;
                }

                // check front nodes children
                // left children
                if (front.left != null) {
                    // add left of front node to the queue
                    queue.add(front.left);
                }
                // right children
                if (front.right != null) {
                    // add right of front node to the queue
                    queue.add(front.right);
                }

                size--;

            }

            ans.add(head);
        }

        return ans;
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
        ArrayList<Node<Integer>> output = constructLinkedListForEachLevel(root);

        for (Node<Integer> i : output){

            while (i != null){
                System.out.print(i.data + " ");
                i = i.next;
            }
            System.out.println();
        }
    }
}
