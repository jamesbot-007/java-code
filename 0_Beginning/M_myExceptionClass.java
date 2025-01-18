
class MyCustom extends Exception{
    private String message;

    public MyCustom(String str){
        super(str);
        message = str;
    }

    @Override
    public String toString(){
        return "My custom excption : " + message;
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "Error's get message is called";
    }

} 


public class M_myExceptionClass {
    
    public static int myMethod(int numerator, int denominator ) throws IllegalArgumentException, MyCustom
    {

        if (denominator == 0){
            throw new IllegalArgumentException("Invalid value for denominator");
        }

        if( (numerator > 100) && (denominator > 100)){
            throw new MyCustom("Error made");
        }

        return numerator/denominator;
    }
    public static void main(String[] args) {
        System.out.println(myMethod(12, 2));
        System.out.println(myMethod(12, 0));
        
        
        // if you're throws a custom error then function call will not compile time error. But if you throws myCustom in signature of method then it gives compile tome error. just because it is user defined error.
        // That error suggest you to call the function on try...catch otherwise ti give error

        // other words
        // A method whose class is extends from the Exception class if it is defined in method signarue then while calling it must use try..catch otherwise it give compile time error


        // try{

        //     System.out.println(myMethod(120, 2));
        //     System.out.println(myMethod(120, 240));
        // }
        // catch(Exception e){
        //     System.out.println(e.getMessage());
        // }
    }   
}
