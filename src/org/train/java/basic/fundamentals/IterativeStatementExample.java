package org.train.java.basic.fundamentals;

import java.util.Scanner;

/**
 * Created by Ram on 01-02-2017.
 */
public class IterativeStatementExample {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        String firstReadString = scanner.next();
        scanner.next();

        System.out.println("" + firstReadString);
        int readInt = scanner.nextInt();

        System.out.println("the value is " + readInt);

//        int i=0;
//        boolean isItOn= true;
//        while(isItOn)
//        {
//            if( i%5 == 0)
//            {
//                i++;
//                continue;
//            }
//            if(i == 101)
//            {
//                isItOn = false;
//            }
//            System.out.println("My i value is " + i);
//            i++;
//        }

//        int j = 5;
//        do {
//            System.out.println(" My j valyes is " + j--);
//        }
//        while( j > 10);

//        for(int i=0; i < 10 ; i+=2)
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
//            i++;
//        }

//        int intArray[] = {1,24,5,6,32,23,76,53,42,23,29};
//
//        for(int j=0; j<intArray.length; j++)
//        {
//            System.out.println("My array element at " + j + " is " + intArray[j]);
//        }
//
//        for( int j : intArray)
//        {
//            System.out.println("My array element is " + j );
//        }
//
        int[][] twoDim = new int[4][2];
        int a=0;
        for(int i=0; i<4;i++)
        {
            for(int j=0; j<2; j++)
            {
                twoDim[i][j]=a++;
            }
        }
//        for(int i=0; i<4;i++)
//        {
//            for(int j=0; j<2; j++)
//            {
//                System.out.println(twoDim[i][j]);
//             }
//        }

        // 1,2
        // 2,3
        // 3,4
        // 1,2

        for( int[] i : twoDim)
        {
            for(int j : i)
            {
                System.out.println(j);
            }
        }

    }
}
