package org.train.java.basic.classes.ioexamples;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by javat on 3/1/2017.
 */
public class CharArrayIOExample {
    public static void main(String[] args)
    {

        try {
            FileReader fr1 = new FileReader("D:\\Work\\IOExamples\\unicodecharfile.txt");

            int c;
            char[] charArray = new char[30];
            fr1.read(charArray);
            CharArrayReader fr = new CharArrayReader(charArray);
            System.out.println(charArray);
            // Read and display the file.
            fr.reset();
            while ((c = fr1.read()) != -1) System.out.print( (char)c);
            System.out.println();
            while ((c = fr.read()) != -1) System.out.print( (char)c);
            System.out.println();
            FileReader newFr= new FileReader("D:\\Work\\IOExamples\\unicodecharfile.txt");
            BufferedReader bufferedReader = new BufferedReader(newFr);
            System.out.println(bufferedReader.readLine());

            fr1.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
        System.out.println();

    }

}
