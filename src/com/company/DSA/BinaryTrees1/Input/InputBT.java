package com.company.DSA.BinaryTrees1.Input;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees1.Print.PrintRecursive2;

import java.util.Scanner;

public class InputBT {

    public static BinaryTreeNode<Integer> takeTreeInput(){

        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if (rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> rootLeft = takeTreeInput();
        BinaryTreeNode<Integer> rootRight = takeTreeInput();
        root.left = rootLeft;
        root.right = rootRight;
        return root;
    }

    public static BinaryTreeNode<Integer> takeTreeInputBetter(Boolean isRoot, int parentData, Boolean isLeft){

        if (isRoot){
            System.out.print("Enter root data : ");
        }else {
            if (isLeft){
                System.out.print("Enter left child of " + parentData + " : ");
            }else {
                System.out.print("Enter right child of " + parentData + " : ");
            }
        }
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if (rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> rootLeft = takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rootRight = takeTreeInputBetter(false, rootData, false);
        root.left = rootLeft;
        root.right = rootRight;
        return root;
    }

    public static void main(String[] args) {

//        BinaryTreeNode<Integer> root = takeTreeInput();
        BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);

        PrintRecursive2.printBTRecursive(root);
    }
}
