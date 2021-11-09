package com.company.DSA.GenericTrees;

import com.company.DSA.GenericTrees.TreeNode.TreeNode;

public class FindNumOfNode {

    public static int numNodes(TreeNode<Integer> root){

        // special case, not base case
        if (root == null){
            return 0;
        }

        int count = 1; // count of root
        for (TreeNode<Integer> i : root.children){
            int childCount = numNodes(i);
            count += childCount;
        }
        return count;
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

        node1.children.add(node4);
        node1.children.add(node5);

        int numOfNodes = numNodes(root);
        System.out.println(numOfNodes);
    }
}
