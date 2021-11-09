/*
Given a tree, find and return the node for which sum of data of all children and the node itself is maximum.
In the sum, data of node itself and data of immediate children is to be taken.
Input format :

Line 1 : Elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Output format : Node with maximum sum.

Sample Input 1 :
5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
Sample Output 1 :
1
 */

package com.company.DSA.GenericTrees.Assignment;

import com.company.DSA.GenericTrees.LevelWise.InputTree;
import com.company.DSA.GenericTrees.TreeNode.TreeNode;

class MaxSumNodeReturn{
    TreeNode<Integer> node;
    int sum;

    public MaxSumNodeReturn(TreeNode<Integer> node, int sum){
        this.node = node;
        this.sum = sum;
    }
}

public class NodeHavingSumOfChildrenAndNodeIsMAx {

    public static MaxSumNodeReturn maxSumNodeHelper(TreeNode<Integer> root){

        if (root == null){
            return null;
        }
        /*  by default take root node as answer
            sum will be = root data + data of all child's of root
         */
        TreeNode<Integer> ansNode = root;
        int currSum = root.data;
        for (TreeNode<Integer> i : root.children){
            currSum += i.data;
        }

        // check for all child's
        for (TreeNode<Integer> i : root.children){
            MaxSumNodeReturn childReturn = maxSumNodeHelper(i);
            // if sum for children is greater than currSum than update currSum to child sum
            if (childReturn != null && childReturn.sum > currSum){
                ansNode = childReturn.node;
                currSum = childReturn.sum;
            }
        }
        return new MaxSumNodeReturn(ansNode, currSum);
    }

    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){

        return maxSumNodeHelper(root).node;
    }

    public static void main(String[] args) {

        TreeNode<Integer> root = InputTree.takeInputLevelWise();
        TreeNode<Integer> ans = maxSumNode(root);
        System.out.println(ans.data);
    }
}
