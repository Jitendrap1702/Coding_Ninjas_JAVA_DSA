
/*
Given a BST, convert it into a sorted linked list. You have to return the head of LL.
Input format:
The first and only line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
Output Format:
The first and only line of output prints the elements of sorted linked list.
Constraints:
Time Limit: 1 second
Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
Sample Output 1:
2 5 6 7 8 10
 */

package com.company.DSA.BST1.Assignment;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;
import com.company.DSA.LinkedList1.APrintLL.Node;

class NodeReturn<T>{

    T head;
    T tail;
}

public class BSTToLL {

    // here Node<Integer> is linked list node
    public static NodeReturn<Node<Integer>> constructLinkedList(BinaryTreeNode<Integer> root) {

        if (root == null){
            return new NodeReturn<>();
        }

        // if right and left of root is null than output linked list will contain only root data as a node
        if (root.left == null && root.right == null){
            NodeReturn<Node<Integer>> nodeReturn = new NodeReturn<>();
            Node<Integer> newNode = new Node<>(root.data);
            nodeReturn.head = newNode;
            nodeReturn.tail = null;
            return nodeReturn;
        }

        NodeReturn<Node<Integer>> rootLeft = constructLinkedList(root.left);
        NodeReturn<Node<Integer>> rootRight = constructLinkedList(root.right);
        NodeReturn<Node<Integer>> nodeReturn = new NodeReturn<>();
        Node<Integer> newNode = new Node<>(root.data);

        if (rootLeft.head == null){
            nodeReturn.head = newNode;
        }else{
            nodeReturn.head = rootLeft.head;
        }

        if (rootLeft.tail == null){
            nodeReturn.head.next = newNode;
            nodeReturn.tail = newNode;
        }else{
            rootLeft.tail.next = newNode;
            nodeReturn.tail = newNode;
        }

        if (rootRight.head != null){
            nodeReturn.tail.next = rootRight.head;
            nodeReturn.tail = rootRight.head;
        }

        if (rootRight.tail != null){
            nodeReturn.tail = rootRight.tail;
        }

        return nodeReturn;
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
        NodeReturn<Node<Integer>> ans = constructLinkedList(root);
        while (ans.head != null){
            System.out.print(ans.head.data + " ");
            ans.head = ans.head.next;
        }

    }
}
