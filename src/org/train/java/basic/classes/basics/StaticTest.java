package org.train.java.basic.classes.basics;

/**
 * Created by javat on 2/3/2017.
 */
public class StaticTest {

    final int i = 10;
    static int j = 10;

    public int getI()
    {
        int k = 10;
        return this.i;
    }



    public int getJ()
    {
        return  j;
    }

    static
    {
        System.out.println("the value is " + j);
        System.out.println("I am the first....");
    }

    static String printMyStatement()
    {
        return "Here it is... static";
    }

}
