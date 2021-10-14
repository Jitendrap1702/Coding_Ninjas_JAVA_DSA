
/* Question

    For a given Binary Tree of integers, find and return the height of the tree.
    Example:
                        10
                      /    \
                    20      30
                   /  \
                 40    50

    Height of the given tree is 3.

    Height is defined as the total number of nodes along the longest path from the root to any of the leaf node.

 */

package com.company.DSA.BinaryTrees1;

import com.company.DSA.BinaryTrees1.Input.InputBT;
import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;

public class Height {

    public static int height(BinaryTreeNode<Integer> root) {

        if (root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        int height = height(root);
        System.out.println(height);
    }
}
