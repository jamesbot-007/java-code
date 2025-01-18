abstract class MyAbstactClass {

    private String name;
    private int age;
    private String foo = "bar";

    protected float PI = 3.14f ;        // assigned variable
    protected float area  ;             // non assigned variable 

    // Abstact can have constructor
    MyAbstactClass(String name, int age){

        // private data memeber can only access by constructor or methods
        this.name = name;
        this.age = age;

    }


    // abstract method
    public abstract void greet();

    // already implemented method in abstact class
    
    public void sayHello(){
        System.out.println("hello");
    }

    public void show(){
        System.out.println("hi");
    }

}

class Child extends MyAbstactClass{


    public Child(String name, int age){
        super(name, age);
    }

    @Override
    public void greet() {
        System.out.println("Hello world");
    }

    public void show(){
        System.out.println(PI);
        System.out.println(area);       // by default initialized with 0.

        // System.out.println(foo);     
        // You can not access the private property for that you can create getter() and setter() in abstract class.
    }

    // Method belongs to child class not comes from abstract class
    public void show2(){
        System.out.println("I am show2");
        
    }

    // In java,  it is not like parent's protected thing becomes private in child class. the interitence in java does not change thhe access modifier.
    // only follow the access specifier table
    // bro it is java not C++(in which after inheritence the access modifiers are changed).


    

}


public class M_abstract {
    public static void main(String[] args) {
        
        Child c = new Child("Alex",43);
        c.greet();
        c.show();
        c.sayHello();
        System.out.println(c.PI);       // it is protected in Child class not private
                                        // because if it is private then we can't access it
        c.show2();

        

        System.out.println();
        System.out.println();


        MyAbstactClass m =  new Child("Brayn", 35);
        m.greet();
        m.show();
        // m.show2();       // error


        // with Dynamic mathod dispatch. we can access method of base class, overridden methods of abstract class but can not access a method that only belongs to child class 

    }    
}
