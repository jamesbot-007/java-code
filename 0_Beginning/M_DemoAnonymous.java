// 1.
/* 
 It is class in java that is defined and instantiated(create object) om single expression(line). It doensn't have name. It typically used to overrider method of class when concise implementation needed
 * 
 */

class D {
    void greet() {
        System.out.println("hi");
    }
}

class E {

    void work() {

        // Anonymous class
        D obj = new D() {
            @Override
            void greet() {
                System.out.println("Hello");
            }
        };

        // calling method
        obj.greet();

        // we can directly put it in main method
    }

}

// 2. Java method can return class
class Outer {
    // returning inner class
    class Inner {
        void message() {
            System.out.println("my msg");
        }
    }

    public Inner getInner() {
        return new Inner();
    }
}

public class M_DemoAnonymous {
    // Java method can return class
    public static D getMyGreet() { // Here 'D' is return type. Object of D class will be returned
        return new D();
    }

    // returning anonymous class
    public static D getGreeting() {
        return new D() {
            @Override
            void greet() {
                System.out.println("Greeting");
            }
        };
    }

    public static void main(String[] args) {
        
        E obj = new E();
        obj.work();

        // create object of D and call method
        D obj1 = getMyGreet();
        obj1.greet();

        D obj2 = getGreeting();
        obj2.greet();

        // create outer put inner 
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner();
        inner.message();


    }
}
