// Java generics are similar to C++ templates
// for different datatype we need to create different class this thing avoided by generics we just create one class and pass the datatype as argument.
// another reson is when we want to access the element then we every time we need to perform typecasting. to solve the problem we pass datatype as argument so everytime we do not need to perform typecasting.
// Most of the time we use buit-in generic class. not use the user defined generics

// Recap: Integer,Float, etc.. are Wrapper class here it is generic class
// Wrapper class also stores the primitive datatype but also provide the methods to convert them. and it provides object. which is good thing, becuase generics can work with objects not with primitive datatypes.


import java.util.*;


// custom generic class (user defined)
class MyGeneric<T1>{
// class MyGeneric<T1, T2>{         // this way we can pass more than one datatype
    private T1 val;

    MyGeneric(){}   // Default enpty constructor

    MyGeneric(T1 val) {
        this.val = val;
    }

    public T1 getVal() {
        return val;
    }

    public void setVal(T1 val) {
        this.val = val;
    }

}


class MyClass{
    
    private int id ;


    public MyClass(int id) 
    {
        this.id = id;
    }

    void greet(){
        System.out.println("good morning!");
    }

    public int getId() {
        return id;
    }
}

public class Java_66_generic {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<Integer>();
        al.add("str1");
        al.add(12);

        // int val = al.get(0);                   //  compiletime error
        try {            
            int val = (int) al.get(0);          // Runtime error (∵ string can not convert to int)
        } catch (Exception e) {
            System.out.println("error while converting");
        }


        MyGeneric<Integer>  mg = new  MyGeneric<Integer>(10);
        System.out.println(mg.getVal());
        
        // we're supplying classes to already defined classes
        MyGeneric<MyClass> c = new MyGeneric<MyClass>();

        // c.show();
        // we can assign custom classs to custom generic  but generic object can acess method generic class can not use MyClass's method  on generic's object
        // One solution is create method in generic class inside it call method of passed object. you can use try..catch(if you want, not necessarily)

        MyClass myClass = new MyClass(22);

        c.setVal(myClass);  // we need to pass object of that class( it is like that)
   
        
        System.out.println(c.getVal());             // return object of class
        System.out.println(c.getVal().getId());     // 22


    }
}
