
/*
Given a tree and an integer x, find and return number of Nodes which are greater than x.
Input format :
Single Line : First Integer denotes x and rest of the elements in level order form separated by space.
Order is -
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
Output Format :
Count of nodes greater than x
Sample Input 1 :
35 10 3 20 30 40 2 40 50 0 0 0 0
Sample Output 1 :
3
Sample Input 2 :
10 10 3 20 30 40 2 40 50 0 0 0 0
Sample Output 2:
5
 */

package com.company.DSA.GenericTrees;

import com.company.DSA.GenericTrees.LevelWise.InputTree;
import com.company.DSA.GenericTrees.TreeNode.TreeNode;

import java.util.Scanner;

public class NumberGreaterThanX {

    public static int numNodeGreater(TreeNode<Integer> root,int x){

        if (root == null){
            return 0;
        }

        int count = 0; // initial count
        if (root.data > x){ // if root greater than x than increase count by 1
            count += 1;
        }

        // now check for its children
        for (TreeNode <Integer> i : root.children){
            // get the child count
            int childCount = numNodeGreater(i, x);
            // add it to total count
            count += childCount;
        }

        return count;
    }

    public static void main(String[] args) {

        TreeNode<Integer> root = InputTree.takeInputLevelWise();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = numNodeGreater(root, x);
        System.out.println(ans);
    }
}
