package com.company.DSA.Queue;

public class QueueUse {

    public static void main(String[] args) throws QueueEmptyException, QueueFullException {

        // implement using array
        QueueUsingArray queueUsingArray = new QueueUsingArray(4);
        int[] arr = {5, 6, 7, 1};
        for (int data : arr){
            queueUsingArray.enqueue(data);
        }

        System.out.println(queueUsingArray.size());
        System.out.println(queueUsingArray.isEmpty());
        System.out.println(queueUsingArray.front());

//        while (!queueUsingArray.isEmpty()){
//            System.out.println(queueUsingArray.dequeue());
//        }
        queueUsingArray.dequeue();
        queueUsingArray.dequeue();
        queueUsingArray.enqueue(9);
        queueUsingArray.enqueue(10);
        queueUsingArray.enqueue(11);
        queueUsingArray.enqueue(12);
        queueUsingArray.enqueue(13);

        while (!queueUsingArray.isEmpty()){
            System.out.println(queueUsingArray.dequeue());
        }

        System.out.println("Queue Using LL");
        // implement using LinkedList
        QueueUsingLL queueUsingLL = new QueueUsingLL();
        for (int data : arr){
            queueUsingLL.enqueue(data);
        }

        System.out.println(queueUsingLL.size());
        System.out.println(queueUsingLL.isEmpty());
        System.out.println(queueUsingLL.front());

        while (!queueUsingLL.isEmpty()){
            System.out.println(queueUsingLL.dequeue());
        }

        queueUsingLL.enqueue(13);
        System.out.println(queueUsingLL.dequeue());
        //System.out.println(queueUsingLL.front());
        queueUsingLL.enqueue(42);
        System.out.println(queueUsingLL.front());
        System.out.println(queueUsingLL.dequeue());

        // Implement queue using 2 Stacks
        QueueUsing2Stacks queueUsing2Stacks = new QueueUsing2Stacks();
        queueUsing2Stacks.enqueue(10);
        queueUsing2Stacks.enqueue(20);
        queueUsing2Stacks.enqueue(30);
        System.out.println(queueUsing2Stacks.front());
        System.out.println(queueUsing2Stacks.size());

        System.out.println(queueUsing2Stacks.dequeue());
        System.out.println(queueUsing2Stacks.dequeue());
        System.out.println(queueUsing2Stacks.dequeue());

        // Implement queue using 2 Stacks
        StackUsing2Queue stackUsing2Queue = new StackUsing2Queue();
        stackUsing2Queue.push(11);
        stackUsing2Queue.push(21);
        stackUsing2Queue.push(31);

        System.out.println(stackUsing2Queue.size());
        System.out.println(stackUsing2Queue.isEmpty());
        System.out.println(stackUsing2Queue.top());

        System.out.println(stackUsing2Queue.pop());
        System.out.println(stackUsing2Queue.pop());
        System.out.println(stackUsing2Queue.pop());
        System.out.println(stackUsing2Queue.pop());
    }
}
