import java.util.Scanner;
import java.util.Random;

public class java_14_game_Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "\t===== Welcome to Rock, Paper, Scissor game =====\nEnter your choice.\n\tPress 's' for Scissor\n\tPress 'r' for Rock\n\tPress 'p' for Paper";
        System.out.println(s);

        System.out.print("\nEnter your choice : ");

        // new thing
        char choice = sc.next().charAt(0);

        switch (choice) {
            case 's':
                System.out.println("You choose Scissor");
                break;
            case 'r':
                System.out.println("You choose Rock");
                break;    
            case 'p':    
                System.out.println("You choose Paper");
                break;    
            default:
                System.out.println("Invalid choice");
                break;
        }

        // new thing
        int random_no = (int)Math.floor(Math.random() *3); // generate random number between 0 to 2

        // Anothe way to generate a random number 
        Random random = new Random();
        System.out.println(random.nextInt(3)); // number 0 to 2. 3 exlusive.
        
        char computer_choice;
        if (random_no == 0){
            computer_choice = 's';
        }
        else if (random_no == 1){
            computer_choice = 'r';
        }
        else{
            computer_choice = 'p';
        }  


        switch (computer_choice) {
            case 's':
                System.out.println("Computer choose Scissor");
                break;
            case 'r':
                System.out.println("Computer choose Rock");
                break;    
            case 'p':    
                System.out.println("Computer choose Paper");
                break;    
            default:
                System.out.println("Invalid choice");
                break;
        }



        if(choice =='r'){
            if(computer_choice == 's'){
                System.out.println("You win");
            }
            else if(computer_choice == 'p'){System.out.println("Computer win");}
            else {System.out.println("Match Draw");}
        }
        else if(choice =='p'){
            if(computer_choice == 'r'){
                System.out.println("You win");
            }
            else if(computer_choice == 's'){System.out.println("Computer win");}
            else {System.out.println("Match Draw");}
        }
        else if(choice =='s'){
            if(computer_choice == 'p'){
                System.out.println("You win");
            }
            else if(computer_choice == 'r'){System.out.println("Computer win");}
            else {System.out.println("Match Draw");}
        }
        

    }   
}
