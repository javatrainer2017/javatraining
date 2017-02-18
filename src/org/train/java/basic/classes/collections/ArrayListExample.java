package org.train.java.basic.classes.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by javat on 2/17/2017.
 */
public class ArrayListExample {

    public static void main(String[] args)
    {
        ArrayList al = new ArrayList(); //10 default capacity when it reaches threshold then it creates arraylist with capacity
                                         // cc*3/2
        ArrayList a2 = new ArrayList(20);

        al.add("Ramu");
        al.add(10);
        al.add("String");
        al.add("String1");
        al.add("String");
        al.add("String3");
        al.add("String");

        System.out.println(al.toString());

        al.add(5,"Check");
//        System.out.println(al.get(20));
        System.out.println(al.size());
        System.out.println(al.get(2));
        System.out.println(al.toString());

        al.remove(5);

        System.out.println(al.toString());

        System.out.println(al.contains("String"));

        System.out.println(al.indexOf("String"));
        System.out.println(al.lastIndexOf("String"));

        al.set(4,"Changed");
        System.out.println(al.toString());

        Iterator itr = al.iterator();

        while(itr.hasNext())
        {
            Object str = itr.next();
            System.out.println(str);
            if(str instanceof String && ((String)str).equals("Ramu"))
            {
                itr.remove();
            }
        }
        System.out.println(al.toString());

    }
}
