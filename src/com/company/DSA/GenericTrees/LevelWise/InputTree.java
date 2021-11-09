package com.company.DSA.GenericTrees.LevelWise;

import com.company.DSA.GenericTrees.PrintTree.PrintTree;
import com.company.DSA.GenericTrees.TreeNode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InputTree {

    public static TreeNode<Integer> takeInputLevelWise(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data : ");
        int rootData = sc.nextInt();
        if (rootData == -1){
            return null;
        }
        // Create root node
        TreeNode<Integer> root = new TreeNode<>(rootData);
        // create a Queue Object
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        // add root to queue
        queue.add(root);

        while (!queue.isEmpty()){

            // take out front node
            TreeNode<Integer> front = queue.remove();

            // ask for its children
            System.out.println("Enter the number of children of " + front.data + " : ");
            int numOfChild = sc.nextInt();

            for (int i = 0; i < numOfChild; i++){

                System.out.println("Enter " + i + "th child of " + front.data + " : " );
                // get child
                int childData = sc.nextInt();
                // convert child to tree node
                TreeNode<Integer> child = new TreeNode<>(childData);
                // connect child to root node
                front.children.add(child);
                // add child to queue
                queue.add(child);

            }
        }
        return root;
    }

    public static void main(String[] args) {

        TreeNode<Integer> root = takeInputLevelWise();
        PrintTree.printTreeBetter(root);

    }
}
