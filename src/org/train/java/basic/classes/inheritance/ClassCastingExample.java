package org.train.java.basic.classes.inheritance;

/**
 * Created by javat on 2/14/2017.
 */
public class ClassCastingExample {

    public static void main(String[] args)
    {
        ChildClass a1 = new ChildClass(); // InheritanceExample  --> AbstractInheritance

        AbstractInheritance ae =  a1;
        printPare(ae);
        InheritanceExample ie = (InheritanceExample) ae; // I child object can be referred by any parent

        InheritanceExample insta = new InheritanceExample();

    //    ChildClass c2 = (InheritanceExample) insta;  you can not type cast to child object reference from parent object

        // effective java edition 2
        System.out.println(new printMessage() {
            @Override
            public String message() {
                return "Test 123";
            }
        }.message());
        System.out.println(Thread.currentThread().getName());
    }

    public static void printPare(AbstractInheritance ae)
    {
        System.out.println(ae.toString());
        Runnable r1 = (Runnable) ae;
    }


    interface printMessage
    {
        String message();
    };
}
