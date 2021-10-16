
/*

For a given preorder and inorder traversal of a Binary Tree of type integer stored in an array/list, create the binary tree using the given two arrays/lists.
You just need to construct the tree and return the root.

Note:
Assume that the Binary Tree contains only unique elements.

Input Format:
The first line of input contains an integer N denoting the size of the list/array.
It can also be said that N is the total number of nodes the binary tree would have.

The second line of input contains N integers, all separated by a single space.
It represents the preorder-traversal of the binary tree.

The third line of input contains N integers, all separated by a single space.
It represents the inorder-traversal of the binary tree.

Output Format:
The given input tree will be printed in a level order fashion where each level will be printed on a new line.
Elements on every level will be printed in a linear fashion. A single space will separate them.
Constraints:
1 <= N <= 10^4
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
7
1 2 4 5 3 6 7
4 2 5 1 6 3 7
Sample Output 1:
1
2 3
4 5 6 7
Sample Input 2:
6
5 6 2 3 9 10
2 6 3 9 5 10
Sample Output 2:
5
6 10
2 3
9
 */

package com.company.DSA.BinaryTrees2;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;
import com.company.DSA.BinaryTrees2.Levelwise.Print;

public class ConstructTreeUsingInorderAndPreorder {

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {

        if (preOrder.length == 0){
            return null;
        }
        // find root of given tree :- root will be first element of PreOrder
        int rootData = preOrder[0];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);

        // find the root index in inorder
        int rootIndexInOrder = -1;
        for (int i = 0; i < inOrder.length; i++){
            if (inOrder[i] == rootData){
                rootIndexInOrder = i;
                break;
            }
        }
        if (rootIndexInOrder == -1){
            return null;
        }

        // now find out left and right subtree of inorder
        // left Subtree
        int[] leftSubtreeInOrder = new int[rootIndexInOrder];
        for (int i = 0; i < rootIndexInOrder; i++){
            leftSubtreeInOrder[i] = inOrder[i];
        }
        // right subtree
        int[] rightSubtreeInOrder = new int[inOrder.length - rootIndexInOrder-1];
        int j = 0;
        for (int i = rootIndexInOrder + 1; i < inOrder.length; i++){
            rightSubtreeInOrder[j] = inOrder[i];
            j++;
        }

        // now find out left and right subtree of preorder
        // length of left subtree for preorder will be same as length of left subtree of inorder
        int lenLeftSubtree = leftSubtreeInOrder.length;
        // left subtree
        int[] leftSubtreePreOrder = new int[lenLeftSubtree];
        for (int i = 1; i < lenLeftSubtree + 1; i++){
            leftSubtreePreOrder[i-1] = preOrder[i];
        }
        // right subtree
        int[] rightSubtreePreOrder = new int[rightSubtreeInOrder.length];
        j = 0;
        for (int i = lenLeftSubtree + 1; i < preOrder.length; i++){
            rightSubtreePreOrder[j] = preOrder[i];
            j++;
        }

        // left and right child of new constructed binary tree
        BinaryTreeNode<Integer> leftChild = buildTree(leftSubtreePreOrder, leftSubtreeInOrder);
        BinaryTreeNode<Integer> rightChild = buildTree(rightSubtreePreOrder, rightSubtreeInOrder);

        // connect left and right child to root
        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    // 2nd Idea :- If we don't want to make copies of preOrder and inOrder array again and again for every recursive call
    public static BinaryTreeNode<Integer> buildTreeCN(int[] preOrder, int[] inOrder) {

        BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder, 0 ,preOrder.length-1, 0, inOrder.length-1);
        return root;

    }

    public static BinaryTreeNode<Integer> buildTree(int[] preorder, int[] inorder,int siPre, int eiPre, int siIn, int eiIn)
    {
        //Base case - If number of elements in the pre-order is 0
        if (siPre>eiPre)
        {
            return null;
        }

        //Defining the root node for current recursion
        int rootData=preorder[siPre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        //Finding root data's location in Inorder (Assuming root data exists in Inorder)
        int rootIndexInorder=-1;
        for (int i=siIn;i<=eiIn;i++)
        {
            if (rootData==inorder[i])
            {
                rootIndexInorder=i;
                break;
            }
        }

        //Defining index limits for Left Subtree Inorder
        int siInLeft=siIn;
        int eiInLeft=rootIndexInorder-1;

        //Defining the index limits for Left Subtree Preorder
        int siPreLeft=siPre+1;
        int leftSubTreeLength = eiInLeft - siInLeft + 1;
        int eiPreLeft=(siPreLeft)+(leftSubTreeLength-1);

        //Defining index limits for Right Subtree Inorder
        int siInRight=rootIndexInorder+1;
        int eiInRight=eiIn;

        //Defining index limits for Right Subtree Preorder
        int siPreRight=eiPreLeft+1;
        int eiPreRight=eiPre;

        BinaryTreeNode<Integer> leftChild = buildTree(preorder, inorder, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
        BinaryTreeNode<Integer> rightChild = buildTree(preorder, inorder, siPreRight, eiPreRight, siInRight, eiInRight);
        root.left=leftChild;
        root.right=rightChild;
        return root;
    }


    public static void main(String[] args) {

        int[] inOrder = {4, 2, 5, 1, 6, 3, 7};
        int[] preOrder = {1, 2, 4, 5, 3, 6, 7};
        BinaryTreeNode<Integer> root = buildTreeCN(preOrder, inOrder);
        Print.printLevelWise(root);
    }
}
