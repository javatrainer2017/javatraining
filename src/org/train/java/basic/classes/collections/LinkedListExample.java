package org.train.java.basic.classes.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

/**
 * Created by javat on 2/17/2017.
 */
public class LinkedListExample {

    // array list is preferred when fetching is your criteria
    //Linked list insertion and removal is criteria

    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ArrayList al = new ArrayList();


        ll.addFirst("JavaT");
        ll.add("Next");
        ll.add("Second Next");

        ll.get(2);


        System.out.println(" Is Random Acess" + (ll instanceof RandomAccess));
        System.out.println(" Is Random Acess" + (al instanceof RandomAccess));


    }
}
