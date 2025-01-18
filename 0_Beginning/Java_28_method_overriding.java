// Derive class has method with same name of method present in base class.

/* 
 * overrloading : In same class multiple methods with same name different signature 
 * overriding : Different class has method with same name and signature
 * 
 * Note :
 *  For method overriding method should have same name + same signature. Even the signature is different then method will not be overridden.
 * return type also should be same 
 * access modifier also should be same (we can not reduce it means public->protected not allowed. protected->public )
 * 
 * we can not override static methods and final methods
 */
// We must need to understand these types of rules and if there are more then you'll learn as practice in Java.




// Notations 
// if we don't write notation then it will npt give error
// @Override is notation used before method in Derive classs to define method is overridden
// But if we write a notation @Override method and method is not overridden, means that kind of method is not present in base class then it give error.

// Then why should we write @Override ?
// becaue if not write then program work successfully but if we write and base class has not that method then it give error.
// Ans. Java OOPs project getting Big. This is useful when you change/remove the method in base class.  
// we're thiking like method is overridden and we do our all work based on that myth so there high chance of error in our program.
// It is not necessary but recommended.


// There are different types of Notations for different purpose. 


class Base{
    public void show(){
        System.out.println("Base class show");
    }
    public void show2(){
        System.out.println("show2 base class ");
    }
    public void show3(){
        System.out.println("show3 BC ");
    }

    void show4(){
            System.out.println("show4 base class ");
    }


}

class Derive extends Base{
    public void show(int a){
        System.out.println("Derive class show");
    }
    
    // public int  show3(){
    //     return 1;
    // }


    @Override
    public void show2(){
        System.out.println("show2 derive class");
    }

    // Method overriding by reducing visibility(access modifier)
    // Note : we can not make it private beacause private has less visibility compare to default
    // visibility order : private < (default) < protected < public
    // note : we can use the default keyword inside interface only (why ? learn bottom reading)
    @Override
    public void show4(){
        System.out.println("4 derive class");
    }



}

public class  Java_28_method_overriding  {
    public static void main(String[] args) {
        
        Derive d1 = new Derive();
        d1.show();
        d1.show2();
        d1.show3();

    }
}



