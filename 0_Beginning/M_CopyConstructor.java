class MyClass{

    private int a;
    private int b;

    // public MyClass(){}  
    // default constructor. which does nothing. ( That type of constructor is implicitly created by Java compiler. only if there no-constructor in class)

    // default constructor that does something (A.K.A. custom default constructor)
    public MyClass(){
        System.out.println("Object is created ");
    }

    // Paramterized constructor
    public MyClass(int a, int b){
        this.a = a;
        this.b = b;
    }

    // Copy constructor
    public MyClass(MyClass obj){
        this.a = obj.a;
        this.b = obj.b;
    }

    void show(){
        System.out.print("a = "+ a);
        System.out.println(", b = "+ b);
    }

}

public class M_CopyConstructor {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10,20);
        MyClass obj2 = new MyClass(obj);
        
        obj.show();
        obj2.show();

        // This way after creating object can we call constructor ?
        MyClass obj3 = new MyClass();

        // Ans.  you cannot call a constructor on that object again. A constructor is only called during the creation of the object using the new keyword. After the object is created, you can only invoke its methods.

    }
}

