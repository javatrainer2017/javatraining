package org.train.java.basic.classes.utilclasses;

import java.util.StringTokenizer;

public class STDemo {
    static String in = "title=Java: The Complete Reference;" +
            "author=Schildt;" +
            "publisher=McGraw-Hill;" +
            "copyright=2014";

    static String myString = "Me learnig java is as easy as learning mother tongue";

    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer(in, "=;");
//        StringTokenizer st1 = new StringTokenizer(myString);
//        System.out.println(st1.countTokens());
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
//            System.out.println(st1.nextToken());
        }

    }
}