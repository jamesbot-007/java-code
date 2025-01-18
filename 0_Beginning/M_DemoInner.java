
// Neststed method have 2 types



// 1. Non-static nested class(inner clas)
// non-static nested class is called inner classs. 
// inner class has reference to the ouer lass instance
// inner class can access static and non-static memeber
// - It must associated with instance of outer class 

class Outer{
    int instanceVar = 20; // instance variable
    static int staticVar = 1; // static variable

    class Inner{
        void display(){

            // can access instance and static variable both.
            System.out.println("Inner class with Outer");
            System.out.println(instanceVar);
            System.out.println(staticVar);
        }
    }
}

// 2.static nested class
// innner class created by static keyword
// it can only access static variables/methods
// it can be initialized without creating instance of outer class
// it behaves like normal class but writting style is different that is used to determine it is static nested class. 
// It doesn't hold reference to the object of outer class

class Outer2{

    int instanceVar2 = 20; // instance variable
    static int staticVar2 = 1; // static variable

    static class Inner2{
        void display(){
            System.out.println("Inner class with Outer2");
            // System.out.println(instanceVar2);  // error
            System.out.println(staticVar2);
        }
    }
}


public class M_DemoInner {
    public static void main(String[] args) {
        
        // non static class
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
        //#region Explain Syntax
        /* 
        Outer.Inner inner = outer.new Inner();
         
        first we create instace of outer class 
        if nested class is non static then nested class(A.K.A. inner class) is associated with instance of outer class. In othe words Inner class belongs to object.

        outer.new Inner() : create instance of inner class that is associated with instance of outer class 
 
        here we use new keyword with outer that helps compiler to understand Inner class defined/connected with outer class
         */
        //#endregion
        
        // static class
        Outer2.Inner2 inner2 = new Outer2.Inner2();
        inner2.display();

        //#region
        /* 
         if nested class is static then do not need to create instace of outer class. In other words like associated to class and static data members can be access directly by class name no need to create instace

         behave like normal class. but the way or the style to create instace is different. that helps the code reader to understand it is nested class as static class. 

         */
        //#endregion

    }
}

// Another type of nested class 
// A nested class can be like it is  defined inside a method of outer class also object of it and run method also.
/*
classs outer {
    mehtod_of_outer{
        class inner{
            // ...
        }
        inner i = new inner();
        i.method_of_inner()
    }
}
*/