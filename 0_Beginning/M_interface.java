
interface Demo1 {

    int a = 10;
    public final static int b = 20;

    void sayHello();

    // public abstract void sayHello2();

    // After update in java, method can implement in interface by using "default"
    // keyword
    default void show() {
        System.out.println("show in demo1");
    }

}

interface Dem2 {

    int c = 30;

    default void show() {
        System.out.println("show in demo2");
    }

    default void greet(){
        System.out.println("Good Morning");
    }
}

class MyDemo implements Demo1, Dem2 {


    @Override
    public void sayHello() {
        System.out.println("hello'");
    }

    // both interface have method with same name. it is ambiguity.
    // resolve embiguity by explicityly defining method
    @Override
    public void show()  // make sure about "public" 
    {
        System.out.println("show in MyDemo");
    } 




}

// first extend then implement
class Example extends MyDemo implements Demo1 {
}

public class M_interface {

    public static void main(String[] args) {
        
        MyDemo md = new MyDemo();
        md.sayHello();
        md.show();
        md.greet();

        Example ex = new Example();
        ex.show();
        
    }

}
