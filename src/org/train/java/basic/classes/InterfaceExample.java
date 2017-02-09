package org.train.java.basic.classes;

/**
 * Created by javat on 2/4/2017.
 */
public interface InterfaceExample {

    public int j =10;
    public int i = 10;
    public void implementThis();
    public int getI();
//    public int getJ();

    default int getJ()
    {
        return j;
    }

}
