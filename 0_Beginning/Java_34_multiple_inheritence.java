// multiple inheritence is not allowed in Java
// ex : class A extends B, C {} NOT ALLOWED
// the reason is there may be some ambiguity like class B and C have same method.
// In C++, like language We can resolve those ambiguity.

// Java has way to define things very clearly without confusion and less error chance
// That's why java not support multiple inheritence.

// ----------------------------------------------------------------------------------------

// When to use Abstract class and when interfaces
// Abstract class : Multiple classes have to implement common same base functionality in sub classes
// interface : Multiple inheritence

/* More in detail 
When to use Abstract class and when interfaces
ChatGPT said:
ChatGPT
In object-oriented programming (OOP), both abstract classes and interfaces are used to define a contract for subclasses or implementing classes. However, they serve different purposes and have distinct use cases.

When to Use an Abstract Class:
Common Base Functionality: If you have some common implementation (i.e., methods with code) that multiple subclasses should share, you should use an abstract class. Abstract classes can contain both abstract methods (without implementation) and concrete methods (with implementation).

Example: A Vehicle class can be abstract, with methods like start() or stop() implemented, while the abstract method move() is defined to be implemented by subclasses like Car and Bike.
Shared State (Fields): Abstract classes can have fields (attributes) that are common to all derived classes. If you need to store state (variables) that should be shared by all subclasses, an abstract class is suitable.

Example: In a Shape class, you might have a field for color that is shared by all shapes, and individual methods for calculating the area or perimeter can be abstract.
Inheritance Hierarchy: When you want to create a class hierarchy where the base class provides default functionality and behavior, abstract classes are appropriate. They are often used when the subclasses share some common behavior.

Versioning and Extending Functionality: If you expect to add additional functionality to the base class later, abstract classes allow you to add new methods with default behavior without affecting subclasses.

When to Use an Interface:
Multiple Inheritance: A class can implement multiple interfaces but can only inherit from one abstract class. If you need a class to follow multiple contracts or behaviors, interfaces are a better choice.

Example: A class Smartphone might implement both Camera and Bluetooth interfaces if it should have both camera and Bluetooth functionality.
No Shared Implementation: If all you're defining is a set of methods without any shared implementation, interfaces are the way to go. Interfaces specify what actions a class should perform, but not how to perform them.

Example: A Readable interface might define a method read() without specifying how the reading occurs. Classes like Book or Ebook would implement this interface.
Decoupling Code: Interfaces help decouple code by defining a contract that can be implemented by any class, without enforcing a shared inheritance structure. This leads to more flexible and modular design.

Example: A Persistable interface could be implemented by various classes like User or Product to enforce saving data to a database, without the need for them to share a common base class.
Providing API Contracts: Interfaces are great for defining APIs, where the implementation details can vary, but the contract (method signatures) remains consistent.

Example: A DataSource interface with methods like connect() and disconnect(), ensuring that any class implementing it will adhere to these methods.
Key Differences:
Abstract Class: Can have both abstract methods (without implementation) and concrete methods (with implementation). Supports fields and shared behavior.
Interface: Can only have method signatures (no implementation) until more recent versions of languages like Java and C# allow default methods. Designed to enforce a contract.
When to Use Each:
Use an Abstract Class when you have a common base class with some shared behavior or state, and you want to provide default behavior or state for subclasses.
Use an Interface when you want to define a contract that multiple classes can implement, and the classes may have completely different implementations. Also, when you need to support multiple inheritances of behavior.










 */


// Using interface indirectly multuple inheritence allowed

// Another thing,
// class smartphone extends Phone implements Camera, Bluetooth,GPS {}
// we can say smart phone is phone, but we can not say smart phone is camera (or bluetooth or gps)
// Phone is base for smartphone that's why we create class and extend from it
// Camera, Bluetooth, GPS are functionalities of smart phone that's wwe create interfaces that.

// Where C++ say smart phone is phone and camera and bluetooth and gps
// Java define things very clearly, by taking these thing in though java create create interface instead of giving multiple inheritance capabilities in java.

// Abstract class is created as base class for more than one class
// Interface mostly created to enhance functionalities of one class only.

// The fileds(properties) in interface is constant
// the class implementing interface need to implement methods not the fields

interface Read{
    int pages = 10;
}

class Demo implements Read{
    // int pages = 56; // give error try to change the constant value
    // "pages" field belongs to the interface Read, not the Demo class. However it is inherited and now present in Demo class static context

    // Not overrided

}


class Demo2 implements Read{

    // Although, we can crate another a variable with same name associated to Demo2 class
    // Demo2 class's object can access it 
   int pages = 5;

   // here we created new instace, or we can say for object's of Demo2 we have overriden the pages filed
}
class Demo3 implements Read{

    // Now it is property of class so by class name it is accessible
    public static int pages = 6;
}

public class Java_34_multiple_inheritence {
    public static void main(String[] args) {
    
        Demo d = new Demo();
        System.out.println(d.pages); // it doesn't have pages field so it take value from the pages field of Read interface  

        System.out.println(Demo.pages);
        System.out.println(Read.pages);

        Demo2 d1 = new Demo2();
        System.out.println(d1.pages);
        // System.out.println(Demo2.pages); // give error because it is not static variable 



        // we can not create object of interface but we can create reference of interface 
        Read r = new Demo3();
        System.out.println(r.pages);

            // if filed is overrriden then it return overriten value. this is rule if Dynamic method dispatch(DMD) 
        System.out.println(Demo3.pages); 

        // Methods inside interface by default "public abstract"
        // fileds inside interface by default "public static final"
    }
}


