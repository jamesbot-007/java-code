// "this" refers to reference of the object
// we can access current object's property/method

// "super" keyword is used for Super class It refers to immediate super class object.
/* 
 * calling base class constructor
 * super()
 * super(i,j)
 * 
 * Accessing base class methods/properties
 * super.disply()
 * super.name
 */

class Base{
    int a;

    public Base(int a){
        this.a = a;
    }
}

class Derive extends Base{
    int b;

    public Derive(int a, int b){
        // super();     // give error because base class does not have a default constructor
        super(a);
        this.b = b;
    }

    public void sum(){
        System.out.println("Sum is " + (a+b));
    }

}

public class Java_27_this_super {
    public static void main(String[] args) {
        
        Derive d1 = new Derive(10, 20);
        d1.sum();



    }
}
