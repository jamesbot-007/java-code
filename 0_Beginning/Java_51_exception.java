// Exception is an error that neither programmer wants to make happen nor user wants to make. Still in some cases there is error occur that time we don't want our application or program got crashed. so prevent error and when error occur run speciific stmt to handle error.


// Types of errors
// 1. Syntax error 
// 2. Logical error 
// 3. Runtime error

    // ## syntax error
        // - Encounter by Programmer 
        // System.out.println("hello")    
        // System.out.println(a + b ) ;   // a and b not defined
        // c = 0;   // data type not declared

        // When compiler say error occur this line number that number is may be wrong line number because compiler just perfrom a guess it can not understand what you want to do. 
        // compiler is compiler. compiler is not machine leanring model(AI). ok. hope you understand.



    // ## logical error(A.K.A. Bug ) 
        // - Encounter by Programmer 
        // System.out.println(1/0);
        // invalid input


    // ## Runtime error. (Syntax is right, logic is also right.)
        // - Encounter by user
        // API not give data 

        // --> that time there is high chance of website is being crash. To handle it we use try...catch
        // Program crash decrese the User Experience(UX) (e.g. instead of showing Internal server error, show the wesite is down we're ok from out side your given bank account's server is down. At least show that type of message so that the site will not  user's trust  )

        // Note : Using try..catch we can hadle the Runtime error only not syntax error or logical error.

        // To solve syntax error compliler is available
        // To solve logical error you can add input validation or cross check logic. 


// Common Excetions 
// - NullPointer Exception
// - Arithmatic Exception (e.g. 1/0)
// - ArrayOutofBoundsException
// - ArrayIndexOutOfBoundsException
// - NumberFormatException (trying to convert a not legitimate  string(or any other datatype) value to integer value.)

import org.xml.sax.SAXException;

public class Java_51_exception {
    public static void main(String[] args) {
        
        // System.out.println(1/0);         // error

        // handling exception
        try{
            System.out.println(1/0);
        }catch ( Exception e ){
            System.out.println(e.getMessage());
        }

        // catch custom exception 
        try{
            System.out.println(1/0);
        }catch ( ArithmeticException e ){
            // System.out.println(e.getMessage());
            System.out.println("ArithmaticException occurred: " + e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of bound: "+e.getMessage());
        } catch (Exception e){
            // For all remaining exceptions
            // It is optional if there not last catch that handle any type of exception then it will not give error.
            // Highly recommended to add last catch that handle any type of exception
            
            System.out.println(e.getMessage());


            
        }

        System.out.println("Code after try-catch can run. After errorogenous program example this line");

        // catch can take object of class only
        // For different types of exceptions we have a separate class
        // and those all classes belongs to Exception.class

        // Note: while creating object is try__catch in catch we don't need to use "new" keyword means no need to call constructor
        // When an exception is thrown, the runtime environment automatically creates the exception object (e.g., ArithmeticException) and passes it to the catch block.

        
        // ---------------------------------------------------------------------------------------------------------

        // if you want to stop your program after after catching error then you can throw your cutom exception.
        // we use "throw" keyword. throw should only be used inside catch block. otherwise alone it gives error (because that is where we catch error(exception))

        int[] arr = new int[2];

        try{
            System.out.println(1/0);
            // System.out.println(arr[10]);
        }catch ( ArithmeticException e ){

            throw new ArithmeticException("you make Arithmetic Exception");
            // here we don't want to store the result that's why we don't store it in object. we just want to immediately throw an exception

            // whereas, you can write it like this also identical to above, but above way is convenient way to do that.
            // ArithmeticException my_exception = new ArithmeticException("you make Arithmetic Exception");
            // throw my_exception;

            // Syntax is like : throw <Exception_object>;
            // means throw keyword can only be used with Exception class's object only. not our created custom class.
            // Actually yes. we can use throw keyword with our custom class but we need to extend it with Exceptoion classs 
            // visit : M_ExceptionDemo.java


        } catch (Exception e){

            // insted of throwing error with custom message you can directly throw error also.
            throw e;

            // There is no rule like what exceptin you handle that's exception you have throw you can throw any type of exception.
            // catch saves the error in object "e"
            // we can convert it to any other exception

            // throw new ArithmeticException("Arithmetic Exception is thrown");
        }

    }
}
