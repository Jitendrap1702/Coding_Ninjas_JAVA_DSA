package com.company.DSA.BinaryTrees2.Levelwise;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees1.Print.PrintRecursive1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Input {

    public static BinaryTreeNode<Integer> takeInputLevelWise(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Root Data : ");
        int rootData = sc.nextInt();
        if (rootData == -1){
            return null;
        }
        // create root node
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        // create a queue
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<>();
        // add root to queue
        pendingChildren.add(root);
        // pop node while queue is not empty
        while (!pendingChildren.isEmpty()){

            // take the first element out
            BinaryTreeNode<Integer> front = pendingChildren.remove();

            // ask for its left
            System.out.println("Enter left child of " + front.data + " : ");
            int leftData = sc.nextInt();
            if (leftData != -1){
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(leftData);
                // attach left to its root
                front.left = leftChild;
                // add leftChild to Queue
                pendingChildren.add(leftChild);
            }

            // ask for its right
            System.out.println("Enter right child of " + front.data + " : ");
            int rightData = sc.nextInt();
            if (rightData != -1){
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(rightData);
                // attach right to its root
                front.right = rightChild;
                // add rightChild to Queue
                pendingChildren.add(rightChild);
            }
        }
        return root;
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = takeInputLevelWise();
        Print.printLevelWise(root);
    }
}
