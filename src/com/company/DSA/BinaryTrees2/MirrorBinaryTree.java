
/* Question

    For a given Binary Tree of type integer, update it with its corresponding mirror image.

    Sample Input :
    1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1

    Sample Output :
    1
    3 2
    7 6 5 4

 */

package com.company.DSA.BinaryTrees2;

import com.company.DSA.BinaryTrees1.Input.InputBT;
import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees1.Print.PrintRecursive1;

public class MirrorBinaryTree {

    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){

        if (root == null){
            return;
        }

        // Swap right and left node of root
        if (root.left != null || root.right != null){

            BinaryTreeNode<Integer> x = root.left;
            root.left = root.right;
            root.right = x;
        }

        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        mirrorBinaryTree(root);
        PrintRecursive1.printBTRecursive(root);
    }
}
