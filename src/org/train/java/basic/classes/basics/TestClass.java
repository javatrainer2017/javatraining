package org.train.java.basic.classes.basics;

/**
 * Created by Ram on 02-02-2017.
 */
public class TestClass {

    private int i = 10;
    private int j = 20;
    private int k = 30;

    class thisIsMyPrivate
    {
        //attribute
        //method
    }

    public TestClass() // todo why this working.. ? It will not if you have already defined construcotr.
    {
        withOutArugment();

    }

    TestClass(int i, int j)
    {
        withArgumentsMeThod(i, j);
    }

    public TestClass(int i, int j, boolean flag)
    {
        if(flag)
        {
            withOutArugment();
        }
        else
        {
            withArgumentsMeThod(i, j);
        }
    }

    public TestClass gveMeString(TestClass myTestClas)
    {
        TestClass cc = new TestClass(myTestClas.getI(), myTestClas.getJ());
      return  cc;
    }

    private void withOutArugment() {
        i = 30;
        j = 40;
        System.out.println("Some default statments...");
    }

    private void withArgumentsMeThod(int i, int j) {
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
//        System.out.println(tc.gveMeString("Hey where j "));

//        TestClass tc1 = new TestClass(100,200);
//       System.out.println("The value of i and j are " + tc1.i + "  " + tc1.j);

    }

    public void printMe()
    {

    }
}
