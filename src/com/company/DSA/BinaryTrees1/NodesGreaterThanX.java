
/* Question

    For a given a binary tree of integers and an integer X,
    find and return the total number of nodes of the given binary tree which are having data greater than X.

    Sample Input :
    1 4 2 3 -1 -1 -1
    2
    Sample Output :
    2

 */

package com.company.DSA.BinaryTrees1;

import com.company.DSA.BinaryTrees1.Input.InputBT;
import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;

import java.util.Scanner;

public class NodesGreaterThanX {

    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {

        if (root == null){
            return 0;
        }

        int leftCount = countNodesGreaterThanX(root.left, x);
        int rightCount = countNodesGreaterThanX(root.right, x);

        if (root.data > x){
           return 1+leftCount+rightCount;
        }
        else return leftCount+rightCount;
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = countNodesGreaterThanX(root, x);
        System.out.println(count);
    }
}
