
/* print binary tree level wise

    Sample Input :
    8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1

    Sample Output :
    8:L:3,R:10
    3:L:1,R:6
    10:L:-1,R:14
    1:L:-1,R:-1
    6:L:4,R:7
    14:L:13,R:-1
    4:L:-1,R:-1
    7:L:-1,R:-1
    13:L:-1,R:-1

 */

package com.company.DSA.BinaryTrees2.Levelwise;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Print {

    public static void printLevelWise(BinaryTreeNode<Integer> root) {

        // create a queue
        Queue<BinaryTreeNode<Integer>> currentChildren = new LinkedList<>();
        // Add root to the Queue
        currentChildren.add(root);

        while (!currentChildren.isEmpty()){

            // take out front node
            BinaryTreeNode<Integer> front = currentChildren.remove();

            // print for front node
            System.out.print(front.data + " : ");

            // check front nodes children
            // left children
            if (front.left != null){
                System.out.print("L " + front.left.data + ", ");
                // add left of front node to the queue
                currentChildren.add(front.left);
            }
            // right children
            if (front.right != null){
                System.out.print("R " + front.right.data);
                // add right of front node to the queue
                currentChildren.add(front.right);
            }
            System.out.println();
        }
    }

    public static void printLevelWiseCN(BinaryTreeNode<Integer> root) {

        // create a queue
        Queue<BinaryTreeNode<Integer>> currentChildren = new LinkedList<>();
        // Add root to the Queue
        currentChildren.add(root);

        while (!currentChildren.isEmpty()){

            // take out front node
            BinaryTreeNode<Integer> front = currentChildren.remove();

            // print for front node
            System.out.print(front.data + ":");

            // check front nodes children
            // left children
            if (front.left != null){
                System.out.print("L:" + front.left.data + ",");
                // add left of front node to the queue
                currentChildren.add(front.left);
            }else{
                System.out.print("L:" + -1 + ",");
            }
            // right children
            if (front.right != null){
                System.out.print("R:" + front.right.data);
                // add right of front node to the queue
                currentChildren.add(front.right);
            }else{
                System.out.print("R:" + -1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = Input.takeInputLevelWise();
        printLevelWiseCN(root);
    }
}
