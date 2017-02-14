package org.train.java.basic.threads;

import org.train.java.basic.classes.AbstractInheritance;

/**
 * Created by javat on 2/14/2017.
 */
public class ThreadExample {

    static class Firstthread extends Thread{

        public Firstthread(String name)
        {
            super(name);
        }

        public void run()
        {
            int i=0;
            while (i < 10)
            {
                System.out.println(getName());
                i++;
            }
        }
    }

    static class SecondThread extends AbstractInheritance implements Runnable
    {

        private final String fileName;

        public SecondThread(String fileName)
        {
            this.fileName = fileName;
        }
        public void run()
        {
            int i=0;
            while (i < 10)
            {
                System.out.println("Process file " + fileName);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        }
    }

    public static void main(String[] args)
    {
       /* Thread t1 = new Firstthread("Thread1");
        Thread t2 = new Firstthread("Thread2");
        Thread t3 = new Firstthread("Thread3");
        Thread t4 = new Firstthread("Thread4");
        Thread t5 = new Firstthread("Thread5");
        Thread t6 = new Firstthread("Thread6");  */

        Thread t1 = new Thread(new SecondThread("File 1"));
        Thread t2 = new Thread(new SecondThread("File 2"));


        t1.start();
        t2.start();

        //        t3.start();
        System.out.println(Thread.currentThread().getName());
//        t4.start();
//        t5.start();
//        t6.start();
        System.out.println(Thread.currentThread().getName());
    }


}
