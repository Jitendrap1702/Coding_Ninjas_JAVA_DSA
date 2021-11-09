/*
In a given Generic Tree, replace each node with its depth value.
You need to just update the data of each node, no need to return or print anything.
Input format :

Line 1 : Elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0
Sample Output 1 : (Level wise, each level in new line)
0
1 1 1
2 2
 */

package com.company.DSA.GenericTrees.Assignment;

import com.company.DSA.GenericTrees.LevelWise.InputTree;
import com.company.DSA.GenericTrees.TreeNode.TreeNode;

public class ReplaceWithDepth {

    public static void replaceWithDepthValueHelper(TreeNode<Integer> root, int depth){

        if (root == null){
            return;
        }
        root.data = depth;
        // recur for its children
        for (TreeNode<Integer> i : root.children){
            replaceWithDepthValueHelper(i, depth + 1);
        }
    }

    public static void replaceWithDepthValue(TreeNode<Integer> root){

        replaceWithDepthValueHelper(root, 0);
    }

    public static void main(String[] args) {

        TreeNode<Integer> root = InputTree.takeInputLevelWise();
        replaceWithDepthValue(root);
    }
}
