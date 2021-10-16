
/*
For a given a Binary Tree of type integer, print it in a level order fashion where each level will be printed on a new line. Elements on every level will be printed in a linear fashion and a single space will separate them.
Example:
alt txt

For the above-depicted tree, when printed in a level order fashion, the output would look like:

10
20 30
40 50 60
Where each new line denotes the level in the tree.
Input Format:
The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
Output Format:
The given input tree will be printed in a level order fashion where each level will be printed on a new line.
Elements on every level will be printed in a linear fashion. A single space will separate them.
Constraints:
1 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
10 20 30 40 50 -1 60 -1 -1 -1 -1 -1 -1
Sample Output 1:
10
20 30
40 50 60
Sample Input 2:
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
Sample Output 2:
8
3 10
1 6 14
4 7 13
 */

package com.company.DSA.BinaryTrees2.Assignment;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Input;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void printLevelWise(BinaryTreeNode<Integer> root) {

        // create a queue
        Queue<BinaryTreeNode<Integer>> currentChildren = new LinkedList<>();
        // Add root to the Queue
        currentChildren.add(root);

        while (!currentChildren.isEmpty()) {

            int size = currentChildren.size();
            if (size == 0){
                break;
            }
            // remove and print all nodes at current level
            while (size > 0) {

                // take out front node
                BinaryTreeNode<Integer> front = currentChildren.remove();

                // print for front node
                System.out.print(front.data + " ");

                // check front nodes children
                // left children
                if (front.left != null) {
                    // add left of front node to the queue
                    currentChildren.add(front.left);
                }
                // right children
                if (front.right != null) {
                    // add right of front node to the queue
                    currentChildren.add(front.right);
                }

                size--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
        printLevelWise(root);
    }
}
