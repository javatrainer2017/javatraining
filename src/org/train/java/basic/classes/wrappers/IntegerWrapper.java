package org.train.java.basic.classes.wrappers;

import org.train.java.basic.classes.innerclasses.InnerClassExm1;

/**
 * Created by javat on 2/9/2017.
 */
public class IntegerWrapper {

    public static void main(String[] arg)
    {
        int i = 10;
        double f = 10.2f;
        Integer i1 = Integer.valueOf(i);// prior to 1.5
        Integer i2 = i;

        int i3 = i2;


        System.out.println ( i + "  " + i1 + "   " + i2);

        Double d = new Double("10.2");
        Double d1 = new Double(10.2);
        Double d2 = f;
        System.out.println( d + "   " + d1);


        Boolean bool = Boolean.FALSE;
        boolean bool1 = false;

        System.out.println(sendBoolean(bool1));

        System.out.println(sendBoolean(bool));
    }

    public static boolean sendBoolean(boolean b1)
    {
        return b1;
    }
}
