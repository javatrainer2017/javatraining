package org.train.java.basic.classes.utilclasses;

import java.util.Random;

/**
 * Created by javat on 3/3/2017.
 */
public class RandomExample {

    public static void main(String[] args)
    {

        Random random = new Random();
        for(int i =0;i<10;i++)
        System.out.println(random.nextInt(20));
    }
}
