/*
Given a list of n words and a pattern p that we want to search.
Check if the pattern p is present the given words or not.
Return true if the pattern is present and false otherwise.
Input Format :
The first line of input contains an integer, that denotes the value of n.
The following line contains n space separated words.
The following line contains a string, that denotes the value of the pattern p.
Output Format :
The first and only line of output contains true if the pattern is present and false otherwise.
Constraints:
Time Limit: 1 sec
Sample Input 1 :
4
abc def ghi cba
de
Sample Output 2 :
true
Sample Input 2 :
4
abc def ghi hg
hi
Sample Output 2 :
true
Sample Input 3 :
4
abc def ghi hg
hif
Sample Output 3 :
false
 */
package com.company.DSA.TriesAndHuffmanCoding.Assignment;

import java.util.ArrayList;

public class PatternMatching {

    public static void main(String[] args) {
        Trie t = new Trie();
        ArrayList<String> vect = new ArrayList<>();
        vect.add("ABC");
        vect.add("DEF");
        vect.add("GHI");
        vect.add("HG");
        String pattern = "HI";
        boolean ans = t.patternMatching(vect, pattern);
        System.out.println(ans);
    }
}

class TrieNode{

    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}


class Trie {

    private TrieNode root;
    public int count;
    public Trie() {
        root = new TrieNode('\0');
    }

    public boolean search(String word){
        return search(root, word);
    }

    private boolean search(TrieNode root, String word) {
        if(word.length() == 0){
            return true;
        }
        int childIndex = word.charAt(0) - 'A';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return false;
        }
        return search(child, word.substring(1));
    }

    private void addHelper(TrieNode root, String word){

        // if it is the last alphabet of word then make it terminal
        if (word.length() == 0){
            root.isTerminating = true;
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

    public boolean patternMatching(ArrayList<String> vect, String pattern) {
        // Add all suffixes of vect to the trie
        for (String s : vect){
            for (int i = 0; i < s.length(); i++){
                add(s.substring(i));
            }
        }
        // now check that trie have given input pattern or not
        return search(pattern);
    }
}
