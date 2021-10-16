package com.company.DSA.BinaryTrees2.Assignment;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;

import java.util.Scanner;

public class PrintNodesAtDistancesKFromNode {

    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {

    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int k = sc.nextInt();
        nodesAtDistanceK(root, node, k);
    }
}
