package org.train.java.basic.classes.innerclasses;

/**
 * Created by javat on 2/8/2017.
 */
public class InnerClassMain {

    public static void main(String[] args)
    {
        InnerClassExm1.SecondInner si = new InnerClassExm1.SecondInner();
        InnerClassExm1 ii = new InnerClassExm1();
        InnerClassExm1.FirstInner fi = ii.new FirstInner();

        System.out.println(si.getI());
        System.out.println(fi.getI());

        System.out.println(ii.getImplmentMe().implementMe());
    }
}
