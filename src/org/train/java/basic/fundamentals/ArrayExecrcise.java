package org.train.java.basic.fundamentals;

/**
 * Created by Ram on 27-01-2017.
 */
public class ArrayExecrcise {

    public  static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 6, 2, 1, 4, 2, 5};
        int[][] intTwoArrays = {{1,2},
                {2,3},
                {3, 4},
                {6, 2},
                {1, 4},
                {2, 5}}
                ;

        int[] intArray1 = new int[10];

        for(int i=0; i<intTwoArrays.length;  i++)
        {
            for(int j=0; j < 2; j++)
            {
                System.out.println(intTwoArrays[i][j]);
            }
        }

      /*for(int i=0; i<intArray1.length-2;  i++)
        {
            intArray1[i] = i *10;
        }

        for(int i=0; i<intArray1.length + 1;  i++)
        {
            System.out.println(intArray1[i]);
        }*/

    }
}
