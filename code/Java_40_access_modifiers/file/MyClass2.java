package file;

public class MyClass2 {
    public int class2_public = 20;
    private int class2_private = 21;
    protected int class2_protected = 22;
    int class2_default = 23;



    public static void main(String[] args) {
        System.out.println("MyClass2 class");

        // System.out.println(class2_public); // error message. why ?
        // Because a static method can access the static variable only.

        // class2_public and other properties are instance variables means they are associated with object so wihout creating object we can't access them. and the static property belongs to the class so it can be access wihout creating object.

        // still if we want to access then we need to create an instance of MyClass2. because we're in static methods and it can access static variables(property)/method only  

        // MyClass2 obj = new MyClass2();
        // System.out.println(obj.class2_public);   // output : 20

    }
}
