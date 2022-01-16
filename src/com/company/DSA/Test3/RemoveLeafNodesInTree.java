/*
Remove all leaf nodes from a given generic Tree. Leaf nodes are those nodes, which don't have any children.
Note : Root will also be a leaf node if it doesn't have any child. You don't need to print the tree,
just remove all leaf nodes and return the updated root.
Input format :
Line 1 : Elements in level order form separated by space (as per done in class). Order is - `

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element `
Output Format :
Elements are printed level wise, each level in new line (separated by space)
Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0
Sample Output 1 : (Level wise, each level in new line)
10
20
 */

package com.company.DSA.Test3;

import com.company.DSA.GenericTrees.LevelWise.InputTree;
import com.company.DSA.GenericTrees.LevelWise.PrintTree;
import com.company.DSA.GenericTrees.TreeNode.TreeNode;

import javax.swing.*;

public class RemoveLeafNodesInTree {

    // Best solution
    public static TreeNode<Integer> removeLeafNodes2(TreeNode<Integer> root){

        // special case
        if (root == null){
            return null;
        }

        // if root doesn't have child than return null
        if (root.children.size() == 0){
            return null;
        }

        for (int i = root.children.size()-1; i >= 0; i--){
            TreeNode<Integer> childAns = removeLeafNodes2(root.children.get(i));
            // if ans is null that's mean this child is leaf so remove it from list
            if (childAns == null){
                root.children.remove(i);
            }
        }
        return root;
    }

    public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {

        if (root == null) {
            return null;
        }
        if (root.children.size() == 0) {
            return null;
        }

        for (int i = 0; i < root.children.size(); i++) {

            TreeNode<Integer> child = root.children.get(i);

            // if it is  a leaf
            if (child.children.size() == 0) {

                // shifting the vector to left
                // after the point i
                for (int j = i; j < root.children.size() - 1; j++)
                    root.children.set(j, root.children.get(j + 1));

                // delete the last element
                root.children.remove(root.children.size() - 1);

                i--;
            }
        }

        // Remove all leaf node
        // of children of root
        for (int i = 0; i < root.children.size(); i++) {

            // call function for root.children
            root.children.set(i, removeLeafNodes(root.children.get(i)));
        }
        return root;
    }

    public static void main(String[] args) {

        TreeNode<Integer> root = InputTree.takeInputLevelWise();
        TreeNode<Integer> ans = removeLeafNodes2(root);
        PrintTree.printLevelWise2(root);
    }
}
