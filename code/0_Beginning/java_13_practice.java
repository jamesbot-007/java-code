import java.util.Scanner;

public class java_13_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the marks of 3 subjects : ");

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // int total = a+b+c;
        // float avg = total/3;

        // if (a < 33 || b < 33 || c < 33 ){
        // System.out.println("\nFail, due to one of the subject has less than 33 marks
        // ");
        // }
        // else if (avg < 40){
        // System.out.println("\nFail, Due to total percentage is less than 40%");
        // }
        // else {
        // System.out.println("\nPass");
        // }

        // Calculate income tax for employee
        /*
         * 2.5-5L 5% tax
         * 5-10L 20% tax
         * above 10L 30% tax
         */

        // System.out.println("Enter your income (in Lakhs) : ");
        // float income = sc.nextFloat();
        // if (income < 2.5){
        // System.out.println("No tax");
        // }
        // else if (income < 5){
        // System.out.println("Tax is : " + (income*5)/100 + " %");
        // }
        // else if (income < 10){
        // System.out.println("Tax is : " + (income*20)/100 + " %");
        // }
        // else {
        // System.out.println("Tax is : " + (income*30)/100 + " %");
        // }

        // leap year contains an additional day. A year has 366 days

        // Find domain typpe

        String domain = "Google.com";
        int i = domain.indexOf(".");
        String domainType = domain.substring(i);

        System.out.println(domainType);

        if (domainType.equals(".com")) {
            System.out.println("This is a commercial website");
        } else if (domainType.equals(".org")) {
            System.out.println("This is a organizational website");

        } else if (domainType.equals(".in")) {
            System.out.println("This is a indian website");

        } else {
            System.out.println("not recognize website");

        }

        // OR here can use a condition like,
        if (domainType.endsWith(".com")) {
            System.out.println("This is a organizational website");

        }

    }
}
