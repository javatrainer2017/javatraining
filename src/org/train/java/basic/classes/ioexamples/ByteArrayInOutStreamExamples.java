package org.train.java.basic.classes.ioexamples;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.ByteArrayInputStream;

/**
 * Created by javat on 2/25/2017.
 */
public class ByteArrayInOutStreamExamples {

    public static void main(String[] args)
    {
        try {
            String s1 = "This is a input string..";

            ByteArrayInputStream bis = new ByteArrayInputStream(s1.getBytes());
            ByteArrayInputStream bisIndexed = new ByteArrayInputStream(s1.getBytes(), 5, 5);

            int c = 0;
            while ((c = bis.read()) != -1)
            {
                System.out.print((char)c);
            }
            System.out.println();
            int c1 = 0;
            while ((c1 = bisIndexed.read()) != -1)
            {
                System.out.print((char)c1);
            }
            System.out.println();
            bis.reset();
            int c2 = 0;
            while ((c2 = bis.read()) != -1)
            {
                System.out.print(Character.toUpperCase((char)c2));
            }
        }
        catch (Exception ie)
        {

        }
    }
}
