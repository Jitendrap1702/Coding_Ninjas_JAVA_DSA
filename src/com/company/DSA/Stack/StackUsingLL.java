package com.company.DSA.Stack;

import com.company.DSA.LinkedList1.APrintLL.Node;

public class  StackUsingLL<T> {

    private Node<T> head;
    private int count;

    public StackUsingLL() {
        head = null;
        count = 0;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return head == null;
        // return count == 0;
    }

    public void push(T ele) {
        Node<T> newNode = new Node<T>(ele);
        newNode.next = head;
        head = newNode;
        count++;
    }

    public T top() throws StackEmptyException {
        if (head == null) {
            // throw stackEmptyException
            throw new StackEmptyException();
        }
        return head.data;
    }

    public T pop() throws StackEmptyException {
        if (head == null) {
            // throw stackEmptyException
            throw new StackEmptyException();
        }
        Node<T> temp = head;
        head = head.next;
        count--;
        return temp.data;
    }
}
