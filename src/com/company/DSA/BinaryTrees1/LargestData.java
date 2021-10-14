package com.company.DSA.BinaryTrees1;

import com.company.DSA.BinaryTrees1.Input.InputBT;
import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;

public class LargestData {

    public static int largest(BinaryTreeNode<Integer> root){

        if (root == null){
            return -1;
        }
        int leftLargest = largest(root.left);
        int rightLargest = largest(root.right);

        return Math.max(root.data, Math.max(leftLargest, rightLargest));
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        int large = largest(root);
        System.out.println(large);
    }
}
