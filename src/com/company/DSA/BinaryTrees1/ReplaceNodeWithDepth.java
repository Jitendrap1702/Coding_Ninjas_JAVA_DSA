
/* Question

    For a given a Binary Tree of integers, replace each of its data with the depth of the tree.
    Root is at depth 0, hence the root data is updated with 0.
    Replicate the same further going down the in the depth of the given tree.
    The modified tree will be printed in the in-order fashion.

    Sample Input :
    2 35 10 2 3 5 2 -1 -1 -1 -1 -1 -1 -1 -1

    Sample Output :
    2 1 2 0 2 1 2
 */

package com.company.DSA.BinaryTrees1;

import com.company.DSA.BinaryTrees1.Input.InputBT;
import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees1.Print.PrintRecursive1;

public class ReplaceNodeWithDepth {

    public static void changeToDepthTree(BinaryTreeNode<Integer> root, int depth) {

        if (root == null){
            return;
        }
        // update root data with k
        root.data = depth;
        changeToDepthTree(root.left, depth + 1);
        changeToDepthTree(root.right, depth + 1);
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        changeToDepthTree(root, 0);
        PrintRecursive1.printBTRecursive(root);
    }
}