/* 

Does the method overriding rule in java is like that we can not reduce the visibility but we can increase it

ChatGPT said:
ChatGPT
Yes, that's correct! In Java, the method overriding rule about visibility modifiers is:

You cannot reduce the visibility of the overridden method.
You can increase the visibility of the overridden method.
Explanation:
Visibility Modifiers in Java (in order of increasing visibility):

private: Only accessible within the same class.
(default or package-private): Accessible within the same package.
protected: Accessible within the same package and by subclasses.
public: Accessible from anywhere.
Reason for the Rule:

When overriding a method, the overriding method is meant to replace the original method in some contexts. If you reduce the visibility, it would break the substitutability principle of object-oriented programming, where the subclass should be usable wherever the parent class is expected.
By increasing visibility, you make the overridden method accessible in more places, which aligns with the concept of overriding.
Example:
java
Copy code
class Parent {
    protected void display() {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {
    @Override
    public void display() { // Increased visibility from protected to public
        System.out.println("Child display method");
    }
}
Here, the visibility of display was increased from protected to public, which is allowed.

What is NOT Allowed:
If we try to reduce visibility:

java
Copy code
class Parent {
    public void display() {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {
    @Override
    protected void display() { // Compilation Error: Cannot reduce visibility
        System.out.println("Child display method");
    }
}
This code would cause a compilation error.






You said:
incresing order of visibility
ChatGPT said:
ChatGPT
The increasing order of visibility in Java's access modifiers is:

private: The member is accessible only within the same class.
(default or package-private): If no modifier is specified, it is accessible only within the same package.
protected: The member is accessible within the same package and by subclasses (including those in different packages).
public: The member is accessible from anywhere.
In summary, the order from most restrictive to least restrictive is:

private < (default) < protected < public





You said:
here you change protected to public 
same way give example of private to protected
ChatGPT said:
ChatGPT
Certainly! Here's an example where the visibility of the method is increased from private to protected:

Example of Increasing Visibility from private to protected:
java
Copy code
class Parent {
    private void display() {
        System.out.println("Parent display method (private)");
    }
}

class Child extends Parent {
    @Override
    protected void display() { // Increased visibility from private to protected
        System.out.println("Child display method (protected)");
    }
}
Explanation:
In the Parent class, the display() method is private, so it can only be accessed within the Parent class.
In the Child class, the display() method is overridden with a protected visibility modifier. This increases the visibility, meaning it is now accessible within the same package and by subclasses, even if they are in different packages.
This is allowed because increasing visibility from private (most restrictive) to protected (less restrictive) is permissible in Java when overriding a method.






You said:
same way default to protected
ChatGPT said:
ChatGPT
Sure! Here's an example where the visibility of a method is increased from default (package-private) to protected:

Example of Increasing Visibility from Default to Protected:
java
Copy code
class Parent {
    // Default visibility (package-private)
    void display() {
        System.out.println("Parent display method (default)");
    }
}

class Child extends Parent {
    @Override
    protected void display() { // Increased visibility from default to protected
        System.out.println("Child display method (protected)");
    }
}
Explanation:
In the Parent class, the display() method has default (package-private) visibility, meaning it is accessible only within the same package.
In the Child class, the display() method is overridden with a protected visibility modifier. This increases the visibility, meaning it is now accessible within the same package and by subclasses, even if they are in different packages.
This is allowed because increasing visibility from default (package-private) to protected is permissible in Java when overriding a method.






You said:
if we modify this code as 

class Parent {
    // Default visibility (package-private)
    default void display() {
        System.out.println("Parent display method (default)");
    }
}

class Child extends Parent {
    @Override
    protected void display() { // Increased visibility from default to protected
        System.out.println("Child display method (protected)");
    }
}

public class temp {
    public static void main(String args[]) {
        Child c = new Child();
        c.display();
    }
}


then it give error
ChatGPT said:
ChatGPT
Yes, you're correct that the code will give an error. The issue lies in how the default access modifier is used. In Java, the keyword default is not used as an access modifier for methods. Instead, it is used in interface methods to provide default implementations.

Explanation of the Error:
Incorrect Use of default Access Modifier:

In your code, you wrote default void display() in the Parent class. This is incorrect because Java does not allow default as an access modifier for methods in regular classes.
The correct behavior is to either use no modifier (which gives default or package-private access) or explicitly use one of the access modifiers: private, protected, or public.
How to Correct the Code:

If you want the method to have default (package-private) access, simply omit the access modifier.
If you want to use the protected access modifier in the Child class, it is valid, but you need to ensure that the method in the Parent class is correctly defined.
Corrected Code:
java
Copy code
class Parent {
    // Default visibility (package-private) — No `default` keyword here
    void display() {
        System.out.println("Parent display method (default)");
    }
}

class Child extends Parent {
    @Override
    protected void display() { // Increased visibility from default to protected
        System.out.println("Child display method (protected)");
    }
}

public class temp {
    public static void main(String args[]) {
        Child c = new Child();
        c.display();  // Output: Child display method (protected)
    }
}
Explanation of Correct Code:
The method display() in the Parent class is now package-private (default access) because no modifier is specified.
The method display() in the Child class is protected, which increases the visibility from package-private to protected.
The program runs correctly and prints Child display method (protected) because the Child class's overridden method is executed.
Summary:
default is not a valid access modifier for methods in classes.
To define a method with default (package-private) visibility, simply omit the access modifier.





You said:
 default a all things in class have default access modifier
does it is true ?
if yes then why we say like that because now you told default is not used as access modifier for methods

2/2

ChatGPT said:
ChatGPT
You're right to bring this up! Let's clarify the concept.

Key Points:
Default Access Modifier (Package-Private):

In Java, if no explicit access modifier is provided (i.e., you do not specify public, private, or protected), the member (method or variable) is package-private by default. This means the member is accessible only within the same package.
This is often referred to as the default access modifier but it's not called default in the code.
The default Keyword:

The default keyword is used only in interfaces in Java. It allows you to define a method with a default implementation in an interface.
It is not an access modifier for regular methods in classes.
Why We Say "Default" Access Modifier:
When people refer to "default" access in Java (especially in the context of classes), they are talking about package-private access. This is because, by default, if you don't specify any access modifier for a class member, it will be package-private.

Example of Package-Private (Default Access):
java
Copy code
class Parent {
    // This method has default (package-private) access.
    void display() {
        System.out.println("Parent display method (default access)");
    }
}
In the example above, display() is package-private, meaning it is accessible only within the same package. No explicit modifier is provided, so this is considered default access.

Where default Keyword is Used:
The default keyword is used for methods in interfaces to provide a default implementation. It is not used in class members (fields or methods).

java
Copy code
interface MyInterface {
    // This is a default method in an interface.
    default void display() {
        System.out.println("Default method in interface");
    }
}
To Summarize:
When you hear about default access in a class, it actually refers to package-private access, which happens when you don't specify any access modifier.
The default keyword is specifically for defining methods in interfaces and is not an access modifier for methods in regular classes.





You said:
menas we just call it default but we can not use default keyword 
am I right ? 
ChatGPT said:
ChatGPT
Yes, you're absolutely correct!

"Default" access modifier refers to package-private access, which is the default visibility for class members (fields, methods) when no explicit access modifier (like public, private, or protected) is specified.
This does not involve using the default keyword in your code. We simply call it "default" access because it's the default behavior when no access modifier is provided.
So, to clarify:

We cannot use the default keyword to define package-private access.
We just call it "default" access because that's the default visibility when no access modifier is mentioned.
Example:
java
Copy code
class Parent {
    // This method is package-private (default access) because no modifier is specified.
    void display() {
        System.out.println("Parent display method");
    }
}
Here, display() has package-private access because no modifier is used, and we often call this "default" access, but we don't write default in the code.
 */