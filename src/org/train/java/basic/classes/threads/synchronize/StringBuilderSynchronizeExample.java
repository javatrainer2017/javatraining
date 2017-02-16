package org.train.java.basic.classes.threads.synchronize;

/**
 * Created by javat on 2/15/2017.
 */
public class StringBuilderSynchronizeExample {

    public static void main(String[] args)
    {
        ExpressionBean eb = new ExpressionBean();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
             int i =1;
                while (i<100)
                {
//                   eb.addStringBuildString(" " + i++);
                   eb.addStringBuf(" " + i++);
                }
            }
        }, "Thread 1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
             int i =100;
                while (i>0)
                {
//                    eb.addStringBuildString(" " + i--);
                    eb.addStringBuf(" " + i--);
                }
            }
        }, "Thread 2");
      t1.start();
      t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(eb.getStringBuilder());
        System.out.println(eb.getStringBufString());
    }

}
