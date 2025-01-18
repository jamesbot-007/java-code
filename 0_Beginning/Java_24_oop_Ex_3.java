import java.util.Scanner;
import java.util.Random;

class GuessNumber{
    
    int random_num ;  
    int user_input;
    int no_of_guesses;

    public GuessNumber(){
        Random random = new Random();
        random_num = random.nextInt(101); 
        no_of_guesses = 0;
    }
    private void userInput(int n){
        user_input = n;
    }

    private int gusses(){
        return no_of_guesses;
    }

    public void startGame(int input){

        userInput(input);

        Scanner sc = new Scanner(System.in);

        while (true) {

            this.no_of_guesses++;
            
            if (user_input != random_num) {
                if (user_input < random_num) {
                    System.out.print("You guess wrong. Enter larger number : ");
                    user_input = sc.nextInt();
                } else if (user_input > random_num) {
                    System.out.print("You guess wrong. Enter smaller number : ");
                    user_input = sc.nextInt();
                }
                }
                else {
                    System.out.println("You gess right");
                    System.out.println("You take " + this.gusses() + " guesses.");
                    break;
                }


        }
    }



}

public class Java_24_oop_Ex_3 {
    public static void main(String[] args) {
        GuessNumber p1 = new GuessNumber();
        p1.startGame(10);
    }
}
