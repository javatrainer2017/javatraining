package org.train.java.basic.classes.threads;

/**
 * Created by javat on 2/15/2017.
 */
public class VolatileExample {


    private static volatile int intValue = 0;

    public static void main(String[] args) {
        new IncreamentInt().start();
        new GotInt().start();
    }

    static class GotInt extends Thread {
        @Override
        public void run() {
            int value = intValue;
            while ( value < 5){
                if( value!= intValue){
                    System.out.println("intValue got changed with :" + intValue);
                    value= intValue;
                }
            }
        }
    }

    static class IncreamentInt extends Thread{
        @Override
        public void run() {

            int value = intValue;
            while (intValue <5){
                System.out.println( "Increasing intValue to " + value+1);
                intValue = ++value;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
}
