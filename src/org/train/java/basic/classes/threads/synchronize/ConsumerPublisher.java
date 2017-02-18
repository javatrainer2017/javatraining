package org.train.java.basic.classes.threads.synchronize;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by javat on 2/15/2017.
 */
public class ConsumerPublisher {

    static class Message {
        String message = "";

        public void setMessage(String msg) {
            this.message = msg;
        }

        public String getMessage() {
            return this.message;
        }
    }

    static class Consumer implements Runnable {
        Message msg;

        public Consumer(Message msg) {
            this.msg = msg;
        }

        public void run() {
                try {
                    while(true) {
                        synchronized (msg) {
                            System.out.println(Thread.currentThread().getName() + "got message " + msg.getMessage());
                            System.out.println("Now Wating for get notified..." + Thread.currentThread().getName());
                            msg.wait();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }

    static class Producer implements Runnable {
        Message msg;

        public Producer(Message msg) {
            this.msg = msg;
        }

        public void run() {
            try {
                int i = 1;
                while(i<5) {
                    Thread.sleep(1000);
                    System.out.println("Notify consumers..");
                    synchronized (msg) {
                        msg.setMessage("Here the new message.." + i);
                        msg.notify();
//                        msg.notifyAll();
                    }
                    i++;
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        Message msg = new Message();
        Thread firstConsumer = new Thread(new Consumer(msg), "Consumer 1");
        Thread secondConsumer = new Thread(new Consumer(msg), "Consumer 2");
        Thread thirdConsumer = new Thread(new Consumer(msg), "Consumer 3");
        Thread msgProducer = new Thread(new Producer(msg), "Producer");

        firstConsumer.start();
        secondConsumer.start();
        thirdConsumer.start();
        msgProducer.start();
    }

}
