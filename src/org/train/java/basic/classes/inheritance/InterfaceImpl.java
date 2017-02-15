package org.train.java.basic.classes.inheritance;

import org.train.java.basic.classes.inheritance.InterfaceExample;
import org.train.java.basic.classes.inheritance.InterfaceExample1;

/**
 * Created by javat on 2/4/2017.
 */
public class InterfaceImpl implements InterfaceExample,InterfaceExample1 {
    @Override
    public void implementThis() {
        System.out.println("I am implementing child 1");
    }

    @Override
    public int getI() {
        return i;
    }


    @Override
    public void implementThis2() {
        System.out.println("I am implementing child 1 for 2nd interface");

    }

    public int getJ()
    {
//        return  InterfaceExample.super.getJ();
//        return  InterfaceExample1.super.getJ();
        return  20;
    }

}
