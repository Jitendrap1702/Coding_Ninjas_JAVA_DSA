
/*
Given a generic tree, count and return the sum of all nodes present in the given tree.
Input format :
Elements in level order form separated by space (as per done in class). Order is -
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
Output Format :
Sum of all nodes
Sample Input :
10 3 20 30 40 2 40 50 0 0 0 0
Sample Output :
190
 */

package com.company.DSA.GenericTrees;

import com.company.DSA.GenericTrees.TreeNode.TreeNode;

public class SumOfAllNodes {

    public static int sumOfAllNode(TreeNode<Integer> root){

        // special case
        if (root == null){
            return 0;
        }

        int sum = root.data;
        for (TreeNode<Integer> i : root.children){
            int childSum = sumOfAllNode(i);
            sum += childSum;
        }
        return sum;
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

        int sumOfNodes = sumOfAllNode(root);
        System.out.println(sumOfNodes);
    }
}
