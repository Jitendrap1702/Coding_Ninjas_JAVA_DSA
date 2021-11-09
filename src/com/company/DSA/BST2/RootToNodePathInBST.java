
/*
Given a BST and an integer k. Find and return the path from the node with data k and root (if a node with data k is present in given BST) in a list. Return empty list otherwise.
Note: Assume that BST contains all unique elements.
Input Format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
The following line of input contains an integer, that denotes the value of k.
Output Format :
The first line and only line of output prints the data of the nodes in the path from node k to root. The data of the nodes is separated by single space.
Constraints:
Time Limit: 1 second
Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
2
Sample Output 1:
2 5 8
 */

package com.company.DSA.BST2;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class RootToNodePathInBST {

    public static ArrayList<Integer> rootToNodePath(BinaryTreeNode<Integer> root, int k){

        // base case
        if (root == null){
            return null;
        }

        if (root.data == k){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }

        // if root data greater than k check in left
        if (root.data > k){
            ArrayList<Integer> leftOutput = rootToNodePath(root.left, k);
            if (leftOutput != null){
                leftOutput.add(root.data);
                return leftOutput;
            }
        }

        // if root data less than k check in right
        else{
            ArrayList<Integer> rightOutput = rootToNodePath(root.right, k);
            if (rightOutput != null){
                rightOutput.add(root.data);
                return rightOutput;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<Integer> path = rootToNodePath(root, k);
        if (path == null){
            System.out.println("Path not found");
        }else {
            for (int i : path) {
                System.out.println(i);
            }
        }
    }
}
