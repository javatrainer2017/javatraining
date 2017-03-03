package org.train.java.basic.classes.utilclasses;

import java.util.*;

//Gang of four Observable design pattern

class Watcher implements Observer {
    public void update(Observable obj, Object arg) {
        System.out.println("update() called, count is " +
                ((Integer) arg).intValue());
    }
}

class Watchme extends Observable {
    void counter(int period) {
        for (; period >= 0; period--) {
            setChanged();
            notifyObservers(new Integer(period));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted");
            }
        }
    }
}

class ObserverDemo {
    public static void main(String args[]) {
        Watchme observed = new Watchme();
        Watcher observing = new Watcher();
        Watcher observing1 = new Watcher();
        Watcher observing2 = new Watcher();

        observed.addObserver(observing);
        observed.addObserver(observing1);
        observed.addObserver(observing2);
        observed.counter(5);
    }
}