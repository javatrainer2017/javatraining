package org.train.java.basic.classes;

/**
 * Created by javat on 2/4/2017.
 */
public class InheritanceExample {

    private int i = 10;

    protected void setI( int i)
    {
        this.i = i;
    }

    protected int getI()
    {
        return this.i;
    }

    void print()
    {
        System.out.println("I am in package...");
    }

    public void printPublic()
    {
        System.out.println("Print parent public...");
    }
}




