// ## It is not like that 👇
// if method throws custom exception then it is mandatory to use throws keyword and decalre it can throw exception. ?
// Ans. yes
// But when a method throws custom exception then it is not mandatory to declare the exception using throws keyword
// one more thing is if the custom exception is declared by using throws keyword then we must call the function in try catch block otherwise we'll get error. but if the  function throws a buit-in error then it is ok to use function without try..catch block
// ## It is not like that 👆

// Actully, The exception are categorie by java compiler in two catehories
// Their classification is like,

// 1. Checked exception
// Checked exceptions are exceptions that must be either caught using a try-catch block or declared using the throws keyword in the method signature. They are typically caused by external conditions (e.g., I/O errors, network failures) and represent conditions that a program can reasonably recover from.
// means if there is input stream error, or network request error then we can resolve the error and recover the program (instead of error intrupt and kill the program / crash application)

// 2. Un Checked exceptions
// Unchecked exceptions are exceptions that do not require explicit handling using try-catch or declaration using throws. These are typically caused by programming errors, such as logic mistakes, incorrect assumptions, or invalid data.

// if custom exception is created by extending from Checked exception then it requires handling using try..catch or define in function signature.

// The classification you can see in exception hierarchy also.
/*  Exception hierarchy
Throwable
    ├── Error                 (Errors that are not typically handled by applications)
    │   ├── OutOfMemoryError
    │   ├── StackOverflowError
    │   └── VirtualMachineError
    │
    ├── Exception            (Base class for exceptions)
    │   ├── RuntimeException (Unchecked exceptions)
    │   │   ├── NullPointerException
    │   │   ├── ArithmeticException
    │   │   ├── ClassCastException
    │   │   ├── IllegalArgumentException
    │   │   └── IndexOutOfBoundsException
    │   │
    │   ├── IOException       (Checked exceptions)
    │   ├── SQLException
    │   ├── FileNotFoundException
    │   ├── ClassNotFoundException
    │   ├── InterruptedException
    │   └── ParseException
    │
    └── Error                 (Errors like `OutOfMemoryError` or `StackOverflowError`)

 */

 class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}

class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}

class Demo{
    private int val;
    public Demo(int val){this.val=val;}
    void method1(){
        if(this.val > 0){
            throw new MyUncheckedException("Unchecked exception");
            // no need to handle in try..catch or declare in method signature
        }
    }
    // In checked exception we need to handle it wither  via 1.try..catch or 2.declare in method signature

    // 1.try..catch
    void method2(){
        if(this.val > 0){
            try {
                
                throw new MyCheckedException("Checked exception 1");
            } catch (Exception e) {
                System.out.println(e);                
            }
        }
    }

    // 2.declare
    void method3() throws MyCheckedException{
        if(this.val > 0){
            throw new MyCheckedException("Checked exception 2");      
        }
    }
}


public class M_types_of_Exception {
    public static void main(String[] args) {
        Demo demo = new Demo(12);

        // compiler will not force to handle exceptions
        // mean at compile time : javac Main.java compiler will not give error 
        // error shows at runtime : java Main
        // In short, we can put it in try...catch but compiler not force us.
        /* demo.method1(); */
        
        // below method, compiler force to put it in try...catch.
        
        demo.method2();


        // if method throws exception in method signature then we need to handle it 
        try {
            demo.method3();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        // but if method it self handles the exception then no need to handle it in main function or the function that calles the exception. i.e. method2()
    }
}



/*
### Summary of Categorization:

| Type                    | Examples                                                                       | Requires Handling                    | Inherits From   |
|--------------------   - |---------------------------------------------------                             -|-------------------                  |-----------------|
| **Checked Exception**   | `IOException`, `SQLException`, `ClassNotFoundException`, `ParseException`       | Yes (with `try-catch` or `throws`)  | `Exception` (but not `RuntimeException`) |
| **Unchecked Exception** | `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException` | No (optional)                       | `RuntimeException` |
| **Error**               | `OutOfMemoryError`, `StackOverflowError`                                        | No (can't handle in most cases)     | `Error` |

*/