// Take input of 5 subject and Calculate its percentage (Total marks = 100)
import java.util.Scanner;

public class java_04_Ex_1 {
    public static void main(String[] args){
        float Total_marks = 100.0f;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks  ");

        System.out.print("Subject 1 : ");
        int s1 = sc.nextInt();

        System.out.print("Subject 2 : ");
        int s2 = sc.nextInt();

        System.out.print("Subject 3 : ");
        int s3 = sc.nextInt();

        System.out.print("Subject 4 : ");
        int s4 = sc.nextInt();

        System.out.print("Subject 5 : ");
        int s5 = sc.nextInt();

        float gained_marks = s1+s2+s3+s4+s5;

        float percentage = (gained_marks*100)/500;

        System.out.print("Percentage : " + percentage);



    }
}