package org.train.java.basic.classes.collections;

import java.util.*;

/**
 * Created by Ram on 20-02-2017.
 */
public class TreeSetExample {

    public static void main(String[] args)
    {
        Set treeSet = new TreeSet();

        treeSet.add("String");
        treeSet.add("String1");
        treeSet.add("String2");

        treeSet.add("Str");

        System.out.println(treeSet.toString());

        Set treeSet1 = new TreeSet<TestClass>();
        treeSet1.add(new TestClass(10));
        treeSet1.add(new TestClass(8));
        treeSet1.add(new TestClass(12));

        System.out.println(treeSet1.toString());

        NavigableSet treeSet2 = new TreeSet<TestClassComaparator>(new Comparator<TestClassComaparator>() {
            @Override
            public int compare(TestClassComaparator o1, TestClassComaparator o2) {
                if(o1.getTestValue() == o2.getTestValue())
                return 0;
                else if(o1.getTestValue() > o2.getTestValue())
                    return 1;
                else return -1;
            }
        });

        treeSet2.add(new TestClassComaparator(10));
        treeSet2.add(new TestClassComaparator(2));
        treeSet2.add(new TestClassComaparator(12));
        treeSet2.add(new TestClassComaparator(1));
        treeSet2.add(new TestClassComaparator(5));
        treeSet2.add(new TestClassComaparator(9));
        treeSet2.add(new TestClassComaparator(7));
        treeSet2.add(new TestClassComaparator(13));

        System.out.println(treeSet2.toString());
        System.out.println(treeSet2.first());
        System.out.println(treeSet2.last());
        System.out.println(treeSet2.tailSet(new TestClassComaparator(6)));
        System.out.println(treeSet2.headSet(new TestClassComaparator(6)));


    }

    static class TestClass implements Comparable<TestClass>
    {
        private int testValue;

        public int getTestValue()
        {
            return this.testValue;
        }

        public TestClass(int testValue)
        {
            this.testValue = testValue;
        }

        public String toString()
        {
            return "" + getTestValue();
        }


        @Override
        public int compareTo(TestClass o) {
            if(this.getTestValue() == o.getTestValue())
                return 0;
            else if(this.getTestValue() > o.getTestValue())
                return 1;
            else return -1;
        }
    }

    static class TestClassComaparator
    {
        private int testValue;

        public int getTestValue()
        {
            return this.testValue;
        }

        public TestClassComaparator(int testValue)
        {
            this.testValue = testValue;
        }

        public String toString()
        {
            return "" + getTestValue();
        }

    }

}
