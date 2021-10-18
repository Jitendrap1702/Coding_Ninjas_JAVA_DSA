package com.company.DSA.BinaryTrees2.Assignment;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;

import java.util.Scanner;

public class PrintNodesAtDistancesKFromNode {

    // function to print all nodes at distance k from root node downward
    public static void nodesAtDistanceKDown(BinaryTreeNode<Integer> root, int k){

        if (root == null || k < 0){
            return;
        }

        if (k == 0){
            System.out.println(root.data);
            return;
        }

        nodesAtDistanceKDown(root.left, k-1);
        nodesAtDistanceKDown(root.right, k-1);
    }

    // Prints all nodes at distance k from a given target node.
    // The k distant nodes may be upward or downward.This function
    // Returns distance of root from target node, it returns -1
    // if target node is not present in tree rooted with root.
    public static int nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {

        // Base Case 1: If tree is empty, return -1
        if (root == null)
            return -1;

        // If target is same as root.  Use the downward function
        // to print all nodes at distance k in subtree rooted with
        // target or root
        if (root.data == node){
            nodesAtDistanceKDown(root, k);
            return 0;
        }

        // Recur for left subtree
        int ld = nodesAtDistanceK(root.left, node, k);

        // Check if target node was found in left subtree
        if (ld != -1){

            // If root is at distance k from target, print root
            // Note that dl is Distance of root's left child from
            // target
            if (ld + 1 == k) {
                System.out.print(root.data);
                System.out.println("");
            }

            // Else go to right subtree and print all k-dl-2 distant nodes
            // Note that the right child is 2 edges away from left child
            else
                nodesAtDistanceKDown(root.right, k - ld - 2);

            // Add 1 to the distance and return value for parent calls
            return 1 + ld;
        }

        // MIRROR OF ABOVE CODE FOR RIGHT SUBTREE
        // Note that we reach here only when node was not found in left
        // subtree
        int rd = nodesAtDistanceK(root.right, node, k);
        if (rd != -1)
        {
            if (rd + 1 == k)
            {
                System.out.print(root.data);
                System.out.println("");
            }
            else
                nodesAtDistanceKDown(root.left, k - rd - 2);

            return 1 + rd;
        }

        // If target was neither present in left nor in right subtree
        return -1;

    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int k = sc.nextInt();
        nodesAtDistanceK(root, node, k);
    }
}
