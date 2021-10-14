
/* Question

    For a given Binary Tree of integers, find and return the sum of all the nodes data.
    Example:
                        10
                      /    \
                    20      30
                   /    \
                 40    50

    When we sum up all the nodes data together, [10, 20, 30, 40 50] we get 150. Hence, the output will be 150.

 */

package com.company.DSA.BinaryTrees1;

import com.company.DSA.BinaryTrees1.Input.InputBT;
import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;

public class SumOfNodes {

    public static int sum(BinaryTreeNode<Integer> root){

        if (root == null){
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = InputBT.takeTreeInputBetter(true, 0, true);
        int count = sum(root);
        System.out.println(count);
    }
}
