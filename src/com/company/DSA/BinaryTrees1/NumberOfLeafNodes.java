package com.company.DSA.BinaryTrees1;

import com.company.DSA.BinaryTrees1.Input.InputBT;
import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;

public class NumberOfLeafNodes {

    public static int countLeafNodes(BinaryTreeNode<Integer> root){

        if (root == null){
            return 0;
        }

        // leaf node
        if (root.left == null && root.right == null){
            return 1;
        }

        return countLeafNodes(root.left) + countLeafNodes(root.right);

    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        int totalLeafNodes = countLeafNodes(root);
        System.out.println(totalLeafNodes);
    }
}
