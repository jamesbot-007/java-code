
// Anonymous class
// It is class without name
// if we just want to use the class only once or we want to modify the class's method for a perticular object that time we use. Anonymous class.
// we use anonymous class when we want to use a class only once or we want to modify the class's method for a perticular object.






interface MyInterface{
    void Demo1();
    void Demo2();
}

// Lamda expression
@FunctionalInterface        // means interface has only one method.   
interface MyInterface2{
    void Demo1();
}

// Generally we create class and implement an interface.
// But we can reduce the line of code and increase teh readability of the code.

// Lamda expression is used to implment a an interface who has only one object

@FunctionalInterface         
interface MyInterface3{
    void Demo1(int a);
}


class MyClass implements MyInterface{
    @Override
    public void Demo1() {
        System.out.println("This is Demo 1");
        
    }

    @Override
    public void Demo2() {
        System.out.println("Demo 2");
    }
}

public class Java_65_Anonymous_Class_lambda_Expression {
    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        m1.Demo1();
        m1.Demo2();


        // Anonymous class
        MyClass m2 = new MyClass(){
            @Override
            public void Demo1() {
                System.out.println("i am demo1");
            }
            @Override
            public void Demo2() {
                super.Demo2();
            }
        };
        m2.Demo1();
        m2.Demo2();


        // we can directly create anonymous class from interface also
        MyInterface m3 = new MyInterface(){
            @Override
            public void Demo1() {
                System.out.println("he hey!");
            }
            @Override
            public void Demo2() {
                System.out.println("ha haa");
            }
        };
        m3.Demo1();
        m3.Demo2();


        // m2 object's creation way we use when we wantto modify method for one object only
        // m3 object's creation way we use when we want to create class directly from interface


        // Recap : 
        // we can create object of interface using "dynamic method dispatch"
        MyInterface mi = new MyClass();
        mi.Demo1();



        // ## Lambda Expression
        MyInterface2 obj = ()->{
            System.out.println("Hello world!");
        };

        obj.Demo1();

        // we can pass argument also
        MyInterface3 obj2 = (a)->System.out.println("Number is " + a);
      
        // If we have only one line then parentheses are redundant

        obj2.Demo1(6);

    }
}
