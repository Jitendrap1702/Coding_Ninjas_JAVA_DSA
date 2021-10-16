package com.company.DSA.BinaryTrees2.BalancedOrNot;

import com.company.DSA.BinaryTrees1.Input.InputBT;
import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;

public class CheckBalanced {

    public static int height(BinaryTreeNode<Integer> root) {

        if (root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Time complexity :- O(n**2)
    public static boolean isBalanced(BinaryTreeNode<Integer> root){

        if (root == null){
            return true;
        }

        // check root is balanced or not
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight-rightHeight) > 1){
            return false;
        }

        // now check left and right of root is balanced or not
        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }

    // Time Complexity :- O(n)
    public static BalancedTreeReturn isBalancedImproved(BinaryTreeNode<Integer> root){

        // if root is null
        if (root == null){
            int height = 0;
            boolean isBal = true;
            BalancedTreeReturn ans = new BalancedTreeReturn();
            ans.height = height;
            ans.isBalanced = isBal;
            return ans;
        }
        // if root is not null
        BalancedTreeReturn leftOutput = isBalancedImproved(root.left);
        BalancedTreeReturn rightOutput = isBalancedImproved(root.right);
        Boolean isBal = true;
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);

        if (Math.abs(leftOutput.height- rightOutput.height) > 1){
            isBal = false;
        }

        if (!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBal = false;
        }

        BalancedTreeReturn ans = new BalancedTreeReturn();
        ans.isBalanced = isBal;
        ans.height = height;
        return ans;
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
//        boolean balancedOrNot = isBalanced(root);
//        System.out.println(balancedOrNot);

        BalancedTreeReturn ans = isBalancedImproved(root);
        System.out.println(ans.isBalanced);
    }
}
