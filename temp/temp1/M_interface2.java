interface outerInterface {

    
    interface innerInterface{
        
        static int staticVar = 10; 

        
        final int MAX_VALUE = 100;

        
        

        void nestedMethod();
    }

    void outerMethod();
}


interface anotherInterface extends outerInterface.innerInterface{
    
    void anotherMethod();
    void anotherMethod2();

}

abstract class Demo implements outerInterface.innerInterface{
    public static int a = 10;
    public int b = 20;
}


abstract class Demo2 extends Demo implements anotherInterface
{
    void greet(){
        System.out.println("hello");
    }

    
    public void anotherMethod2(){
        System.out.println("another method 2");
    }

    
}




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
        
        System.out.println(temp.temp1.MAX_VALUE);
        c.greet();

        
        System.out.println(temp.temp1.staticVar);
    }    
}
