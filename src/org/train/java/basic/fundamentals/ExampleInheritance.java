package org.train.java.basic.fundamentals;

import org.train.java.basic.classes.inheritance.*;

public class ExampleInheritance
{

    public static void main(String[] args)
    {
        InheritanceExample ih = new InheritanceExample();
        ChildClass cc = new ChildClass();
        cc.setJ(10);
        System.out.println("******* J is " + cc.getJ());
        System.out.println("******* Parent I is " + cc.getParentI());
        cc.setParentI(20);
        System.out.println("******* Value set by chiild I is " + cc.getParentI());
//        cc.print();
        cc.printPublic();
        ih.printPublic();

//    AbstractInheritance ab = Factory.getMyImpl("GetMyClass");
        AbstractInheritance ab = new AbstractInheritanceImpl();
//        ab.implementThis();
        ab.printPublic();

        InterfaceExample ii = new InterfaceImpl();
        ii.implementThis();
        System.out.println(ii.getI());
        System.out.println(ii.getJ());

//        ii.implementThis2();
//        System.out.println(ii.getJ());

    }
}


//
// GetMyClass = com.java.MyImpl   -- (extends AbstractInheritance)
// GetMyClass = com.java.MySecondImpl   -- (extends AbstractInheritance)

// Abstract Class - This is class, This has some implemented methods, At least one method needs to abstract, CAN Have common behavior in child
// Interfaces - This is a interface, No single implementation, All variables are final, No common bebahvir in child