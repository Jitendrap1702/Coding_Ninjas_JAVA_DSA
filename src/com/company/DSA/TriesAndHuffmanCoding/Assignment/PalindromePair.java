/*
Given 'n' number of words, you need to find
if there exist any two words which can be joined to make a palindrome or any word,
which itself is a palindrome.
The function should return either true or false. You don't have to print anything.
Input Format :
The first line of the test case contains an integer value denoting 'n'.

The following contains 'n' number of words each separated by a single space.
Output Format :
The first and only line of output contains true
if the conditions described in the task are met and false otherwise.
Constraints:
0 <= n <= 10^5
Time Limit: 1 sec
Sample Input 1 :
4
abc def ghi cba
Sample Output 1 :
true
Explanation of Sample Input 1:
"abc" and "cba" forms a palindrome
Sample Input 2 :
2
abc def
Sample Output 2 :
false
Explanation of Sample Input 2:
Neither their exists a pair which forms a palindrome, nor any of the words is a palindrome in itself.
Hence, the output is 'false.'
 */
package com.company.DSA.TriesAndHuffmanCoding.Assignment;

import java.util.ArrayList;

public class PalindromePair {

    public static void main(String[] args) {

        Trie1 t = new Trie1();
        ArrayList<String> words = new ArrayList<>();
        words.add("ABC");
        words.add("DEF");
        words.add("GHI");
        words.add("MCBA");
        boolean ans = t.isPalindromePair(words);
        System.out.println(ans);
    }
}

class TrieNode1 {
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode1(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

class Trie1 {

    private TrieNode root;
    public int count;

    public Trie1() {
        root = new TrieNode('\0');
    }

    private void add(TrieNode root, String word){
        if(word.length() == 0){
            root.isTerminating = true;
            return;
        }

        int childIndex = word.charAt(0) - 'A';
        TrieNode child = root.children[childIndex];

        if(child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }

        add(child, word.substring(1));
    }

    public void add(String word){
        add(root, word);
    }

    private boolean search(TrieNode root, String word) {
        if(word.length() == 0) {
            return true;
        }

        int childIndex=word.charAt(0) - 'A';
        TrieNode child=root.children[childIndex];

        if(child == null) {
            return false;
        }

        return search(child,word.substring(1));

    }

    public boolean search(String word) {
        return search(root,word);
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

    public void print() {
        print(this.root, "");
    }




    /*..................... Palindrome Pair................... */


    public boolean isPalindromePair(ArrayList<String> words) {
        //Your code goes here
        // add all suffixes of word in words to the trie
        for (String s : words){
            for (int i = 0; i < s.length(); i++){
                add(s.substring(i));
            }
        }
        return isPalindromeExists(root, words);
    }

    // check word itself is palindrome or not
    private boolean isPalindrome(String word) {

        for (int i = 0, j = word.length()-1; i<=j; i++, j--){
            if (word.charAt(i) != word.charAt(j)){
                return false;
            }
        }
        return true;
    }

    // check the palindrome of word exist or not
    private boolean isPalindromeExists(TrieNode root, ArrayList<String> words) {

        for (String s: words){
            // if word itself is in palindrome
            if (isPalindrome(s)){
                return true;
            }
            // reverse s
            String reverse = "";
            for (int i = s.length()-1; i>=0; i--){
                reverse += s.charAt(i);
            }
            if (search(root, reverse)){
                return true;
            }
        }
        return false;
    }

}