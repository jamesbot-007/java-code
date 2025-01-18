
class Base{

    public void show(){
        System.out.println("show");
    }

    public void print(){
        System.out.println("Base class print method");
    }
}

class Derive extends Base {
    public void greet(){
        System.out.println("good moring");
    }

    @Override
    public void print(){
        System.out.println("Derive class print method");
    }
}
public class Java_29_Dynamic_method_dispatch {
    public static void main(String[] args) {

        // we can create object of sub/base class that refers to super/derive class reference.
        Base d1 = new Derive();

        // we can call method of base class
        d1.show();

        // print() is overridden so, derive class's method will run.
        d1.print();

        // we can not call method of derive class
        // d1.greet();      // error


        // This is very useful Dynamic method dispatch.
        // creation of object done in runtime when program runs
        // Porgram Runs from top to bottom first it see the base class show() method but as per program come below it see show() also belongs to Derive class and it overide the base class show() implementation. that's how the Dynamic method dispatch works.




        /* 

         * 
         * Compile time Polymorphism : before running the program after compilation method is bind with object. 
         *  Example : Method overloading. 
         * > javac main.java
         * after that thing is decided which method should run.
         * It is also known as early binding, static binding or compile tome binding
         * Compile time Polymorphism done when we have same method with different signature. in same class so as per sinature method will assign
         * 
         * 
         * 
         * Runtime Polymorphism : When program run that time decided which method should run.
         * Example : Method overridding
         * > java main.class
         * > obj.show()
         * initailly binded with a method and then if a method in subclass override method in s superclass(inheritance) The method will invoke at runtime based on object's actual type(not reference type)
         * It is also known as late binding, dynamic binding or runtime binding.
         * the binding is done at runtime. means obj.show() will created/binded at runtime
         * 
         */

    
         /* 
          * 
          It refers to a process in which method call resolves at runtime based on the actual object type
          
          Animal { sound() }
          Dog extens Animal { sound() }
          main() {
            Animal myDog = new Dog();
          }


        Here, Dog is actual object type
        Animal referece type

        The reference variable(myDog) may be pointing to subclass or super class
        [ means, 
            Animal myDog = new Animal();
            Animal myDog = new Dog();      ]
        The method will execute depends on actual object type.(i.e. Animal or Dog).

        Animal myDog = new Dog();      ]
        When the program runs JVM checks actual type of object the reference is pointing to(Dog). based on that 
        it decide which method should call not determine during compilation
        means when you write
        obj.show() which method will run Either of sub class or of super class decided at runtime by actual object type(here, Dog)

          *
          */

    }
}
 