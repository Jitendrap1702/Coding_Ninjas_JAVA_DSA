
/*
Given a generic tree, find and return the node with second largest value in given tree.
Return NULL if no node with required value is present.
Input format :
Elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
Output format:
Second Largest node data
Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0
Sample Output 1 :
40
 */

package com.company.DSA.GenericTrees.Assignment;

import com.company.DSA.GenericTrees.LevelWise.InputTree;
import com.company.DSA.GenericTrees.TreeNode.TreeNode;


class SecondLargestReturn {

    TreeNode<Integer> first; // largest node
    TreeNode<Integer> second; // second largest node

    public SecondLargestReturn(TreeNode<Integer> first, TreeNode<Integer> second){

        this.first = first;
        this.second = second;
    }
}

public class SecondLargestElement {

    public static SecondLargestReturn findSecondLargestHelper(TreeNode<Integer> root){

        if (root == null){
            return null;
        }

        int largest = root.data; // take root as largest node
        int secondLargest = Integer.MIN_VALUE;

        // check in its children
        for (TreeNode<Integer> i : root.children){

            SecondLargestReturn childAns = findSecondLargestHelper(i);
            if (childAns != null) {

                // compare with first largest
                if (childAns.first.data > largest) {
                    secondLargest = largest;
                    largest = childAns.first.data;
                }

                if (childAns.first.data > secondLargest && childAns.first.data != largest){
                    secondLargest = childAns.first.data;
                }

                // compare with second largest
                if (childAns.second.data > largest){
                    secondLargest = largest;
                    largest = childAns.second.data;
                }

                if (childAns.second.data > secondLargest && childAns.second.data != largest){
                    secondLargest = childAns.second.data;
                }
            }
        }

        return new SecondLargestReturn(new TreeNode<>(largest), new TreeNode<>(secondLargest));

    }

    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){

        return findSecondLargestHelper(root).second;

    }

    public static void main(String[] args) {

        TreeNode<Integer> root = InputTree.takeInputLevelWise();
        TreeNode<Integer> ans = findSecondLargest(root);
        if (ans != null) {
            System.out.println(ans.data);
        }
    }
}
