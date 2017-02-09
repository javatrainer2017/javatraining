package org.train.java.basic.classes.string;

/**
 * Created by javat on 2/9/2017.
 */
public class StringBuilderExample {

    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();

        System.out.println(sb);

        sb.append("Add1").append(" add2").append(" add3");

        System.out.println(sb);

        sb.insert(0, "First String ");

        System.out.println(sb.toString());

    }
}
