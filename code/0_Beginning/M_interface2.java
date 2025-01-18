// nested interface 
// interaface can not have constructor

interface outerInterface {

    
    interface innerInterface{
        // interface can have only static variable 
        static int staticVar = 10; 

        // interface can have only final variable(constant)
        final int MAX_VALUE = 100;

        // constructor
        // public innerInterface() {}   // error

        void nestedMethod();
    }

    void outerMethod();
}
// an interface extends(not implements) another interface

interface anotherInterface extends outerInterface.innerInterface{
    
    void anotherMethod();
    void anotherMethod2();

}

abstract class Demo implements outerInterface.innerInterface{
    public static int a = 10;
    public int b = 20;
}

// same way an abstract class can extends another abstract class also.
abstract class Demo2 extends Demo implements anotherInterface
{
    void greet(){
        System.out.println("hello");
    }

    // An interface method implented in abstract class
    public void anotherMethod2(){
        System.out.println("another method 2");
    }

    
}

// interface provide full abstraction(no method body), while abstract class provide partial abstraction(has method body)


class Child extends Demo2{

    @Override
    public void nestedMethod(){
        System.out.println("Nested method");
    }
    
    @Override
    public void anotherMethod(){
        System.out.println("another method");
    }
}



public class M_interface2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.nestedMethod();
        c.anotherMethod();
        c.anotherMethod2();
        System.out.println(c.a);
        System.out.println(c.b);
        // System.out.println(c.MAX_VALUE);     // identical to below
        System.out.println(outerInterface.innerInterface.MAX_VALUE);
        c.greet();

        // static variable can access by class name
        System.out.println(Child.staticVar);
    }    
}