/* 
 interface Read{
    int pages = 10;
}

class Demo implements Read{

}

in this code pages belongs to Demo class or interface 
ChatGPT said:
ChatGPT
In your code, the pages field belongs to the interface Read, not the Demo class.

Here's why:

Fields in Interfaces:

In Java, all fields declared in an interface are implicitly:
public static final — meaning they are constants, shared by all instances and classes implementing the interface.
This means pages is a constant defined in the Read interface.
Demo Class:

When the Demo class implements the Read interface, it does not "inherit" the field pages in the same way it would inherit methods. Instead, the pages field remains a constant defined in Read.

You can access it using Read.pages. Attempting to modify pages will result in a compilation error because it is final.

Code Behavior:

Since pages is static and final, it does not belong to any instance of Demo. Even though Demo implements Read, it does not "own" the pages field.
Example Explanation
If you extend your code:

java
Copy code
public class Main {
    public static void main(String[] args) {
        System.out.println(Read.pages);  // Access via interface
        System.out.println(Demo.pages); // Compile-time error
    }
}
Read.pages is the correct way to reference it. The field is part of the Read interface, not Demo.






You said:
But this code not gives error 

interface Read{
    int pages = 10;
}

class Demo implements Read{

}

public class Java_34_multiple_inheritence {
    public static void main(String[] args) {
    
        System.out.println(Demo.pages);
        System.out.println(Read.pages);
        // pages field belongs to the interface Read, not the Demo class.
    }
}
ChatGPT said:
ChatGPT
You're correct! The code does not give an error because Demo.pages is a valid way to access the pages field due to the way Java handles interface constants. Let me explain this in more detail:

Key Points:
Interface Constants:

In Java, constants defined in an interface (like int pages = 10;) are implicitly public static final.
These constants are part of the interface's namespace but can be accessed through any class that implements the interface.
Accessing the Field:

When a class (Demo) implements an interface (Read), the constants of the interface are "inherited" in the sense that they can be accessed using the implementing class name (Demo.pages), even though they are not truly a part of the Demo class.
Why No Error?:

Java allows you to access pages using either Demo.pages or Read.pages. This works because Demo is aware of Read and the constant pages is static, so it is available in a static context from Demo.
Ownership:

Despite being accessible via Demo.pages, the constant pages still belongs to the Read interface. It does not belong to Demo.
Example for Clarity:
If you update the code:

java
Copy code
public class Main {
    public static void main(String[] args) {
        System.out.println(Demo.pages); // Valid
        System.out.println(Read.pages); // Valid
        // Changing the value of pages will result in an error:
        // Read.pages = 20; // Compilation Error: Cannot assign a value to final variable 'pages'
    }
}
Both Demo.pages and Read.pages work because Demo implements Read. However, the constant belongs to the Read interface, and Demo only has visibility of it.

Summary:
Even though Demo.pages works, the pages field does not "belong" to Demo. It is still a constant defined in the Read interface, and Demo is simply allowed to reference it.






You said:
interface Read{
    int pages = 10;
}
class Demo2 implements Read{

    
   int pages = 56;
}


here pages is constant then we're not getting error while overriding it
ChatGPT said:
ChatGPT
Great observation! The reason you don't get an error in your code is due to variable hiding, not overriding. Let me explain in detail:

Key Concepts:
Fields in Interfaces (pages in Read):

Fields in an interface are implicitly:
public static final — They are constants.
These fields are not inherited in the traditional sense like methods. Instead, they are accessible in implementing classes via the interface.
Fields in Classes (pages in Demo2):

The pages field in the Demo2 class is a completely separate instance variable and does not override the constant pages in the Read interface. Fields are not polymorphic in Java.
Why No Error?:

Since the pages field in the interface is static, it is tied to the Read interface, not to any instance or implementing class.
When you declare int pages = 56; in Demo2, it creates a new instance field in Demo2. This hides the pages field from Read, but it doesn't conflict with it.
Accessing the pages Fields:
Here’s how you can distinguish between the two fields:

java
Copy code
interface Read {
    int pages = 10; // Constant field in the interface
}

class Demo2 implements Read {
    int pages = 56; // Instance field in the class
}

public class Main {
    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        
        // Accessing fields
        System.out.println(demo.pages);  // Refers to Demo2's instance variable (56)
        System.out.println(Read.pages); // Refers to Read's constant field (10)
    }
}
Key Takeaways:
Field Hiding:

The pages field in Demo2 hides the pages field in Read. It does not override it because fields are not polymorphic in Java.
Access Rules:

Use Read.pages to access the pages field from the Read interface.
Use demo.pages (or new Demo2().pages) to access the pages field in the Demo2 class.
Conflict Avoidance:

Java allows this behavior because the pages field in Read is static (tied to the interface) and the pages field in Demo2 is an instance field, so they exist in separate namespaces.
This behavior ensures that both can coexist without any ambiguity or error.


 */