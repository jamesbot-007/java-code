import java.util.Scanner;
import java.util.Random;

public class Java_24_Ex_3 {
    public static void main(String[] args) {

        System.out.println("WELCOME!");

        // Generate random number 
        Random random = new Random();
        int num = random.nextInt(101); // generating radom numbe btween 0-100.

        System.out.println(num);

        System.out.print("Guess number between 0-100 : ");
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();

        int count = 0;

        while (true) {

            count++;
            
            if (user_input != num) {
                if (user_input < num) {
                    System.out.print("You guess wrong. Enter larger number : ");
                    user_input = sc.nextInt();
                } else if (user_input > num) {
                    System.out.print("You guess wrong. Enter smaller number : ");
                    user_input = sc.nextInt();
                }
                }
                else {
                    System.out.println("You gess right");
                    System.out.println("You take " + count + " guesses.");
                    break;
                }


        }

    }
}
