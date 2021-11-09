/*
Given a generic tree and an integer x, check if x is present in the given tree or not.
Return true if x is present, return false otherwise.
Input format :

Line 1 : Integer x

Line 2 : Elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Output format : true or false

Sample Input 1 :
40
10 3 20 30 40 2 40 50 0 0 0 0
Sample Output 1 :
true
Sample Input 2 :
4
10 3 20 30 40 2 40 50 0 0 0 0
Sample Output 2:
false
 */

package com.company.DSA.GenericTrees.Assignment;

import com.company.DSA.GenericTrees.LevelWise.InputTree;
import com.company.DSA.GenericTrees.TreeNode.TreeNode;

import java.util.Scanner;

public class ContainElementXOrNot {

    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

        // special case
        if (root == null){
            return false;
        }

        // if root is x
        if (root.data == x){
            return true;
        }

        // check x is the one of the child of root or not
        for (TreeNode<Integer> i : root.children){

            boolean isChildHaveX = checkIfContainsX(i, x);
            if (isChildHaveX){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        TreeNode<Integer> root = InputTree.takeInputLevelWise();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean isContain = checkIfContainsX(root, x);
        System.out.println(isContain);
    }
}
