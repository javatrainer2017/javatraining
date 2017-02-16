package org.train.java.basic.classes.threads.synchronize;

import java.util.ArrayList;

/**
 * Created by javat on 2/15/2017.
 */
public class ExpressionBean {

    private  StringBuilder expression = new StringBuilder();
    private  StringBuffer sbExp = new StringBuffer();


    public String getStringBuilder()
    {
        return expression.toString();
    }

    public void addStringBuildString(String addString)
    {
       synchronized (this)
       {
           expression.append(addString);
       }
    }

    public String getStringBufString()
    {
        return sbExp.toString();
    }

    public void addStringBuf(String addString)
    {
       sbExp.append(addString);
    }

}
