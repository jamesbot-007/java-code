
class Demo {

    private int demoVar;
    protected String company = "Google";  

    public Demo(int val) {
        this.demoVar = val;
    }

    public int getDemoVar() {
        return demoVar;
    }

}

class MyClass extends Demo {
    public int MyVar;

    public MyClass(int val, int val2) {

        // if you define
        super(val2);
        this.MyVar = val;
    }

    public int getMyVar() {
        return MyVar;
    }

    public int call() {
        System.out.println("calling getDemoVar() from MyClass");

        // invoke parent's method ( code reuseability)
        return super.getDemoVar();
    }


}

public class M_DemoSuper {
    public static void main(String[] args) {
        MyClass obj = new MyClass(1, 2);
        System.out.println(
                "My Var = " + obj.getMyVar()
                        + " " + "Demo Var = " +
                        obj.getDemoVar()
        );

        // Access property
        System.out.println("Access property = "+obj.MyVar);

        // Accessing methods
        System.out.println( "Accessing methods = " + 

            obj.getDemoVar()
            );


    }
}