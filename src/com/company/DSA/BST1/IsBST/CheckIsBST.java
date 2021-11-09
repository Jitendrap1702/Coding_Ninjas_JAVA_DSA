package com.company.DSA.BST1.IsBST;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;

public class CheckIsBST {

//    public static boolean isBST(BinaryTreeNode<Integer> root){
//
//        // base case
//        if (root == null){
//            return true;
//        }
//
//        // if root data is less than or equal to left data
//        if (root.left != null && root.data <= root.left.data){
//            return false;
//        }
//
//        // if root data greater than right data
//        if (root.right != null && root.data > root.right.data){
//            return false;
//        }
//
//        // now check left and right subtree is in bst or not
//        boolean isLeftBST = isBST(root.left);
//        boolean isRightBST = isBST(root.right);
//
//        // if left and right subtree is bst then return true
//        return isLeftBST && isRightBST;
//    }

    // time complexity O(n)
    public static boolean isBSTSimple(BinaryTreeNode<Integer> root, int minRange, int maxRange){

        if (root == null){
            return true;
        }

        if (root.data < minRange || root.data > maxRange){
            return false;
        }

        boolean isLeftWithinRange = isBSTSimple(root.left, minRange, root.data - 1);
        boolean isRightWithinRange = isBSTSimple(root.right, root.data, maxRange);
        return isLeftWithinRange && isRightWithinRange;
    }

    // time complexity O(n)
    public static IsBSTReturn isBSTImproved(BinaryTreeNode<Integer> root){

        // if root is null than min = +infinite, max = -infinite, isBST = true
        if (root == null){
            IsBSTReturn ans = new IsBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
            return ans;
        }

        // call recursion in left and right subtree of root
        IsBSTReturn left = isBSTImproved(root.left);
        IsBSTReturn right = isBSTImproved(root.right);

        // find the min and max
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));

        // check condition for isBSt
        boolean isBST = true;

        // condition 1 : root should be greater than left
        if (root.data <= left.max){
            isBST = false;
        }
        // condition 2 : root should be less than equal to right
        if (root.data > right.min){
            isBST = false;
        }
        // condition 3 : left and right subtree should be BST
        if (!left.isBST || !right.isBST){
            isBST = false;
        }

        // return
        IsBSTReturn ans = new IsBSTReturn(min, max, isBST);
        return ans;

    }

    // Time complexity O(nh) , h can be n or logn
    public static boolean isBST(BinaryTreeNode<Integer> root){

        // base case
        if (root == null){
            return true;
        }

        // if root data is less than or equal to left max
        int leftMax = maximum(root.left);
        if (root.data <= leftMax){
            return false;
        }

        // if root data greater than right max
        int rightMin = minimum(root.right);
        if (root.data > rightMin){
            return false;
        }

        // now check left and right subtree is in bst or not
        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);

        // if left and right subtree is bst then return true
        return isLeftBST && isRightBST;
    }

    public static int minimum(BinaryTreeNode<Integer> root){

        if (root == null){
            return Integer.MAX_VALUE;
        }

        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    public static int maximum(BinaryTreeNode<Integer> root){

        if (root == null){
            return Integer.MIN_VALUE;
        }

        int leftMax = maximum(root.left);
        int rightMax = maximum(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
//        boolean ans = isBST(root);
//        System.out.println(ans);
//        IsBSTReturn ans  = isBSTImproved(root);
//        System.out.println(ans.min + " " + ans.max + " " + ans.isBST);
        boolean ans = isBSTSimple(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(ans);
    }
}
