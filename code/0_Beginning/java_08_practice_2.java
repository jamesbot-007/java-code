import java.util.Scanner;

public class java_08_practice_2 {
        public static void main(String[] args) {
            
            /**** 1 ****/
            System.out.println(7 / 4 * 9 / 2);
            // Hint : precedence same check associativity

        /**** 2 ****/
        // Encrpyt grade by adding 8 and then decrypt
        char grade = 'A';
        System.out.println("Grade = " + grade);
        
        grade = (char) (grade + 8);
        System.out.println("After encryption = " + grade);

        grade = (char) (grade - 8);
        System.out.println("After decryption = " + grade);

        // Forcefully type casting (A.K.A. Narrowing)
        // Note : In java, Character values are storesin Unicode not in ASCII characters

        /**** 3 ****/
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int myNum = 10;
        System.out.println(num > myNum);
        
        /**** 4 ****/
        System.out.println("Enter the values : ");
        float v = sc.nextInt();
        float u = sc.nextInt();
        float a = sc.nextInt();
        float s = sc.nextInt();
        float expression = ((v*v) - (u*u))/(2*a*s);
        System.out.println(expression);
        
        
    }
}
