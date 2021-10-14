package com.company.DSA.BinaryTrees1.Print;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;

public class PrintRecursive1 {

    public static void printBTRecursive(BinaryTreeNode<Integer> root){

        if (root == null){
            return;
        }
        System.out.println(root.data);
        printBTRecursive(root.left);
        printBTRecursive(root.right);
    }
    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        root.left = rootLeft;
        root.right = rootRight;

        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5);
        rootRight.right = twoRight;
        rootLeft.left = threeLeft;

        printBTRecursive(root);
    }
}
