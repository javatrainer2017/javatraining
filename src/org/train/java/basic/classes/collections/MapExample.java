package org.train.java.basic.classes.collections;

import java.util.*;

/**
 * Created by javat on 2/22/2017.
 */
public class MapExample {

    public static void main(String args[]) {
        Map map1 = new HashMap<>();

        map1.put("String1", "String1");
        map1.put(10, "String2");
        map1.put(null, "String2");
//        map1.put(null,"String3");

        map1.keySet();
        map1.values();

        System.out.println(map1.toString());

        Map map2 = new WeakHashMap();
        map2.put(new String("Maine"), "Augusta");

        Runnable runner = new Runnable() {
            public void run() {
                while (map2.containsKey("Maine")) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ignored) {
                    }
                    System.out.println("Thread waiting");
                    System.gc();
                }
            }
        };
        Thread t = new Thread(runner);
        t.start();
        System.out.println("Main waiting");
        try {
            t.join();
        } catch (InterruptedException ignored) {
        }

        // Create a hash map
        IdentityHashMap ihm = new IdentityHashMap();
//        Map ihm = new HashMap<>();

        // Put elements to the map
        ihm.put("String1", "String1");
        ihm.put("String2", "String2");
        ihm.put("String3","String3");

        // Get a set of the entries
        Set set = ihm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into Zara's account
        String str = (String)ihm.get(new String("String1"));
        ihm.put("String1", str + "  aaaa");
        System.out.println("String value is " + ihm.get("String1"));
    }
}

