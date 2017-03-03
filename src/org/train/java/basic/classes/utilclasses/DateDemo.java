package org.train.java.basic.classes.utilclasses;// Show date and time using only Date methods.

import java.util.Calendar;
import java.util.Date;

class DateDemo {
    public static void main(String args[]) {
// Instantiate a Date object
        Date date = new Date();
        Date afterdate = new Date(Calendar.getInstance().getTimeInMillis() + 100000);
        Date deprecatedDate = new Date(1978,9,10);
// display time and date using toString()
        System.out.println(date);
// Display number of milliseconds since midnight, January 1, 1970 GMT
        long msec = date.getTime();
        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println(date.before(afterdate));
        System.out.println("My custom date is " + deprecatedDate.toString());
        System.out.println("date value " + date.toString());
        System.out.println("afterdate value " + afterdate.toString());
        System.out.println("Milliseconds since Jan. 1, 1970 GMT = " + msec);
    }
}