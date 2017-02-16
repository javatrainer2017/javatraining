package org.train.java.basic.classes.threads;

import org.train.java.basic.classes.inheritance.AbstractInheritance;

/**
 * Created by javat on 2/14/2017.
 */
public class ThreadExample {

    static int j = 10;

    static class Firstthread extends Thread {

        public Firstthread(String name) {
            super(name);
        }

        public void run() {
            int i = 0;
            while (i < 100) {
                System.out.println(getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Interuptted..");
                }
                i++;
            }
        }
    }

    static class SecondThread extends AbstractInheritance implements Runnable {

        private final String fileName;
        private Thread t1;
        private StringBuilder stringBuilder = new StringBuilder();
        private StringBuffer stringBuffer = new StringBuffer();

        public SecondThread(String fileName, Thread t1) {
            this.fileName = fileName;
            this.t1 = t1;

        }

        public void run() {
            int i = 0;
            while (i < 100) {
                System.out.println("Process file " + fileName);
                try {
//                    t1.join();
//                    t1.yield();
                    Thread.sleep(100);
                    stringBuilder.append("Add"+ Thread.currentThread().getName());
//                    t1.interrupt();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        }
    }
    //

    public static void main(String[] args)
    {
        Thread ft1 = new Firstthread("Thread1");
        Thread ft2 = new Firstthread("Thread2");
        /*Thread t3 = new Firstthread("Thread3");
        Thread t4 = new Firstthread("Thread4");
        Thread t5 = new Firstthread("Thread5");
        Thread t6 = new Firstthread("Thread6");*/

        Thread t1 = new Thread(new SecondThread("File 1",ft1));
//        Thread t2 = new Thread(new SecondThread("File 2",ft2));

        ft1.start();
//        ft2.start();
        t1.start();
//        t2.start();

        //        t3.start();
        System.out.println(Thread.currentThread().getName());
//        t4.start();
//        t5.start();
//        t6.start();
        System.out.println(Thread.currentThread().getName());
    }


}
