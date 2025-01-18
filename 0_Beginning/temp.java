class Parent {
    // Default visibility (package-private)
    void display() {
    // default void display() {
    // give error 
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
        // c.display();

        // int a = 10;
        // if(a){
        //     System.out.println("hi");
        // }
    }
}