package com.company.DSA.Test3;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;

import java.util.ArrayList;

public class LongestLeafToRootPath {

//    public static ArrayList<ArrayList<Integer>> rootToLeafPaths (BinaryTreeNode<Integer> root, ArrayList<Integer> arr){
//
//        if (root == null){
//            return new ArrayList<>();
//        }
//
//        ArrayList<ArrayList<Integer>> ansArr = new ArrayList<>();
//        arr.add(root.data);
//
//        // if root is leaf
//        if (root.left == null && root.right == null){
//            ansArr.add(arr);
//        }
//
//        // recur in left and right
//        ArrayList<ArrayList<Integer>> leftAns = rootToLeafPaths(root.left, arr);
//        ArrayList<ArrayList<Integer>> rightAns = rootToLeafPaths(root.right, arr);
//
//        ansArr.addAll(leftAns);
//        ansArr.addAll(rightAns);
//        return ansArr;
//    }

    public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){

        if (root == null){
            return new ArrayList<>();
        }

        // recur in left and right
        ArrayList<Integer> leftPath = longestRootToLeafPath(root.left);
        ArrayList<Integer> rightPath = longestRootToLeafPath(root.right);

        if (leftPath.size() > rightPath.size()){
            leftPath.add(root.data);
            return leftPath;
        }else{
            rightPath.add(root.data);
            return rightPath;
        }
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
        ArrayList<Integer> ans = longestRootToLeafPath(root);
        for (int i : ans){
            System.out.println(i);
        }
    }
}
