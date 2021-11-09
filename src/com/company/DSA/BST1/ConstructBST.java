
/*
Given a sorted integer array A of size n, which contains all unique elements. You need to construct a balanced BST from this input array. Return the root of constructed BST.
Note: If array size is even, take first mid as root.
Input format:
The first line of input contains an integer, which denotes the value of n. The following line contains n space separated integers, that denote the values of array.
Output Format:
The first and only line of output contains values of BST nodes, printed in pre order traversal.
Constraints:
Time Limit: 1 second
Sample Input 1:
7
1 2 3 4 5 6 7
Sample Output 1:
4 2 1 3 6 5 7
 */

package com.company.DSA.BST1;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;
import com.company.DSA.BinaryTrees2.Levelwise.Print;

public class ConstructBST {

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){

        BinaryTreeNode<Integer> root = sortedArrayToBST(arr, 0, n-1);
        return root;
    }

    public static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr, int startIndex, int endIndex){

        // base case
        if (startIndex > endIndex){
            return null;
        }
        // find middle element
        int mid = (endIndex+startIndex) / 2;
        // root node
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);

        // left subtree
        root.left = sortedArrayToBST(arr, startIndex, mid-1);

        // right subtree
        root.right = sortedArrayToBST(arr, mid+1, endIndex);

        // return root node
        return root;

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = 7;
        BinaryTreeNode<Integer> ans = SortedArrayToBST(arr, n);
        Print.printLevelWise(ans);
    }
}
