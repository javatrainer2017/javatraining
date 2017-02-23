package org.train.java.basic.classes.collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by javat on 2/21/2017.
 */
public class BlockingQueueExample {

    public static void main(String[] args)
    {
        BlockingQueue bq = new ArrayBlockingQueue(3);

        bq.offer("Zaa");
        bq.offer("Aaa");
        bq.offer("Baa");
        System.out.println(bq.offer("Daa"));
        System.out.println(bq.add("Daa"));
        System.out.println(bq.toString());
    }
}
