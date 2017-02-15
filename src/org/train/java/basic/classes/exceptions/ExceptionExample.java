package org.train.java.basic.classes.exceptions;

import java.io.File;

/**
 * Created by javat on 2/10/2017.
 */
public class ExceptionExample {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3};

//        System.out.println("Exception thrown" + intArray[4]);

//        int j = 10/0;

        Object s1 = "kk";
        Object i1 = new Integer(10);
        if (s1 != null) {
//            System.out.println(((String)s1).substring(10));
        }

//        System.out.println( "Is string class ? " + Integer.parseInt((String)s1));

//        System.out.println( "Is string class ? " + s1 instanceof String);


        try {
            Class clazz  = Class.forName("java.lang.Uuu");
        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
            System.out.println("Clss not found " + e.getMessage());
        }



        File file = new File("C:/kk.txt");



    }
}
