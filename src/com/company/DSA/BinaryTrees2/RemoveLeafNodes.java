package com.company.DSA.BinaryTrees2;

import com.company.DSA.BinaryTrees1.Input.InputBT;
import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees1.Print.PrintRecursive1;

public class RemoveLeafNodes {

    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){

        // if root is null
        if (root == null){
            return null;
        }

        // if root is leaf
        if (root.left == null && root.right == null){
            return null;
        }

        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        BinaryTreeNode<Integer> newRoot = removeLeaves(root);
        PrintRecursive1.printBTRecursive(newRoot);
    }
}
