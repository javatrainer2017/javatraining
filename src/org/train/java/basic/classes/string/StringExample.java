package org.train.java.basic.classes.string;

/**
 * Created by javat on 2/9/2017.
 */
public class StringExample {

    public static void main(String[] args)
    {
        String str = "This is my first string";
        String str1 = "This is my first string";

        String str2 = new String("This is my first string");

        String string = new String(new char[]{'a','b','c'});
        String touppercase = "ABC";

//        System.out.println(str.hashCode());
//        System.out.println(str1.hashCode());

        System.out.println(str == str1);
        System.out.println(str == str2);
        System.out.println( string.toUpperCase() );

        System.out.println(str.hashCode());
        System.out.println(str.substring(10).hashCode());

        String substr = str.substring(10);

        System.out.println(substr);


        String[] arr = {"first", "Second", "Third"};
        String[] arr1 = new String[3];
        arr1[0] = new String("first");
        arr1[1] = new String("Second");
        arr1[2] = new String("Third");


        for( String s1 : arr)
        System.out.println(s1);
        for( String s1 : arr1)
        System.out.println(s1);

        String substrintern = str.substring(11).intern(); // if not exist created
        String substrfrompool = str.substring(11).intern(); // resuse if exist in pool
        String substrnointern = str.substring(11);
        String stringpool = "first string"; // reuse if exists in pool


        System.out.println(substrintern == stringpool);
        System.out.println(substrfrompool == stringpool);
        System.out.println(substrnointern == stringpool);

        // == is equal operator which will ensures equality of value in primitive data type and address reference in object references
        // "Aaa" , "aat"



    }



}

