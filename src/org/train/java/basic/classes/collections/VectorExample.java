package org.train.java.basic.classes.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by javat on 2/17/2017.
 */
public class VectorExample {

    public static void main(String[] args)
    {
        Vector v1 = new Vector(); // with default capacity 10
        Vector v2 = new Vector(20); // With custom capacity 20 .. both increaments capacity with 2 times
        Vector v3 = new Vector(30, 5); // with custom capacity 30 with increament 5

        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");
        v1.add("E");
        v1.add("F");
        v1.add("G");
        v2.addElement("B");
        v3.add(0,"C");

        Vector v4 = new Vector(v3); // As collection


        System.out.println(v1.capacity() + "   " + v1.size());
        System.out.println(v2.capacity() + "   " + v2.size());
        System.out.println(v3.capacity() + "   " + v3.size());
        System.out.println(v4.capacity() + "   " + v4.size());

        v2.addElement("D");
        v2.removeElement("B");

        v3.removeAllElements();

        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
        System.out.println(v4.toString());

        Iterator itr = v1.iterator();
        while(itr.hasNext())
        {
            Object str = itr.next();
            System.out.println(str);
            if(str instanceof String && ((String)str).equals("A"))
            {
                itr.remove();
            }
        }
        System.out.println(v1.toString());

        Enumeration en1 = v1.elements();

        while(en1.hasMoreElements())
        {
            String str = (String)en1.nextElement();
            System.out.println(str);
        }

    }
}
