package org.train.java.basic.classes.inheritance;

/**
 * Created by javat on 2/4/2017.
 */
public  class AbstractInheritance {

    private int i = 10;

    protected void setI( int i)
    {
        this.i = i;
    }

    protected int getI()
    {
        return this.i;
    }

    public void print()
    {
        System.out.println("I am in package...");
    }

    public void printPublic()
    {
        System.out.println("Print parent public...");
    }

//    public abstract void implementThis();
}
