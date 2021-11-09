
/*
Given a generic tree, print the input tree in level wise order.
That is, print the elements at same level in one line (separated by space).
Print different levels in different lines.
Input format :
Elements in level order form separated by space (as per done in class). Order is -
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
Output Format :
Level wise print
Sample Input :
10 3 20 30 40 2 40 50 0 0 0 0
Sample Output :
10
20 30 40
40 50
 */

package com.company.DSA.GenericTrees.LevelWise;

import com.company.DSA.GenericTrees.TreeNode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTree {

    // print level wise with their children
    public static void printLevelWise(TreeNode<Integer> root){

        if (root == null){
            return;
        }

        // Create a Queue object
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        // add root to queue
        queue.add(root);

        while (!queue.isEmpty()){

            // take out front node from queue and print
            TreeNode<Integer> front = queue.remove();
            System.out.print(front.data + " : ");

            // print its children and add to the queue
            for (TreeNode<Integer> i : front.children){

                System.out.print(i.data + " ");
                queue.add(i);
            }
            System.out.println();
        }
    }

    // print level wise without children
    public static void printLevelWise2(TreeNode<Integer> root){

        if (root == null){
            return;
        }

        // Create a Queue object
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        // add root to queue
        queue.add(root);

        while (!queue.isEmpty()){

            int size = queue.size();
            if (size == 0){
                break;
            }

            while (size > 0) {


                // take out front node from queue and print
                TreeNode<Integer> front = queue.remove();
                System.out.print(front.data + " ");

                // print its children and add to the queue
                for (TreeNode<Integer> i : front.children) {
                    queue.add(i);
                }
                size--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        TreeNode<Integer> root = InputTree.takeInputLevelWise();
        printLevelWise2(root);
    }
}
