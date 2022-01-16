package com.company.DSA.HashMaps.Map;

import java.util.ArrayList;

public class Map<K, V> {

    ArrayList<MapNode<K, V>> buckets;
    int count;
    int numBuckets;

    public Map() {

        buckets = new ArrayList<>();
        numBuckets = 5;
        for (int i = 0; i < numBuckets; i++){
            buckets.add(null);
        }
    }

    private int getBucketIndex(K key){
        int hc = key.hashCode();
        int index = hc%numBuckets;
        return index;
    }

    // size
    public int size(){
        return count;
    }

    // search
    public V getValue(K key){

        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        while (head != null){
            if (head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    // remove
    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        MapNode<K, V> prev = null;
        while (head != null){
            if (head.key.equals(key)) {
                if (prev != null) {
                    prev.next = head.next;
                } else {
                    // when 0th index of linked list matches with key
                    buckets.set(bucketIndex, head.next);
                }
                count--;
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }

    // insert
    public void insert(K key, V value) {

        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        // element is already there? just update its value
        while (head != null){
            if (head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }

        // element is not there. insert at 0th position of linked list
        head = buckets.get(bucketIndex);
        MapNode<K, V> newNode = new MapNode<>(key, value);
        newNode.next = head;
        buckets.set(bucketIndex, newNode);
        count++;
        double loadFactor = (1.0*count)/numBuckets;
        if (loadFactor > 0.7){
            reHash();
        }
    }

    public double loadFactor(){
        return (1.0*count)/numBuckets;
    }

    private void reHash() {

        ArrayList<MapNode<K, V>> temp = buckets;
        buckets = new ArrayList<>();
        for (int i = 0; i < 2*numBuckets; i++){
            buckets.add(null);
        }
        count = 0;
        numBuckets = 2*numBuckets;
        for (int i = 0; i < temp.size(); i++){
            MapNode<K, V> head = temp.get(i);
            while (head != null){
                K key = head.key;
                V value = head.value;
                insert(key, value);
                head = head.next;
            }
        }
    }
}
