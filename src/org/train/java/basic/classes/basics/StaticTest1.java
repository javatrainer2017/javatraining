package org.train.java.basic.classes.basics;

/**
 * Created by javat on 2/3/2017.
 */
public class StaticTest1 {
    public static void main(String[] args)
    {
        StaticTest st = new StaticTest();
        System.out.println(st.getI());
        System.out.println(StaticTest.j);
        System.out.println(StaticTest.printMyStatement());
    }
}


// First initialization of static variables
// Second execution of static block
// Third the static methods