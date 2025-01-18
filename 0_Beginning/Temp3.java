class Demo{
    public Demo(){
        System.out.println("Demo object is created");
    }
}

public class Temp3 {
    public static void main(String[] args) {

        // best example of "new" keyword is used to call constructor. also allocate memory.
        // Demo();      // error
        new Demo();

    }
}
