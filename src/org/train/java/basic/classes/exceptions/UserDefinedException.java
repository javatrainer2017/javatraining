package org.train.java.basic.classes.exceptions;

/**
 * Created by javat on 2/10/2017.
 */
public class UserDefinedException {

    public static void main(String[] args) {
//        try {
            throwThowable();
//        } catch (ExtendsException extendException) {
//            System.out.println(extendException.getMessage());

            // debug logs -- e.printStackTrace
//        }

    }

    public static void throwThowable()
    {
        try {
            if (10 != 10)
                throw new ExtendsException("In extends exception...");
            Class.forName("kk");
            //100 statement
        }
               catch ( NullPointerException e)
        {
            System.out.println("Classnot found exception" + e.getMessage());
        }
        catch (ExtendsException | ClassNotFoundException  e)
        {

        }
        catch (Exception e)
        {

        }
        finally {
            System.out.println("I always get executed...so that i can close connection or clean resources...");
        }
    }

}


class ExtendsThowable extends Throwable {

    public String getMessage() {
        return "Throwable extension";
    }
}
class ExtendsRuntimeException extends RuntimeException {

    public String getMessage() {
        return "RuntimeException extension";
    }
}

class ExtendError extends Error {

    public String getMessage() {
        return "Error extension";
    }
}

class ExtendsException extends Exception
{
    public ExtendsException(String message_)
    {
        super(message_);
    }

//    public String getMessage()
//    {
//        return "Exception extension";
//    }


}