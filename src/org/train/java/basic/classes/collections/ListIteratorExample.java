package org.train.java.basic.classes.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

/**
 * Created by javat on 2/17/2017.
 */
public class ListIteratorExample {

    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();

        for(int i=0; i< 10; i++)
        {
            al.add("item" + i);
        }

        ListIterator lt = al.listIterator();
        //hasNext()
        //next()
        //nextIndex()

        //hasPrevious()
        //previous()
        //previousIndex()

        //add
        //remove
        //set

        while (lt.hasNext())
        {
           String str = (String) lt.next();
            System.out.println(str + "  and next element at " + lt.nextIndex());
            if(str.equals("item9"))
             lt.remove();
            if(str.equals("item7"))
                lt.set("itema7");
            if(str.equals("item8"))
                lt.add("item10");
        }
        System.out.println(al.toString());
        System.out.println("Previous....");
        ListIterator lt1 = al.listIterator(al.size());

        while (lt1.hasPrevious())
        {
            System.out.println(lt1.previous() + " and previous element at " + lt1.previousIndex() );


        }

        //  ( 4 + 1 + 2 + 3 / 2 * 4) * (10/2)
        //  Finding Prime number
        //  Add even number at bening of collection and odd numbers at end of the collection -- print as they added
    }
}
