// in intellij IDEA you can generate code by alt+insert
// Or menubar > code > generate code. means,

// if property 
// int x;
// is created then you can generate getter/setter for property by clicking alt+enter

// For code reuseabliliy we use existing class features in derive class that is called inheritance
// terms :  base derive, child parent, super sub 

/* 
 * Modifier | within |  within | inheritance | global 
 * Modifier |  class | Package | Subclass    | world 
 * -------- | ------ | ------- | ----------- | ----- 
 * Public   |  Y     |  Y      |  Y          |  Y 
 * Protected|  Y     |  Y      |  Y          |  N 
 * Default  |  Y     |  Y      |  N          |  N 
 * Private  |  Y     |  N      |  N          |  N  
 * 
 */

class Base {
    private int x;

    public int getterX() {
        return x;
    }

    public void setterX(int x) {
        this.x = x;
    }
}

// "entends" keyword
class Derive extends Base {
    int y;

    public int getterY() {
        return y;
    }

    public void setterY(int x) {
        this.y = y;
    }
}

// Constructor in inheritance

// Constructor overloading with inheritence. 
// - By default default constuctor with no argument will called 
// - OR we can call paramterized constuctor using super keyword. 
// keep in mind it is super keyword

class Base2 {
    int x;

    public Base2(){
        System.out.println("Base2 class constructor");
    }

    public Base2(int x){
        System.out.println("Overloaded constructor of Base2");
    }
}

class Derive2 extends Base2 {
    int y;

    // public Derive2(int y){
    //     System.out.println("Derive2 class constructor ");
    // }
    
    // "super" keyword ( work same above "Derive2" )
    // It is used to call constructor base class 
    public Derive2(){
        super(); // calling base class default constructor
        System.out.println("Derive2 class constructor ");
    }
    // to call the overloaded constructor of base2
    public Derive2(int x, int y){
        super(x); // calling parameterize constructor of Base2
        System.out.println("Overloaded constructor of Derive2 ");
    }


    // additional (not useable but just created for fun)
    public Derive2(int x){
        super(x);
        System.out.println("Overloaded constructor with value of Base2 ");
    }

}

public class Java_25_inheritance {
    public static void main(String[] args) {

        // Object of Derive class can access method of base class
        // Base b1 = new Base();
        // System.out.println(b1.getterX());
        // b1.setterX(10);
        // System.out.println(b1.getterX());

        Derive d1 = new Derive();
        System.out.println(d1.getterX());
        d1.setterX(20);
        System.out.println(d1.getterX());

        // Constructor
        Derive2 d21 = new Derive2();
        // if derive class has constructor then first base class constructor called then
        // it's constructor called
        // if derive class not have constructor then base class constructor called
        // if base class not have constructor then only derive class constructor called
        
        
        Derive2 d22 = new Derive2(20,30);


        // for fun not useful.
        Derive2 d23 = new Derive2(40);


    }
}

// if all things are public in base class then you can access it in derive class
// till now keep only that in mind.

// using extends keyword we connect two classes but the properties/method are
// accessible or not that thing depends on access modifier.


// ############# Imp Note #############
// Note: if derive class constructor called and base class does not have any constructor then java compiler will by default create a empty default constructor for it. and time it will not give error.
// But if base class have parameterized constructor and default constructor is not explicitly defined created. Then Derived class constructor called and it wants a default constructor(Default constructor do not have any arguments) that time it gives error.



// Interesting thing is, in python also we have super keyword to call base class constructor    