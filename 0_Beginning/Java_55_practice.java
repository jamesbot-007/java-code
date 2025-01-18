
// custom exception class
class MyException extends Exception {

    // to pass message while throwing error we need to create constructor
    public MyException(){
    }
    public MyException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "You made an error";
    }

    @Override
    public String getMessage() {
        return "Kindly visit out documentation for solution";
    }
    
}

// if method throws custom exception then it is mandatory to use throws keyword and decalre it can throw exception. ?
// Ans. yes
// But when a method throws custom exception then it is not mandatory to declare the exception using throws keyword
// one more thing is if the custom exception is declared by using throws keyword then we must call the function in try catch block otherwise we'll get error. but if the  function throws a buit-in error then it is ok to use function without try..catch block


public class Java_55_practice {

    public static int show(int x)  throws ArithmeticException{

        if (x < 0){
            // to pass message while throwing error we need to create constructor. also we need to create empty default contructor that does nothing.

            // throw new MyException();
            // throw new MyException("Custom Exception my exception");
            // throw new ArithmeticException("Custom Exception my exception");
            
            // if you don't handle the error using try__catch you will see above error message when MyException is thrown (error occur)
        }

        try{

            for (int i = 0; i < x; i++) {
                if (i > 5) {
                    break;
                }
                System.out.println(i);
            }
            
        }
        catch(Exception e) {
            System.out.println(e);
        }finally{
            System.out.println("Finally code");
        }

        return 0;

    }
    public static void main(String[] args) {

        int[] arr = new int[4];

        try{

            // System.out.println(1/0);        // Arithmatic error
            // System.out.println(arr[5]);     
            // throw new RuntimeException();   // Explicit throw error
            throw new MyException();   // Explicit throw error
        }   
        catch(ArithmeticException e)
        {
            System.out.println("Haha");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Hehe");
             
        }catch(MyException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }catch(RuntimeException e)
        {
            //  throw new RuntimeException(); // without msg just thow error
             throw new RuntimeException("You produce a runtime error"); // with msg 
        }


        show(3);

}
}