/*
Given a generic tree, print the post-order traversal of given tree.
The post-order traversal is: visit child nodes first and then root node.
Input format:
The first line of input contains data of the nodes of the tree in level order form.
The order is: data for root node, number of children to root node, data of each of child nodes and
so on and so forth for each node. The data of the nodes of the tree is separated by space.
Output Format :
The first and only line of output contains the elements printed in post-order traversal.
The elements in the output must be separated by a single space.
Constraints:
Time Limit: 1 sec
Sample Input 1:
10 3 20 30 40 2 400 50 0 0 0 0
Sample Output 1:
400 50 20 30 40 10
 */

package com.company.DSA.GenericTrees;

import com.company.DSA.GenericTrees.LevelWise.InputTree;
import com.company.DSA.GenericTrees.TreeNode.TreeNode;

public class PostOrderTraversal {

    /*
    Post Order :- left->right->root
     */
    public static void printPostOrder(TreeNode<Integer> root){

        // special case
        if (root == null){
            return;
        }

        // first print children
//        for (int i = 0; i < root.children.size(); i++){
//            printPostOrder(root.children.get(i));
//        }
        for (TreeNode<Integer> i : root.children){
            TreeNode<Integer> child = i;
            printPostOrder(child);
        }
        // print root in the end
        System.out.print(root.data + " ");
    }


    public static void main(String[] args) {

        TreeNode<Integer> root = InputTree.takeInputLevelWise();
        printPostOrder(root);
    }
}
