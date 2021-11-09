package com.company.DSA.GenericTrees.InputTree;

import com.company.DSA.GenericTrees.PrintTree.PrintTree;
import com.company.DSA.GenericTrees.TreeNode.TreeNode;

import java.util.Scanner;


public class Input {

    public static TreeNode<Integer> inputTreeRecursive(boolean isRoot){

        Scanner sc = new Scanner(System.in);
        if (isRoot){
            System.out.println("Enter Root Data : ");
        }
        int rootData = sc.nextInt();
        if (rootData == -1){
            return null;
        }

        TreeNode<Integer> root = new TreeNode<>(rootData);
        System.out.println("Enter number of children of " + root.data);
        int numChild = sc.nextInt();
        for (int i = 0; i < numChild; i++){
            System.out.println("Enter " + i + "th child of " + root.data + " : ");
            TreeNode<Integer> child = inputTreeRecursive(false);
            root.children.add(child);
        }

        return root;
    }

    public static void main(String[] args) {

        TreeNode<Integer> root = inputTreeRecursive(true);
        PrintTree.printTreeBetter(root);
    }
}
