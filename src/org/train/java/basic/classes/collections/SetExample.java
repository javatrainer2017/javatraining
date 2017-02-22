package org.train.java.basic.classes.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Ram on 20-02-2017.
 */
public class SetExample {
    public static void main(String[] args)
    {
        Set setEx = new HashSet<>();

        setEx.add("String1");
        setEx.add(null);
        setEx.add("String5");
        setEx.add(10);

        System.out.println(setEx.toString());

        System.out.println(setEx.add("String3"));
        setEx.add(null);

        System.out.println(setEx.toString());

        /// String aimsa aiksiamsinfdi i fiingf iisjsds iiisdj
        // How many distinct characters are string..
        //  www.hackerrank.com



        Set setEx2 = new LinkedHashSet<>();

        setEx2.add("String1");
        setEx2.add(null);
        setEx2.add("String2");
        setEx2.add(10);

        System.out.println(setEx2.toString());

        System.out.println(setEx2.add("String2"));
        System.out.println(setEx2.add(null));
        System.out.println(setEx2.add(20));
        setEx2.add("String3");

        System.out.println(setEx2.toString());

    }

}
