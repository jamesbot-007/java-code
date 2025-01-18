
// Autoboxing is feature of java wrapper class that allows us to directly assign the value to the object (no need to call the constructor)

// Ex: Integer val = 10;        // Provide more readability 

// Ex: Integer val = Integer.valueOf(10);   // internally 
// above example is standard way to assign value to the wrapper class. 
// This way assigning value and java internally(automatically) calls the valueOf() method that is called "autoboxing"

// wrapper class : It is class that stores the primitive data typ as object and it has some basic methods for type conversion and etc...
// Every class is child class of java.lang.Object; by default. means This way due to inheritance it can override methods of `Object` class.


// achieve autoboxing in user defined class
class MyNumber {
    private int value;

    public MyNumber(int value){
        this.value = value;
    }

    // Static factorty method
    public static MyNumber valueOf(int value){
        return new MyNumber(value);
    }

    // getter
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }


    // addition operation
    public MyNumber add(MyNumber obj){
        return new MyNumber(this.value + obj.value); 
    }


}

public class M_custom_Autoboxing {
    public static void main(String[] args) {

        // MyNumber num = 10;
        // This gives an error because Java does not natively support implicit conversion of primitive types (like int) to custom classes (MyNumber).

        // This is because the Java compiler doesn't know how to convert the int value 10 to an object of your MyNumber class. Implicit conversions like this are only possible for Java's primitive wrapper classes (e.g., Integer for int) due to Java's built-in autoboxing mechanism.


        // Solution
        MyNumber num1 = MyNumber.valueOf(10);
        MyNumber num2 = MyNumber.valueOf(20);

        System.out.println(num1);

        MyNumber result = num1.add(num2);
        System.out.println(result);

        System.out.println(num1);

    }
}
// You can still use the valueOf() method for creating instances explicitly.
// However, MyNumber num1 = 10; directly calls the constructor and avoids the valueOf() method in this case.

// Java will not natively convert primitives (int) to custom objects (MyNumber) at the compiler level.
// You can only use the constructor to simulate this behavior.

// Java does not allow operator overloading (except for the + operator with String).

// However, MyNumber num1 = MyNumber.valueOf(10); interanlly directly calls the constructor and avoids the valueOf() method in this case.










