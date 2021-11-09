package com.company.DSA.GenericTrees.TreeNode;

import java.util.ArrayList;

public class TreeNode<T> {

    public T data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        this.children = new ArrayList<>();
    }
}
