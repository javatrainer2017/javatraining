package org.train.java.basic.classes;

/**
 * Created by Ram on 02-02-2017.
 */
public class TestClass {

    private int i = 10;
    private int j = 20;

    public TestClass() // todo why this working.. ?
    {
        i = 30;
        j = 40;
        System.out.println("Some default statments...");
    }

   public TestClass(int i, int j)
    {
        this.i = i;
        this.j = j;
        this.printMe();
        System.out.println("HEre is some logic needs to executed...");
    }

    // Open-closed principles   -- Open for extension and closed for modification

    public void method1(int i)
    {
        this.i = i;
        this.j = 20;
        System.out.println("This is a method..");
    }

    public void method1(int i, int j)
    {
        method1(i);
        this.j = j;
        System.out.println("This is a overloaded method..");
    }

    public int getI()
    {
        return this.i;
    }

    public int getJ()
    {
        return this.j;
    }

    public static void main(String[] args)
    {
        TestClass tc = new TestClass();
       System.out.println("The value of i and j are " + tc.getI() + "  " + tc.getJ());
        tc.method1(100);
        System.out.println("The value of i " + tc.getI() );
        tc.method1(100, 200);
        System.out.println("The value of i " + tc.getI() + "  " + tc.getJ());

//        TestClass tc1 = new TestClass(100,200);
//       System.out.println("The value of i and j are " + tc1.i + "  " + tc1.j);

    }

    public void printMe()
    {

    }
}
