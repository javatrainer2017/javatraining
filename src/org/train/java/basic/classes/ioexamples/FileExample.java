package org.train.java.basic.classes.ioexamples;

import java.io.File;
import java.io.IOException;

/**
 * Created by javat on 2/24/2017.
 */
public class FileExample {

    public static void main(String args[])
    {
        File file = new File("D:\\Work\\IOExamples\\firstFile.txt");
        File filea = new File(file, "file2.txt");
        File fileexe = new File("D:\\Utilities\\hfsexplorer-0.23.1-bin\\bin\\hfsexplorer.exe");
        //FIle(String, String) -- Parent path then the file name, example ("C:/ parent", "fileName.txt")
        //File(String) ex File(D:\Work\IOExamples\firstFile.txt")
        //File(Stirng, File)  here File is a directory or file. If it is directory it takes as directory if it is a file then its take file directory
         System.out.println(file.exists());
        System.out.println(fileexe.canExecute()); // if it return true.. This file is a executable file
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.canExecute()); // if it return true.. This file is a executable file

//        file.delete();
        System.out.println(file.exists());

        File file1 = new File("D:\\Work\\IOExamples\\SubFolder");
        File file2 = new File("D:\\Work\\IOExamples\\SubFolder1\\SubFolder2\\subfolder3");
        System.out.println(file1.isDirectory());

        System.out.println("Directory created " + file1.mkdir());
//        System.out.println(file2.mkdir());
        System.out.println(file2.mkdirs());


        String[] fileNames0 = file.list();
        System.out.println("List call on file " + fileNames0);
        String[] fileNames = new File("D:\\Work").list();
        File[] files = new File("D:\\Work").listFiles();

        for(String str : fileNames)
        {
            System.out.println("File or Directory name is" + str);
        }

        System.out.println("File Names are done....");

        for(File afile : files)
        {
            System.out.println("File or Directory name is " + afile.isDirectory() + " name is " + afile.getName() + " the path is " + afile.getAbsolutePath());
        }

        System.out.println();

//        file1.mkdirs();

    }
}
