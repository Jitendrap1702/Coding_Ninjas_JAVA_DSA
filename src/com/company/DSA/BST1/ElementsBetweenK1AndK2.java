
/*
Given a Binary Search Tree and two integers k1 and k2, find and print the elements which are in range k1 and k2 (both inclusive).
Print the elements in increasing order.
Input format:
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
The following line contains two integers, that denote the value of k1 and k2.
Output Format:
 The first and only line of output prints the elements which are in range k1 and k2 (both inclusive). Print the elements in increasing order.
Constraints:
Time Limit: 1 second
Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
6 10
Sample Output 1:
6 7 8 10
 */

package com.company.DSA.BST1;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;

import java.util.Scanner;

public class ElementsBetweenK1AndK2 {

    // Time Complexity in worse case O(n) else O(h)
    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root, int k1, int k2){

        // Base case
        if (root == null){
            return;
        }

        // if k1 greater than root data than search in right subtree
        else if (root.data < k1) {
            elementsInRangeK1K2(root.right, k1, k2);
        }

        // if k2 less than root data than search in left subtree
        else if (root.data > k2) {
            elementsInRangeK1K2(root.left, k1, k2);
        }

        // if root is lie between k1 and k2
        // sequence will be left root right because we have to print element in increasing order
        else {
            elementsInRangeK1K2(root.left, k1, k2);
            System.out.print(root.data + " ");
            elementsInRangeK1K2(root.right, k1, k2);
        }

    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
        Scanner sc = new Scanner(System.in);
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        elementsInRangeK1K2(root, k1, k2);
    }
}
