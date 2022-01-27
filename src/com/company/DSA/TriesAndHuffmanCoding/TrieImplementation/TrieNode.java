package com.company.DSA.TriesAndHuffmanCoding.TrieImplementation;

// All words contain capital letters only

public class TrieNode {

    char data;
    boolean isTerminal;
    TrieNode children[];
    int childCount;

    public TrieNode(char data){
        this.data = data;
        this.isTerminal = false;
        this.children = new TrieNode[26];
        this.childCount = 0;
    }
}

class Trie{

    private TrieNode root;

    public Trie() {
        root = new TrieNode('\0');
    }

    private void addHelper(TrieNode root, String word){

        // if it is the last alphabet of word then make it terminal
        if (word.length() == 0){
            root.isTerminal = true;
            return;
        }
        int childIndex = word.charAt(0)-'A';
        TrieNode child = root.children[childIndex];
        // if child not exists then create new child of this alphabet and add in the root
        if (child == null){
            child = new TrieNode(word.charAt(0)); // create child
            root.children[childIndex] = child; // add child to root node
            root.childCount++; // increase child count
        }
        addHelper(child, word.substring(1));
    }

    // Time complexity :- O(world length)
    public void add(String word) {

        addHelper(root, word);
    }

    private boolean searchHelper(TrieNode root, String word) {

        if (word.length() == 0){
            return root.isTerminal; // last word node is terminal or not
        }
        int childIndex = word.charAt(0)-'A';
        TrieNode child = root.children[childIndex];
        if (child == null){ // if child is not exists return false
            return false;
        }else {
            return searchHelper(child, word.substring(1)); // if exists then check for further alphabets of word
        }
    }

    // Time complexity :- O(world length)
    public boolean search(String word) {

        return searchHelper(root, word);
    }

    private void removeHelper(TrieNode root, String word) {

        if (word.length() == 0){
            root.isTerminal = false; // make isTerminal false for last alphabet of word
            return;
        }
        int childIndex = word.charAt(0)-'A';
        TrieNode child = root.children[childIndex];
        if (child == null){ // if word not exists
            return;
        }
        removeHelper(child, word.substring(1));
        // We can remove child node only if it is non terminating and its number of children are 0
        if (!child.isTerminal && child.childCount == 0){
            root.children[childIndex] = null; // remove child by putting in place of child alphabet
            root.childCount--; // decrease child count
        }
    }

    // Time complexity :- O(world length)
    public void remove(String word) {

        removeHelper(root, word);
    }
}
