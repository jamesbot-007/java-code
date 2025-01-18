// import scanner class
import java.util.Scanner;

public class java_03_user_input {
    public static void main(String[] args) {

        // Creating Scanner class object
        // Syntax for creating object in Java : Class_name obj_name = new Class_name(parameter);
        // "new" keyword used to allocate memory for creating object. it returns the memory address of object. same as definition of Variable.
        // Class_name(parameter) will call constructor of class

        // "System.in" specifies we want to take input from keyboard
        Scanner sc = new Scanner(System.in);
/*
        // After creating scanner object, There are lots of method to take input from user
        // Create object as java (as java says rules ) and use it (as you want)
        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter number 2 : ");
        float b = sc.nextFloat();

        float sum = a + b ;
        System.out.println("The sum of these numbers are : " + sum);


        //  check user entered number is integer or not using Scanner class.

        System.out.print("Again Enter a number : ");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1); // return true if user input is valid 'int'


        // String
        String str = sc.next();
        System.out.println(str);
*/
        // next() stops taking input when it encounter whitespace
        // solution : use nextLine() method

        String str2 = sc.nextLine();
        System.out.print(str2);

    }


}


/* A java code can be like
*
*    System.out.println("Enter number 1 : "); int a = sc.nextInt();  System.out.println("Enter number 2 : ");

    * White spaces are optional but the Semicolon is not optional.
*
* */

