
/*
    Inorder :- left -> root -> right
 */

package com.company.DSA.BinaryTrees1.Traversal;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees1.Input.InputBT;

public class InorderTraversal {

    public static void InOrder(BinaryTreeNode<Integer> root) {

        if (root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }


    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        InOrder(root);
    }
}
