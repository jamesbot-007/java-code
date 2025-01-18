
public class java_18_methods {
    
    void hello(){
        System.out.println("hello");
    }
    int sum(int a, int b ){
        return a + b;
    }

    static void mul(int a, int b ){
        System.out.println("Multiplication is " + a*b);
    }
    
    public static void main(String[] args) {
        
        
        // Sometimes
        // When program size grows and it is hard to understand logic.we can separate the logic in functions
        // Function are also used to reduce repeated tasks

        // Function syntax
        // DataType identifier(parameter){
        //     // Stmt
        // }

        // In java function is generally bounded with class they are not stand alone(because java is object oriented programming language). This way function is bounded with calss that's why function is known as method.

        // # Function call
        // To call a method first we need to create object a class to which method belongs. 
        java_18_methods obj = new java_18_methods();
        obj.hello();
        int result = obj.sum(10,20);
        System.out.println(result);


        // # 'static' keyword
        // Java will associate each object their own copy of property(ies) and method(s) means each object have it's own copy of sum() method.
        // But if method has static keyword then that method is shared among all the objects.
        // In java static keyword with the function is used that means a function can be called without creating object 

        mul(20,2);
        java_18_methods.mul(2,4);
        // This way we can also call method but writting class name is optinal it just for better code readability
        // In case of you're using inheritance that time you should class name. if method belongs to another class.


        // `main` is special type of function even it is keyword of java that runs when program runs. Main function is the entry point of your code.



        // By default when we don't write anything then access modifier is default 

        // # How function called ?
        // Copy of passed argument save in parameter 
        // Changing parameter will not change the argument pased in functions call.


        /* 
         * Static method
         * It can only access static method and staic variable 
         * It can not access non-static methiod
         * It belongs to class
         */


        
    }
}