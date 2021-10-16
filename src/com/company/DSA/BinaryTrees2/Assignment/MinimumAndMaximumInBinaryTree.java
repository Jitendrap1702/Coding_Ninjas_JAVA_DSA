/*
For a given a Binary Tree of type integer, find and return the minimum and the maximum data values.
Return the output as an object of Pair class, which is already created.
Note:
All the node data will be unique and hence there will always exist a minimum and maximum node data.
Input Format:
The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
Output Format:
The only line of output prints two integers denoting the minimum and the maximum data values respectively. A single line will separate them both.
Constraints:
2 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
Sample Output 1:
1 14
Sample Input 2:
10 20 60 -1 -1 3 50 -1 -1 -1 -1
Sample Output 2:
3 60
 */

package com.company.DSA.BinaryTrees2.Assignment;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;
import com.company.DSA.OOPS3.ChainedGenericPairs.Pair;

public class MinimumAndMaximumInBinaryTree {

    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {

        int min = findMin(root);
        int max = findMax(root);

        return new Pair<>(min, max);
    }

    public static int findMin(BinaryTreeNode<Integer> root){

        if (root == null){
            return Integer.MAX_VALUE;
        }

        int leftMin = findMin(root.left);
        int rightMin = findMin(root.right);

        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    public static int findMax(BinaryTreeNode<Integer> root){

        if (root == null){
            return Integer.MIN_VALUE;
        }

        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
        Pair<Integer, Integer> ans = getMinAndMax(root);
        System.out.println("Min :- " + ans.getFirst() + " Max :- " + ans.getSecond());
    }
}
