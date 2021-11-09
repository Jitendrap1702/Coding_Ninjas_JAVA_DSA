
/*
Given a binary search tree and an integer S, find pair of nodes in the BST which sum to S.
You can use extra space of the order of O(log n).
Note:
1. Assume BST contains all unique elements.
2. In a pair, print the smaller element first.
Input Format :
The first line of input contains data of the nodes of the tree in level order form.
The data of the nodes of the tree is separated by space. If any node does not have left or right child,
take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore,
it will not be a part of the data of any node.
The following line of input contains an integer, that denotes the value of S.
Output format:
You have to print each pair in a different line (pair elements separated by space). The order of different pairs,
to be printed, does not matter.
Constraints:
Time Limit: 1 second
Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
12
Sample Output 1:
2 10
5 7
 */

package com.company.DSA.BST2.Assignment;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class PairSumInABST {

    public static ArrayList<Integer> getListOfTreeNode (BinaryTreeNode<Integer> root){

        ArrayList<Integer> output = new ArrayList<>();

        if (root == null){
            return output;
        }

        // left data
        ArrayList<Integer> left = getListOfTreeNode(root.left);
        output.addAll(left);
        // root
        output.add(root.data);
        // right data
        ArrayList<Integer> right = getListOfTreeNode(root.right);
        output.addAll(right);

        return output;
    }

    /* 	1. convert tree in sorted arr (by inorder traversal)
    	2. traverse in both side and print all pairs

        Time complexity : O(n)
        Space complexity : O(n)
    */
    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {

        ArrayList<Integer> arr = getListOfTreeNode(root);

        int i = 0, j = arr.size()-1;
        while (i < j) {

            int x = arr.get(i);
            int y = arr.get(j);
            if (x + y == s){
                System.out.println(x + " " + y);
                i++;
                j--;
            }
            else if (x + y > s){
                j--;
            }
            else {
                i++;
            }
        }
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        printNodesSumToS(root, s);
    }
}