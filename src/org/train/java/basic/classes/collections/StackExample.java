package org.train.java.basic.classes.collections;

import java.util.Stack;

/**
 * Created by javat on 2/17/2017.
 */
public class StackExample {

    public static void main(String[] args)
    {
        Stack s1 = new Stack();

        s1.add("A");
        s1.add("B");
        s1.add("c");

        System.out.println(s1.peek());
        System.out.println(s1.empty() +"   "+s1.toString());
        System.out.println(s1.pop());
        System.out.println(s1.empty() +"   "+s1.toString());
        System.out.println(s1.push("E"));
        System.out.println(s1.push("D"));
        System.out.println(s1.search("A"));
        System.out.println(s1.search("Z"));
        System.out.println(s1.empty() +"   "+s1.toString());


    }

}
