package org.train.java.basic.classes.collections;

import java.util.Comparator;

/**
 * Created by javat on 2/22/2017.
 */
public class ComparableExamp {

    public static void main(String[] args)
    {
        String s1 = "AABB";
        String s2= "AAABB";
        System.out.println(new StringComparator().compare(s1,s2));
        System.out.println(s1.compareTo(s2));
    }

    static class StringComparator implements Comparator<String>
    {
       @Override
        public int compare(String o1, String o2) {
            if (o1 != null &&
                    !o1.isEmpty() && o2 != null && !o2.isEmpty())
            {
                if(o1.length() > o2.length())
                    return 1;
                else if( o1.length() < o2.length())
                    return -1;
                else
                    return 0;
            }
           return 0;
        }
    }
}
