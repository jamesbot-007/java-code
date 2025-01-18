package mypack2;
// import mypack.Demo;    // You can not access demo because it is not a public class. you can access it in same package only
import mypack.MyClass;


class Check extends MyClass{
    void show(){
        System.out.println(protected_property);
        // System.out.println(default_property);    // error
    }
}

public class MyClass2 {
    public static void main(String[] args) {
        // System.out.println(public_property);

        Check myCheck = new Check();
        myCheck.show();
    }
}


// There is no mean of 👇 because at the end it used the static method i.e. psvm and it can access only the static properties so, ... there is no mean to use extends keyword

// public class MyClass2 extends MyClass2{
//  public static void main(String[] args)}{
// 
//  }
// }


// javac -d . *.java
// java mypack2.MyClass2