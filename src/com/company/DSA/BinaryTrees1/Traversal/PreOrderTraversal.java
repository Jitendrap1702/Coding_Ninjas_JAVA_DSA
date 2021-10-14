
/*
    preorder traversal :- root -> left -> right
 */

package com.company.DSA.BinaryTrees1.Traversal;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees1.Input.InputBT;

public class PreOrderTraversal {

    public static void preOrder(BinaryTreeNode<Integer> root) {

        if (root == null){
            return;
        }
        System.out.print(root.data + " -> ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        preOrder(root);
    }
}
