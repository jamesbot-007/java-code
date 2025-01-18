// we can write out custom exception class by extending the class from exception class
// and we can override methods

// The Exception class belongs to java.lang package

import java.util.Scanner;

class MyException extends Exception {

    // Override methods of Exception class (also known as Special method of custom exception class)

    @Override
    public String toString() {
        // return super.toString() + "I am to string";
        return "I am to string";
    }

    //  Note : just write getMessa and VS code will write the code
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        // return super.getMessage() + " I am to getMessage";
        return "I am to getMessage";
    }

    // There are more methods also...
}

public class Java_53_Exception_class {
    public static void main(String[] args) {
        int a = 10;
        if (a==10){
            try  {
                // It should be in try catch block 
                // "throw" keyword used to throw error(exception)
                throw new MyException();    // means, explicitly we create error. so that program goes in catch bloack

            } catch (Exception e) {
                // System.out.println(e.getMessage());
                // System.out.println(e);                          // by default while printing "e" alone it calls getString() method
                // System.out.println(e.toString());              // explicitly call toSting() method. identical to above

                e.printStackTrace(); // it shows at which line and where(by which function) error is occured
                                     // helpful when code size is too large.
            }
        }

        // when you 
        // System.out.println(1/0);
        // intenall java calls, throw new ArithmaticException(....)


        // you can create MaxAge  exception
        // when age > 100 then, throw new MaxAgeException("Age can not be greater than 100")
        // for that you need to create MaxAgeException class and by overriding it's getMessage() method return "Age can not be greater than 100"

    }
}
