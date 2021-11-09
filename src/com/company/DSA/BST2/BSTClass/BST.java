package com.company.DSA.BST2.BSTClass;

import com.company.DSA.BinaryTrees1.Node.BinaryTreeNode;

class DeleteReturn {
    BinaryTreeNode<Integer> root; // replacement node for deleted node
    boolean isDeleted;

    public DeleteReturn(BinaryTreeNode<Integer> root, boolean isDeleted) {
        this.root = root;
        this.isDeleted = isDeleted;
    }
}

public class BST {

    private BinaryTreeNode<Integer> root;
    int count;

    private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x) {
        // base case
        if (node == null) {
            return false;
        }

        if (node.data == x) {
            return true;
        }

        if (x < node.data) {
            // call on left side
            return isPresentHelper(node.left, x);
        } else {
            // call on right side
            return isPresentHelper(node.right, x);
        }
    }

    public boolean isPresent(int x) {
        return isPresentHelper(root, x);
    }

    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int x) {

        // base case
        if (node == null) {
            BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<>(x);
            return newRoot;
        }

        if (node.data > x) {
            node.left = insertHelper(node.left, x);
        } else {
            node.right = insertHelper(node.right, x);
        }
        return node;
    }

    public void insert(int x) {
        root = insertHelper(root, x);
        count++;
    }

    private static DeleteReturn deleteDataHelper(BinaryTreeNode<Integer> node, int x) {

        // base case
        if (node == null) {
            return new DeleteReturn(null, false);
        }

        // if x is present in right side
        if (node.data < x) {
            DeleteReturn outputRight = deleteDataHelper(node.right, x);
            node.right = outputRight.root; // update the right node
            return new DeleteReturn(node, true);
        }

        // if x is present in left side
        if (node.data > x) {
            DeleteReturn outputLeft = deleteDataHelper(node.left, x);
            node.left = outputLeft.root; // update the left node
            return new DeleteReturn(node, true);
        }

        // if root == x
        // if root has 0 child
        if (node.left == null && node.right == null) {
            return new DeleteReturn(null, true);
        }

        // if root has only left child
        if (node.left != null && node.right == null) {
            return new DeleteReturn(node.left, true);
        }

        // if root has only right child
        if (node.left == null && node.right != null) {
            return new DeleteReturn(node.right, true);
        }

        // if both child present :- we will delete the root and replace root by min element of right side
        // find the min on right side
        int rightMin = minimum(node.right);
        node.data = rightMin; // update root to rightMin
        DeleteReturn outputRight = deleteDataHelper(node.right, rightMin); // delete rightMin
        node.right = outputRight.root; // update right after deletion of right node
        return new DeleteReturn(node, true);

    }

    public static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    public boolean deleteData(int x) {
        DeleteReturn output = deleteDataHelper(root, x);
        root = output.root; // update root
        if (output.isDeleted) {
            count--;
        }
        return output.isDeleted;
    }

    public int size() {
        return count;
    }

    private static void printTreeHelper(BinaryTreeNode<Integer> node) {

        if (node == null) {
            return;
        }
        System.out.print(node.data + " : ");
        if (node.left != null) {
            System.out.print("L" + node.left.data + ", ");
        }
        if (node.right != null) {
            System.out.print("R" + node.right.data);
        }
        System.out.println();
        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }

    public void printTree() {
        printTreeHelper(root);
    }
}
