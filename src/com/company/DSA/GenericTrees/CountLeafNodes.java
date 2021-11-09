/*
Given a generic tree, count and return the number of leaf nodes present in the given tree.
Input format :
Elements in level order form separated by space (as per done in class). Order is -
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
Output Format :
Count of leaf nodes
Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0
Sample Output 1 :
4
 */

package com.company.DSA.GenericTrees;

import com.company.DSA.GenericTrees.LevelWise.InputTree;
import com.company.DSA.GenericTrees.TreeNode.TreeNode;

public class CountLeafNodes {

    public static int countLeafNodes(TreeNode<Integer> root){

        // special case
        if (root == null){
            return 0;
        }

        int totalLeafNodeCount = 0;
        // if node has no children, then this node will be known as leaf node
        if (root.children.size() == 0){
            totalLeafNodeCount = 1;
        }

        // further check for its children
        for (TreeNode<Integer> i : root.children){
            int countChildLeafNodes = countLeafNodes(i); // total leaf node in current child
            totalLeafNodeCount += countChildLeafNodes; // add it to total leaf node
        }

        return totalLeafNodeCount;
    }

    public static void main(String[] args) {

        TreeNode<Integer> root = InputTree.takeInputLevelWise();
        int totalLeafNodes = countLeafNodes(root);
        System.out.println(totalLeafNodes);
    }
}
