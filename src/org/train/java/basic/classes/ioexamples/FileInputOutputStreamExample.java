package org.train.java.basic.classes.ioexamples;

import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

/**
 * Created by javat on 2/24/2017.
 */
public class FileInputOutputStreamExample {

    public static void main(String[] args)
    {
        File file = new File("D:\\Work\\IOExamples\\license.txt");
        if(file.exists())
        {
            try {
                int size;
                FileInputStream fis = new FileInputStream(file);
                System.out.println(size = fis.available());
                int n=size/30;
                for(int i=0;i<n;i++)
                {
                    System.out.print((char)fis.read());
                }
                System.out.println("*********************");

                byte[] bytes = new byte[n];
                fis.read(bytes);

                System.out.println(new String(bytes));
//                bytes = new byte[n];
                System.out.println("*********************");

                byte[] bytes1 = new byte[50];
                bytes1[0] = 'c';
                bytes1[1] = 'c';
                bytes1[2] = 'c';
                bytes1[3] = 'c';
                bytes1[4] = ' ';

                fis.read(bytes1, 5, 45);
                System.out.println(new String(bytes1));

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File fileout = new File("D:\\Work\\IOExamples\\newnote.txt");
        if(fileout.exists()) fileout.delete();
        String aa =  " THis is file IO example and we are writing some data into this file...";
        try {
            FileOutputStream fos = new FileOutputStream(fileout);
            for(int i=0; i< 10;i++)
            {
                fos.write((int)aa.toCharArray()[i]);
            }
            fos.write(aa.substring(10).getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
