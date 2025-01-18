
// If a java file have a multiple class and you compile file. It creates a seprate .class file for each class.

// Advantages 
// 1. Excapsulation of class : Each classs execute in it's own seprate file. Dynamically uuse class file at runtime
// 2. class loading by JVM : JVM can load only that class which is needed instead of importing all class.
// 3. Code reuseability and organization
// 4. Java allow multiple classes in single file. among them only can public whose name is same as file. Thie restriction helps compiler to create separate compiled output for each non-public class.
// 5. recompilation and duplication of code  : create seprate .class file avoid unnecessary recompilation and duplication of code.

class Base {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

public class  file  {
    public static void main(String[] args) {
        int a = 10;
    }
}