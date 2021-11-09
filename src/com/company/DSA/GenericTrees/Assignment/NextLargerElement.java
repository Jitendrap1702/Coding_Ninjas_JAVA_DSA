/*
Given a generic tree and an integer n. Find and return the node with next larger element in the Tree
i.e. find a node with value just greater than n.
Return NULL if no node is present with value greater than n.
Input format :

Line 1 : Integer n

Line 2 : Elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Output format : Node with value just greater than n.

Sample Input 1 :
18
10 3 20 30 40 2 40 50 0 0 0 0
Sample Output 1 :
20
Sample Input 2 :
21
10 3 20 30 40 2 40 50 0 0 0 0
Sample Output 2:
30
 */

package com.company.DSA.GenericTrees.Assignment;

import com.company.DSA.GenericTrees.LevelWise.InputTree;
import com.company.DSA.GenericTrees.TreeNode.TreeNode;

import java.util.Scanner;

public class NextLargerElement {

    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
        
        if (root == null){
            return null;
        }
        
        TreeNode<Integer> ansNode = null;
        // if root is greater than n than set it to ansNode
        if (root.data > n){
            ansNode = root;
        }
        // check in its children
        for (TreeNode<Integer> i : root.children){
            TreeNode<Integer> childAns = findNextLargerNode(i, n);
            if (ansNode != null && childAns != null && childAns.data < ansNode.data){
                ansNode = childAns;
            }else if (ansNode == null && childAns != null){
                ansNode = childAns;
            }
        }
        return ansNode;
    }

    public static void main(String[] args) {
        
        TreeNode<Integer> root = InputTree.takeInputLevelWise();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeNode<Integer> ans = findNextLargerNode(root, n);
        System.out.println(ans.data);
    }
}
