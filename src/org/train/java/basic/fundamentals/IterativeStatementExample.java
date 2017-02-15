package org.train.java.basic.fundamentals;

/**
 * Created by Ram on 01-02-2017.
 */
public class IterativeStatementExample {

    public static void main(String[] args)
    {
//        int i=0;
//        while(i < 10)
//        {
//            if( i == 5)
//            {
//                i++;
//                continue;
//            }
//            System.out.println("My i value is " + i);
//            i++;
//        }

//        int j = 20;
//        do {
//            System.out.println(" My j valyes is " + j--);
//        }
//        while( j > 10);

//        for(int i=0; i < 10 ; i++)
//        {
////            if ( i == 5 )
////                break;
//            if( i == 7)
//            {
//               continue;
//            }
//            System.out.println("My Value is " + i);
//        }
//        int i=0;
//        for(; i < 10 ;)
//        {
//            System.out.println("My Value is " + i);
//        }

        int intArray[] = {1,24,5,6,32,23,76,53,42,23,29};
//
//        for(int j=0; j<intArray.length; j++)
//        {
//            System.out.println("My array element at " + j + " is " + intArray[j]);
//        }

        for( int j : intArray)
        {
            System.out.println("My array element is " + j );
        }


    }
}
