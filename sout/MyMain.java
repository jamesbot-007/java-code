class MyPrintStream{
    void print(String str){
        System.out.println(str);
    }
    void println(String str){
        System.out.println(str + "\n");
    }

    // Internally it may using method of PrintStream class or some other class which is parent of PrintStream
}



class MySystem{

    public static final MyPrintStream out = new MyPrintStream();

}


public class MyMain{
    public static void main(String[] args) {
        System.out.println("Hello World");

        MySystem.out.print("My Custom hello world");
    }
}

