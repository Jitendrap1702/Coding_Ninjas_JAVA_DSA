package com.company.DSA.GenericTrees.PrintTree;

import com.company.DSA.GenericTrees.TreeNode.TreeNode;

public class PrintTree {

    // print nodes with their child nodes
    public static void printTreeBetter(TreeNode<Integer> root){

        // Special case, not the base case
        if (root == null){
            return;
        }
        // print root data
        System.out.print(root.data + " : ");
        // print all child of current root node
        for (TreeNode<Integer> i : root.children){
            System.out.print(i.data + " ");
        }

        System.out.println();
        // recur for all child nodes and their child
        for (TreeNode<Integer> i : root.children){
            TreeNode<Integer> child = i;
            printTreeBetter(i);
        }
    }

    public static void printTree(TreeNode<Integer> root){

        // Special case, not the base case
        if (root == null){
            return;
        }

        System.out.print(root.data + " ");
        for (TreeNode<Integer> i : root.children){
            TreeNode<Integer> child = i;
            printTree(i);
        }
    }

    public static void main(String[] args) {

        TreeNode<Integer> root = new TreeNode<>(4);
        TreeNode<Integer> node1 = new TreeNode<>(1);
        TreeNode<Integer> node2 = new TreeNode<>(2);
        TreeNode<Integer> node3 = new TreeNode<>(3);
        TreeNode<Integer> node4 = new TreeNode<>(5);
        TreeNode<Integer> node5 = new TreeNode<>(6);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);

        node2.children.add(node4);
        node2.children.add(node5);

        printTreeBetter(root);
    }
}
