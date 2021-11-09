package com.company.GFG.BinaryTree;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;

import java.util.ArrayList;


class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class PreOrderTraversal {

    public static ArrayList<Integer> preOrder(BinaryTreeNode<Integer> root) {

        if (root == null){
            return new ArrayList<>();
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(root.data);
        ArrayList<Integer> leftArr = preOrder(root.left);
        ArrayList<Integer> rightArr = preOrder(root.right);
        arr.addAll(leftArr);
        arr.addAll(rightArr);
        return arr;
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
        ArrayList<Integer> arr = preOrder(root);
        for (int i: arr) {
            System.out.println(i);
        }
    }
}


