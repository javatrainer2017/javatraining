package org.train.java.basic.classes.inheritance;

import org.train.java.basic.classes.inheritance.InheritanceExample;

public class ChildClass extends InheritanceExample implements Runnable
{
    private int j;

    public void setJ(int j)
    {
        this.j = j;
    }

    public int getJ()
    {
        return this.j;
    }

    public int getParentI()
    {
        return getI();
    }

    public void setParentI(int i)
    {
        setI(i);
    }

//    public void print(){ System.out.println(" I am in child");}

    public void printPublic()
    {
        super.printPublic();
        System.out.println("I am in child...");
    }

    @Override
    public void run() {

    }
}