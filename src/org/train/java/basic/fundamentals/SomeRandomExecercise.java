package org.train.java.basic.fundamentals;

/**
 * Created by Ram on 01-02-2017.
 */
public class SomeRandomExecercise {

    public static void main(String[] args)
    {
//      System.out.println("0 fib series is " + fibonacciSeries(0));
//      System.out.println("1 fib series is " + fibonacciSeries(1));
//      System.out.println("4 fib series is " + fibonacciSeries(4));
//      System.out.println("6 fib series is " + fibonacciSeries(6));

        System.out.println(sum(3));
    }

    public static long fibonacciSeries(int input_)
    {
        // use case 4 = 4* 3 * 2 * 1;
        // 1= 1;
        // 0 = 0 or invalid
        // 5 = 6 * 5 * 4 * 3 * 2 * 1;
        long result =0;
        if( input_ == 0)
        {
            result = 0;
        }
        else if( input_ == 1)
        {
           result = 1;
        }
        else
        {
            int count = 1;
            result = 1;
            while(count <= input_)
            {
                result = result * count;
                count ++;
            }
        }
        return result;
    }

    public static long sum(int i)
    {
       if( i == 0)
       {
           return 0;
       }
        else
       {
           int j = i - 1;
           return i + sum(j);
       }
    }
}
