package org.train.java.basic.classes.collections;

import java.util.PriorityQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Ram on 21-02-2017.
 */
public class PriorityQueueExample {

    public static void main(String[] args)
    {
        PriorityQueue pq = new PriorityQueue();

        pq.add("Zaa");
        pq.add("Baa");
        pq.add("Caa");
        pq.add("Aaa");
        pq.add("Laa");

        System.out.println(pq.toString());
        System.out.println(pq.peek());
        System.out.println(pq.element());
        System.out.println(pq.remove());
        System.out.println(pq.poll());

        System.out.println(pq.toString());

        pq.offer("Kaa");
        pq.offer("Maa");

        System.out.println(pq.toString());
    }
}
