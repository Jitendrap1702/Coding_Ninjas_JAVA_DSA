package com.company.DSA.BinaryTrees2.DiameterOfTree;

import com.company.DSA.BinaryTrees1.Input.InputBT;
import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.OOPS3.ChainedGenericPairs.Pair;

public class Diameter {

    public static DiameterReturn diameterOfBinaryTree(BinaryTreeNode<Integer> root){

        // if root is null then height and diameter will be 0
        if (root == null){
            int height = 0;
            int diameter = 0;
            DiameterReturn ans = new DiameterReturn();
            ans.height = height;
            ans.diameter = diameter;
            return ans;
        }

        // get the left height and left diameter of root node
        DiameterReturn left = diameterOfBinaryTree(root.left);
        // get the right height and right diameter of root node
        DiameterReturn right = diameterOfBinaryTree(root.right);

        int height = 1 + Math.max(left.height, right.height);
        // diameter will be max between left diameter, right diameter & (left height + right height)
        int diameter = Math.max(left.height + right.height + 1, Math.max(left.diameter, right.diameter));

        DiameterReturn ans = new DiameterReturn();
        ans.height = height;
        ans.diameter = diameter;
        return ans;


    }

    // for submit on coding ninjas

    public static int diameterOfBinaryTreeCN(BinaryTreeNode<Integer> root){
        Pair<Integer, Integer> ans = diameterOfBinaryTreeCNSubmit(root);
        return ans.getSecond();
    }

    public static Pair<Integer, Integer> diameterOfBinaryTreeCNSubmit(BinaryTreeNode<Integer> root){

        // if root is null then height and diameter will be 0
        if (root == null){
            int height = 0;
            int diameter = 0;
            Pair<Integer, Integer> ans = new Pair<>(height, diameter);
            return ans;
        }

        // get the left height and left diameter of root node
        Pair<Integer, Integer> left = diameterOfBinaryTreeCNSubmit(root.left);
        // get the right height and right diameter of root node
        Pair<Integer, Integer> right = diameterOfBinaryTreeCNSubmit(root.right);

        int height = 1 + Math.max(left.getFirst(), right.getFirst());
        // diameter will be max between left diameter, right diameter & (left height + right height)
        int diameter = Math.max(left.getFirst() + right.getFirst() + 1, Math.max(left.getSecond(), right.getSecond()));

        Pair<Integer, Integer> ans = new Pair<>(height, diameter);
        return ans;

    }


    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        DiameterReturn ans = diameterOfBinaryTree(root);
        System.out.println(ans.diameter);
    }
}
