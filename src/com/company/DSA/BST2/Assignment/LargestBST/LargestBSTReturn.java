package com.company.DSA.BST2.Assignment.LargestBST;

public class LargestBSTReturn {

    int size; // size of subtree
    int min; // min value in subtree
    int max; // max value in subtree
    int ans; // size of largest BST which is subtree of current node
    boolean isBST;

    public LargestBSTReturn(int size, int min, int max, int ans, boolean isBST){

        this.size = size;
        this.min = min;
        this.max = max;
        this.ans = ans;
        this.isBST = isBST;
    }

    public LargestBSTReturn(){

    }
}
