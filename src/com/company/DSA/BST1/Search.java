
/*
Given a BST and an integer k. Find if the integer k is present in given BST or not. You have to return true, if node with data k is present, return false otherwise.
Note: Assume that BST contains all unique elements.
Input Format:
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
The following line of input contains an integer, that denotes the value of k.
Output Format:
The first and only line of output contains a boolean value. Print true, if node with data k is present, print false otherwise.
Constraints:
Time Limit: 1 second
Sample Input 1 :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
2
Sample Output 1 :
true
Sample Input 2 :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
12
Sample Output 2 :
false
 */

package com.company.DSA.BST1;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;

import java.util.Scanner;

public class Search {


    // Time complexity : O(h), h = height
    // in worse case O(n)
    // in balanced tree : O(logn)
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {

        // base case
        if (root == null){
            return false;
        }

        // if root is k then return true
        if (root.data == k)
        {
            return true;
        }

        // if k greater than root then search in right subtree
        if (k > root.data)
        {
            return searchInBST(root.right, k);
        }

        // if k less than root then search in left subtree
        return searchInBST(root.left, k);

    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        boolean ans = searchInBST(root, k);
        System.out.println(ans);
    }
}
