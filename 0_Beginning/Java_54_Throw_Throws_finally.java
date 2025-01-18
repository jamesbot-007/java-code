// "throw" keyword is used to throw an exception(error) explicitly by a programmer.
// "throws" kwyword is used to specify a method can throws an exception*. so whne you use it use it in try..catch block and this way you can handle exception*


// "throws" keywords warns you(who wants use the function) about exception and then it is his respomsibility to handle that exception. by put in try..catch block.
// you can not say function is not working properly or not well defined.
// because the implemeter already warnings you about exception

// creating custom exception class.
class NegetiveRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius can not be negetive";
    }
    @Override
    public String getMessage() {
        return "Radius either can be positive or zero. can not be negative";
    }
}

public class Java_54_Throw_Throws_finally {

    // with default exeption
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    // with custom exception class
    public static float area(float r) throws NegetiveRadiusException, ArithmeticException
    {
        if (r < 0f){
            throw new NegetiveRadiusException();
        }
        
        float radius = (float) (3.14f * r * r) ;
        return radius;
    }
    
    // public static float area(float r) throws NegetiveRadiusException, ArithmeticException
    // {
        // code
    // }
    // This way you can throws multiple exceptions

    public static void main(String[] args) throws NegetiveRadiusException {
        // int result = divide(2,0);
        // System.out.println(result);  // give error

        try {
            
            int result = divide(2,0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        float result = area(4f);
        System.out.println(result);

        // That's why we say it can / may give error not guaranteed it give error.
        // and what type of error it gives that thing we specified in function declation.
        

        // result = area(-5f);  // error
        
        try {
            result = area(-5f);  // error
            System.out.println("result = " + result);
        } catch (NegetiveRadiusException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }


        // ----------------------------------------------------------------

        // Finally will execute always without respective of error. if their is error or not finally will always execute. 

        System.out.println("\nFinally Tutorial");

        try {
            System.out.println(1/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Finally code");
        }

        System.out.println("Code After Finally");

        // Finaly is not optional.
        // when finally is needed ?
        // - clean up resources
        // etc ...

        // Even there is return statement in try{} or loop is break then also still finally execute. Finally always execute.  

        int a = 1;
        int b = 3;
        while(true){
            try {
                System.out.print( a + "/" +b  + " = "+ (float)(a/b));
            } catch (Exception e) {
                System.out.print(e.getMessage() + " error");
                break;
            }finally{
                System.out.println(", value of b is : " + b--);
            }

        }


        // if there is not catch and finally. then it is valid.
        // if try code is having error then it will not execute only the finally execute. but exception is not handled so code after finally will not be executed
        // Note : if try is not having catch and finally both. means alone try gives error. 

        try{
            System.out.println(1/0);
        }finally{
            System.out.println("deallocate memory");
        }

        System.out.println("code after finally again"); // NOT EXECUTED

    }
}
