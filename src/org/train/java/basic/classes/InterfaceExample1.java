package org.train.java.basic.classes;

/**
 * Created by javat on 2/4/2017.
 */
public interface InterfaceExample1 {

    public int j = 10;
    public void implementThis2();
    default int getJ(){
        return 30;
    }
}
