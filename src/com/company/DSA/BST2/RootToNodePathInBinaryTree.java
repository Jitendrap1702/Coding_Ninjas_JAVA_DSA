package com.company.DSA.BST2;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class RootToNodePathInBinaryTree {

    public static ArrayList<Integer> rootToNodePath(BinaryTreeNode<Integer> root, int k){

        // base case
        if (root == null){
            return null;
        }

        // if root is k
        if (root.data == k){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }

        // check in left
        // if found than add root data to it and return
        ArrayList<Integer> leftOutput = rootToNodePath(root.left, k);
        if (leftOutput != null){
            leftOutput.add(root.data);
            return leftOutput;
        }

        // check in right
        // if found than add root data to it and return
        ArrayList<Integer> rightOutput = rootToNodePath(root.right,k);
        if (rightOutput != null){
            rightOutput.add(root.data);
            return rightOutput;
        }

        // if not found in root, left & right
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
