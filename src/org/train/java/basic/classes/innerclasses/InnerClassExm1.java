package org.train.java.basic.classes.innerclasses;

/**
 * Created by javat on 2/8/2017.
 */
public class InnerClassExm1 {

    static int j =10;
    int k = 10;
    class FirstInner
    {
        private int i = 10;
        FirstInner()
        {
            i = 20;
        }
        int getI()
        {
            return this.i;
        }
    }

    static class SecondInner
    {
        private int i = 10;
        SecondInner()
        {
            i = 20;
        }
        int getI()
        {
            return this.i;
        }
    }

    public int getInnerI()
    {
        int l = 10;
        FirstInner fi = new FirstInner();
        return fi.getI();
    }

    public void getMethodInnerClass()
    {

        class AccessINMethod
        {
           String getMe()
           {
               return "me";
           }
        }

        AccessINMethod am = new AccessINMethod();
        System.out.println(am.getMe());

    }

    public ImplementMe getImplmentMe()
    {
        ImplementMe implementMe = new ImplementMe() {
            @Override
            public String implementMe() {
                return "Here it is..";
            }
        };

        return implementMe;
    }


interface ImplementMe
{
    String implementMe();
}

}
