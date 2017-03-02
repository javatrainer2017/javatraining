package org.train.java.basic.classes.ioexamples;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by javat on 3/2/2017.
 */
public class SerializationExample {

    public static void main(String[] args)
    {

        SimpleObject so = new SimpleObject();

        so.setI(10);
        so.setJ(20);
        so.setK(30);
        so.addtoList(Integer.valueOf(10));

        SubSimple ss = new SubSimple();
        ss.setL(199);

        try {
            ObjectOutputStream oom = new ObjectOutputStream(new FileOutputStream("D:\\Work\\IOExamples\\SimpleObject.ser"));
            oom.writeObject(so);
            ObjectInputStream oim = new ObjectInputStream(new FileInputStream("D:\\Work\\IOExamples\\SimpleObject.ser"));
            SimpleObject so1 = (SimpleObject) oim.readObject();
            so.setJ(100);
            System.out.println(so1.getI());
            System.out.println(so1.getJ());
            System.out.println(so.getJ());
            System.out.println(so1.getK());
            System.out.println(so1.getFromList(0));
            System.out.println( so1.getSs() != null ? so1.getSs().getL() : null);

            System.out.println(so.toString());
            System.out.println(so1.toString());


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    // IS A -- Class B Inherited from Class A then we call 'B' IS A 'A'
    // HAS A 00 Class B is in Class A then we call 'A' has 'B'

    static class SimpleObject implements Serializable
    {
        int i;
        int j;
        int k;
        ArrayList al = new ArrayList();
//        transient SubSimple ss = new SubSimple();
        SubSimple ss = new SubSimple();

        public void setSubSimple(SubSimple ss1)
        {
            ss = ss1;
        }

        public SubSimple getSs()
        {
            return ss;
        }

        public void addtoList(Integer i_)
        {
            al.add(i_);
        }

        public Integer getFromList(int index)
        {
            return (Integer)al.get(index);
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int getJ() {
            return j;
        }

        public void setJ(int j) {
            this.j = j;
        }

        public int getK() {
            return k;
        }

        public void setK(int k) {
            this.k = k;
        }
    }

    static class SubSimple implements Serializable
    {
        int l;

        public int getL() {
            return l;
        }

        public void setL(int l) {
            this.l = l;
        }
    }
}
