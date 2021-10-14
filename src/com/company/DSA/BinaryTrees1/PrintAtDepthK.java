package com.company.DSA.BinaryTrees1;

import com.company.DSA.BinaryTrees1.Input.InputBT;
import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;

import java.util.Scanner;

public class PrintAtDepthK {

    public static void printAtDepthK(BinaryTreeNode<Integer> root, int k){

        if (root == null){
            return;
        }

        if (k == 0){
            System.out.println(root.data);
        }

        printAtDepthK(root.left, k-1);
        printAtDepthK(root.right, k-1);
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        printAtDepthK(root, k);
    }
}
