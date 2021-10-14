package com.company.DSA.BinaryTrees1;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;

public class BinaryTreeUse {

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
    }
}
