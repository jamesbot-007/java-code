// Anotation
// It provides extra information about the program. It provides a metadata to the class or function 
// Based on annotation, compiler changes it's behaviour

// buit-in annotations
// 1. @Override: if method is not overridden and still applied @Override then it gives error
// 2. @SuppressWarnings("Deprecation") : not show deprecated warnings 
//         - by changing the keyword in bracket we can change warning type
// 3. @deprecated : To assign deprecated to your assigned method
// 4. @FunctionalInterface : Functional interface is interface that has only one method abstracct method

@FunctionalInterface
interface myInterface {
    void myMethod();
    // void myMethod2();        // give error
}

class MyClass {

    @Deprecated
    void greet(){
        
    }
    
}



public class Java_64_Annotations {
    // @SuppressWarnings("Deprecation")         // Without this 
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        // obj.greet();
        obj.greet();
    
    }
}
