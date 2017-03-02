package org.train.java.basic.classes.ioexamples;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Created by javat on 2/25/2017.
 */
public class ByteArrayInOutStreamExamples {

    public static void main(String[] args)
    {
        ByteArrayInputStream bis = null;
        ByteArrayInputStream bisIndexed = null;
        try {
            String s1 = "This is a input string..";

             bis = new ByteArrayInputStream(s1.getBytes());
             bisIndexed = new ByteArrayInputStream(s1.getBytes(), 5, 5);

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
            System.out.println(bis.markSupported());

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
        finally {
            try {
                bis.close();
                bisIndexed.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
