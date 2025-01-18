
// Note : if you fist visit java_54_Throw_Throws_Finally.java then it will be helpful for you to understand.

// Syntax is like : throw <Exception_object>;
// means throw keyword can only be used with Exception class's object only. not our created custon class.
// Actually yes we can use throw keyword with our custom class but we need to extend it with Exceptoion class 

// Custom Exception Class
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message); // Pass the message to the parent class (Exception)
    }
}

public class M_ExceptionDemo {

    // Method that throws a built-in exception
    public static void throwBuiltInException() throws ArithmeticException {
        throw new ArithmeticException("This is a built-in ArithmeticException!");
    }

    // Method that throws a custom exception
    public static void throwCustomException() throws MyCustomException {
        throw new MyCustomException("This is a custom exception!");
    }

    public static void main(String[] args) {
        // Handling the built-in exception

        try {
            throwBuiltInException();
        } catch (ArithmeticException e) {
            System.out.println("Caught built-in exception: " + e.getMessage());
        }

        // Handling the custom exception
        try {
            throwCustomException();
        } catch (MyCustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        // Uncaught example
        System.out.println("Program continues running normally after exception handling.");
    }
}
