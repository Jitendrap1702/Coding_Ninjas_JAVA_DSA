package com.company.DSA.BinaryTrees1;

import com.company.DSA.BinaryTrees1.Input.InputBT;
import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;

public class NumberOfNodes {

    public static int countNodes(BinaryTreeNode<Integer> root){

        if (root == null){
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        int count = countNodes(root);
        System.out.println(count);
    }
}
