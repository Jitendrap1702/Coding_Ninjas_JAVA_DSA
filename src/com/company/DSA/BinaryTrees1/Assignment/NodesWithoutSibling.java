
/* Question

    For a given Binary Tree of type integer, print all the nodes without any siblings.

    Sample Input :
    5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1

    Sample Output :
    9

 */

package com.company.DSA.BinaryTrees1.Assignment;

import com.company.DSA.BinaryTrees1.Input.InputBT;
import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;

public class NodesWithoutSibling {

    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {

        if (root == null){
            return;
        }

        if (root.left != null && root.right == null){
            System.out.print(root.left.data + " ");
        }

        if (root.right != null && root.left == null){
            System.out.print(root.right.data + " ");
        }

        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        printNodesWithoutSibling(root);
    }
}
