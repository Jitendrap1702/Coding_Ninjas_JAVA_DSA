package com.company.DSA.TriesAndHuffmanCoding.TrieImplementation;

public class TrieUse {

    public static void main(String[] args) {

        Trie t = new Trie();
        t.add("NOTE");
        t.add("NOT");
        t.add("DO");
        System.out.println(t.search("NO"));
        System.out.println(t.search("NOT"));
        t.remove("NOT");
        System.out.println(t.search("NOT"));
        t.remove("NEW");
    }
}
