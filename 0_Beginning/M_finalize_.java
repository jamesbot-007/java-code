class Demo3{
    int i=10;
}

// In Java, the Object class is the root class of the class hierarchy. Every class in Java, either directly or indirectly, inherits from the Object class. This means that the Object class provides a set of fundamental methods that all Java objects can use, even if the class doesn't explicitly declare them

/* 
class MyClass {
    // Implicitly inherits from Object
}
 */
// finalize() method is part of the Object class. we can create our own finalize method by overriding it.
// same way we have other methods also, toString(), equals(obj), hasCode(), getClass(), clone()

class Demo4{

    private String name;

    public Demo4(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        // return "MyClass [name=" + this + "]"; // error. `this` can not use with string concatination
        return "MyClass [name=" + name + "]";
    }
}

public class M_finalize_ {
    public static void main(String[] args) {
        Demo3 obj = new Demo3();
        Demo3 obj2 = new Demo3();

        System.out.println(obj.i);
        System.out.println(obj2.i);
        
        // You cannot directly call the finalize() method in normal code. It is automatically invoked by the garbage collector when it determines that there are no more references to the object.
        System.gc(); // You cannot directly call garbage collection. but there no guarantee that it will remove which object(s)
        
        System.out.println(obj.i);
        System.out.println(obj2.i);


        System.out.println(obj.toString());// return a sting that is representation of object used when printing object
        // ------------------------------------------


        Demo4 obj3 = new Demo4("John");
        System.out.println(obj3.toString());

    }
}
