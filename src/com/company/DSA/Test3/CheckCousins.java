/*
Given the binary Tree and two nodes say ‘p’ and ‘q’.
Determine whether the two nodes are cousins of each other or not.
Two nodes are said to be cousins of each other if they are at same level of the Binary Tree and
have different parents.
Do it in O(n).
Input format :
Line 1 : Nodes in level order form (separated by space). If any node does not have left or right child,
take -1 in its place
Line 2 : integer value of p
Line 3 : Integer value of q
Output format :
true or false
Constraints :
1 <= N <= 10^5
Sample Input :
5 6 10 2 3 4 -1 -1 -1 -1 9 -1 -1 -1 -1
2
4
Sample Output :
true
 */

package com.company.DSA.Test3;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;

import java.util.Scanner;

public class CheckCousins {

    /*
        Conditions for 2 nodes to be cousins:
        1. those two nodes shouldn't be siblings
        2. those two nodes should be at same level in binary tree

     */

    // condition 1 :- siblings or not
    public static boolean isSiblings(BinaryTreeNode<Integer> root, int p, int q){

        if (root == null){
            return false;
        }

        if (root.left == null || root.right == null){
            return false;
        }

        // if both are child of same nodes than they will be siblings
        if ((root.left.data == p && root.right.data == q) || (root.left.data == q && root.right.data == p)){
            return true;
        }

        // recur in left and right side
        boolean leftAns = isSiblings(root.left, p, q);
        boolean rightAns = isSiblings(root.right, p, q);

        return leftAns || rightAns;
    }

    // condition 2 :- ts same level or not
    public static int level(BinaryTreeNode<Integer> root, int p, int depth){

        // base case
        if (root == null){
            return 0;
        }

        if (root.data == p){
            return depth;
        }

        // check in left
        int ans = level(root.left, p, depth + 1);
        if (ans != 0){
            return ans;
        }
        // if not present in left then check in right
        return level(root.right, p, depth + 1);
    }

    public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {

        // base case
        if (root == null){
            return false;
        }

        // if not at same level and not siblings than return true else false
        return (level(root, p, 0) == level(root, q, 0)) && (!isSiblings(root, p, q));
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        boolean ans = isCousin(root, p, q);
        System.out.println(ans);
    }
}
