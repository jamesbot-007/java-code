
// Multiple inheritance with the help of  interface


interface math1 {
    void add();
    void sub();
}

// create interface from already present interface(Inheritance in interface)
interface math2 extends math1 {
    // now it has add() and sub() method inside it
    void mul();
    void div();
}

interface math3{
    void mod();
}

class Demo implements math3, math2 {
    public void add() {
        System.out.println("Addition");
    }
    public void sub() {
        System.out.println("Subtraction");
    }
    public void mul() {
        System.out.println("Multiplication");
    }
    public void div() {
        System.out.println("Division");
    }
    public void mod() {
        System.out.println("Modulo");
    }
}
public class  Java_35_multiple_inheritance  {
    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.add();
        obj.mul();
        obj.mod();
    }
}