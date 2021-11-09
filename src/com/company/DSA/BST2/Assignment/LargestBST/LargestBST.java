
/*
Given a Binary tree, find the largest BST subtree. That is,
you need to find the BST with maximum height in the given binary tree.
You have to return the height of largest BST.
Input format :
The first line of input contains data of the nodes of the tree in level order form.
The data of the nodes of the tree is separated by space. If any node does not have left or right child,
take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore,
it will not be a part of the data of any node.
Output format:
The first and only line of output contains the height of the largest BST.
Constraints:
Time Limit: 1 second
Sample Input 1:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 1:
2
 */

package com.company.DSA.BST2.Assignment.LargestBST;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;

public class LargestBST {

    static int MAX = Integer.MAX_VALUE;
    static int MIN = Integer.MIN_VALUE;

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
    public static int height(BinaryTreeNode<Integer> root) {

        if (root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }


    // solution 1
    // O(n**2)
    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {

        if(root == null){
            return 0;
        }

        if (isBSTSimple(root, Integer.MIN_VALUE, Integer.MAX_VALUE)){
            return height(root);
        }
        else {
            int left = largestBSTSubtree(root.left);
            int right = largestBSTSubtree(root.right);
            return Math.max(left, right);
        }
    }

    // solution 2
    // time complexity O(n)
    public static LargestBSTReturn largestBSTSubtreeImproved(BinaryTreeNode<Integer> root){

        // base case
        if (root == null){
            return new LargestBSTReturn(0, MAX, MIN, 0, true);
        }

        if (root.left == null && root.right == null){
            return new LargestBSTReturn(1, MAX, MIN, 1, true);
        }

        // Recur for left and right subtree
        LargestBSTReturn left = largestBSTSubtreeImproved(root.left);
        LargestBSTReturn right = largestBSTSubtreeImproved(root.right);

        // create object for ans
        LargestBSTReturn output = new LargestBSTReturn();
        // initialize its size
        output.size = 1 + Math.max(left.size, right.size);

        // if whole tree rooted under current root is BST
        if (left.isBST && right.isBST && right.min > root.data && left.max < root.data){
            output.max = Math.max(Math.max(left.max, right.max), root.data);
            output.min = Math.min(Math.min(left.min, right.min), root.data);
            output.ans = output.size;
            output.isBST = true;
            return output;
        }
        // if not BST
        output.ans = Math.max(right.ans, left.ans);
        output.isBST = false;
        return output;

    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
        //int ans = largestBSTSubtree(root);
        int ans = largestBSTSubtreeImproved(root).ans;
        System.out.println(ans);
    }
}
