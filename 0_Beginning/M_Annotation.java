// Annotations in Java are used to provide metadata about the code. They don't affect the program's logic directly, but they can be used by tools or libraries to perform specific actions.
// Annotations are typically used for configuration, documentation, or influencing(impact) code behavior.

// Some built-in annotations in Java: @Override, @Deprecated, @SuppressWarnings.
// Custom annotations can be defined using the @interface keyword.

import java.util.ArrayList;
import java.util.List;

class A{
    void sound(){
        System.out.println("Animal Sound");
    }
}
class B extends A{
    @Override
    void sound(){
        System.out.println("Animal Sound");
    }
    // Used to indicate that a method is overriding a method in a superclass.
    // Helps with compile-time checking to ensure the method correctly overrides a parent class's method.
}

class OldClass {
    @Deprecated
    void oldMethod() {
        System.out.println("Statements ");
    }
    // Marks a method, class, or field as deprecated, meaning it should not be used anymore.
    // Often used when a better or more efficient alternative is available.
}

@SuppressWarnings("unchecked")
class Test {
    public void testMethod() {
        List rawList = new ArrayList(); // unchecked warning
        rawList.add("Hello");
    }
}

// custom annotation
@interface Author {
    String name();           // Required element
    String date() default "Unknown";  // Optional element with a default value
}
@Author(name = "John Doe", date = "2025-01-01")
class MyClass {
    // Class code
}
// it doesn't do anything just provide data of who created this class and when

public class M_Annotation {
    public static void main(String[] args) {
        OldClass oc = new OldClass();
        oc.oldMethod(); // gives warning of derpreaciated
    }
}
