package com.company.DSA.TriesAndHuffmanCoding.Assignment;

import java.util.ArrayList;

public class AutoComplete {

    public static void main(String[] args) {

        TrieAC t = new TrieAC();
        ArrayList<String> words = new ArrayList<>();
        words.add("do");
        words.add("no");
        words.add("not");
        words.add("dont");
        words.add("note");
        words.add("den");
        words.add("notes");
        String word = "no";
        t.autoComplete(words, word);
    }
}

class TrieNodeAC {
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNodeAC(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

class TrieAC {
    private TrieNode root;
    public int count;

    public TrieAC() {
        root = new TrieNode('\0');
    }

    private void add(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminating = true;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        add(child, word.substring(1));
    }

    public void add(String word) {
        add(root, word);
    }

    private void print(TrieNode root, String word) {
        if (root == null) {
            return;
        }

        if (root.isTerminating) {
            System.out.println(word);
        }

        for (TrieNode child : root.children) {
            if (child == null) {
                continue;
            }
            String fwd = word + child.data;
            print(child, fwd);
        }
    }

//    public void print() {
//        print(this.root, "");
//    }


    public void autoComplete(ArrayList<String> input, String word) {
        // Write your code here
        // add all input to the trie
        for (String s : input) {
            add(s);
        }
        // find all possible words and print them
        root = findWord(root, word);
        if (root == null){ // no words exists
            return;
        }
        allPossibleWords(root, word);
    }

    // find word in trie
    // if word exist then return trieNode of last character
    public TrieNode findWord(TrieNode root, String word){

        if (word.length() == 0){
            return root;
        }
        int childIndex = word.charAt(0)-'a';
        TrieNode child = root.children[childIndex];
        if (child == null){
            return null;
        }
        return findWord(child, word.substring(1));
    }

    // check all possible words and print them
    public void allPossibleWords(TrieNode root, String word){

        if (root.isTerminating){
            System.out.println(word + "");
        }

        for (int i=0; i<26; i++){
            if (root.children[i] != null){
                char c = (char) (i + 'a');
                allPossibleWords(root.children[i], word+c);
            }
        }
        return;
    }

}
