package org.train.java.basic.fundamentals;

/**
 * Created by Ram on 28-01-2017.
 */
public class SwitchExample {

    public static  void main(String[] args) {

        int a = 2;
        int b = 3;

        String monthName = "Jan";

        switch (a) {
            case 1: case 5 :
                System.out.println("january");
                break;
            case 2:
                System.out.println("February");
                switch (b) {
                    case 2: System.out.println(" The days are 28 ");
                        break;
                    case 3 : System.out.println(" The days are 29 ");
                        break;
                }
                break;
            case 3:
                switch (monthName)
                {
                    case "Jan" : System.out.println("It is first month");
                        break;
                    default: System.out.println("Sorry wrong month");
                        break;
                }
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            default :
                System.out.println("Sorry wrong month ..");
                break;
        }


    }
}
