package com.company.DSA.BinaryTrees1.Assignment;

import com.company.DSA.BinaryTrees1.Input.InputBT;

/* Question

    For a given Binary Tree of type integer and a number X,
    find whether a node exists in the tree with data X or not.

    Sample Input :
    8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
    7

    Sample Output :
    true
 */

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;

import java.util.Scanner;

public class IsNodePresent {

    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {

        if (root == null){
            return false;
        }

        if (root.data == x){
            return true;
        }

        Boolean presentInLeft = isNodePresent(root.left, x);
        Boolean presentInRight = isNodePresent(root.right, x);

        return presentInLeft || presentInRight;
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean isPresent = isNodePresent(root, x);
        System.out.println(isPresent);
    }
}
