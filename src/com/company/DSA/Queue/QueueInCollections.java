package com.company.DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInCollections {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        // add
        queue.add(10);
        queue.add(20);
        queue.add(30);
        // size
        System.out.println(queue.size());
        // top
        System.out.println(queue.peek());
        // remove
        System.out.println(queue.poll());
    }
}
