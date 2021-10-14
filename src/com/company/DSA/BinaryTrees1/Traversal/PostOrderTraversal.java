
/*
    post order :- left -> right -> root
 */

package com.company.DSA.BinaryTrees1.Traversal;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees1.Input.InputBT;

public class PostOrderTraversal {

    public static void postOrder(BinaryTreeNode<Integer> root) {

        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }


    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        postOrder(root);
    }
}
