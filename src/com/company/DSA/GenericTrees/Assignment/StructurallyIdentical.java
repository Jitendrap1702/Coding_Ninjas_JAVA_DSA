/*
Given two Generic trees, return true if they are structurally identical
i.e. they are made of nodes with the same values arranged in the same way.
Input format :

Line 1 : Tree 1 elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Line 2 : Tree 2 elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Output format : true or false

Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0
10 3 20 30 40 2 40 50 0 0 0 0
Sample Output 1 :
true
Sample Input 2 :
10 3 20 30 40 2 40 50 0 0 0 0
10 3 2 30 40 2 40 50 0 0 0 0
Sample Output 2:
false
 */

package com.company.DSA.GenericTrees.Assignment;

import com.company.DSA.GenericTrees.LevelWise.InputTree;
import com.company.DSA.GenericTrees.TreeNode.TreeNode;

public class StructurallyIdentical {

    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

        // if root data of both tree is not equal then return false
        if (!root1.data.equals(root2.data)){
            return false;
        }

        // if number of children of root node is not equal for both tree then return false
        if (root1.children.size() != root2.children.size()){
            return false;
        }

        // check for its child's
        for (int i = 0; i < root1.children.size(); i++){
            boolean isIdenticalChild = checkIdentical(root1.children.get(i), root2.children.get(i));
            if (!isIdenticalChild){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        TreeNode<Integer> root1 = InputTree.takeInputLevelWise();
        TreeNode<Integer> root2 = InputTree.takeInputLevelWise();
        boolean isIdentical = checkIdentical(root1, root2);
        System.out.println(isIdentical);
    }
}
