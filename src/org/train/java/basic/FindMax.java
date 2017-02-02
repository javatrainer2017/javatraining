package org.train.java.basic;

/**
 * Created by Ram on 28-01-2017.
 */
public class FindMax {

    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int c = 15;
        int max = 0;
        boolean evaluated = false;
//        if (a > b) {
//            max = a;
//            if (c > max) {
//                max = c;
//                evaluated = true;
//            }
//        }
//        if (!evaluated && b > a) {
//            max = b;
//            if (c > max) {
//                max = c;
//            }
//        }

        if(a > b)
        {
            if( a > c)
            {
                max = a;
            }
            else
            {
                max = c;
                if(true)
                System.out.println("print me...c");
                System.out.println("print me...d");


            }
        }
        else
        {
            if( b > c)
            {
                max = b;
                if(true)
                {
                    System.out.println("print me...");
                }
            }
            else if( b > a)
            {
                max = c;
                if(false)
                {     System.out.println("print me...c");
                System.out.println("print me...d");}
            }
            else
            {
                System.out.println("Always for else...");
            }
        }
        System.out.println(" The values evaluated are " + a + " " + b + " " + c + "  max is " + max);

    }

}
