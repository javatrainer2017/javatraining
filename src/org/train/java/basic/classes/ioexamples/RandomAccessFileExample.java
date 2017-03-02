package org.train.java.basic.classes.ioexamples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by javat on 3/2/2017.
 */
public class RandomAccessFileExample {

    public static void main(String[] args)
    {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("D:\\Work\\IOExamples\\random.rxt", "rw");
            randomAccessFile.writeDouble(190.88f);
            randomAccessFile.writeInt(109);
            randomAccessFile.seek(0);
            System.out.println(randomAccessFile.readDouble());
            System.out.println(randomAccessFile.getFilePointer());
            System.out.println(randomAccessFile.readInt());
            randomAccessFile.seek(8);
            randomAccessFile.writeDouble(190.88f);
            randomAccessFile.seek(8);
            System.out.println(randomAccessFile.readDouble());
            System.out.println(randomAccessFile.readInt());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
