import java.util.Scanner;

public class Java_52_nested_try {

    public static void quickQuiz(){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        // while(true){
        while(flag){

            System.out.print("Enter the number : ");
            int i = sc.nextInt();
            
            try{
                System.out.println("Value at index "+ i+" Value is "+ arr[i]);
            }catch(Exception e){
                // throw new RuntimeException("Error while accessing the number");

                // or
                // System.out.println("Error while accessing the number");
                // System.exit(i);
                
                // or
                System.out.println("Error while accessing the number");
                flag = false;
            }
            
        }

        
    }

    public static void main(String[] args) {

        /*
         
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int i = sc.nextInt();

        try{
            System.out.println("Start");

            try{
                System.out.println(arr[i]);
            }
            catch(Exception e){
                throw new RuntimeException("Array index out of range");
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("End");
        */

        // if error is catch by inner try..catch then outer try..catch's catch will not catch error. 

        // Quick Quiz
        quickQuiz();
    }
}
