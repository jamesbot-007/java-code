import java.util.*;

public class java_11_practice_set {
    public static void main(String[] args) {
        String s = "Once upon a time";
        String replace = s.replace(" ","_");
        System.out.println(replace);
        

        System.out.print("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String stored_name = sc.nextLine();
        String letter = "Hello! <name>. Thanks for joining us.";
        String content = letter.replace("<name>", stored_name);
        System.out.println(content); 


        // find double or triple space
        s = "Once  upon a time";
        System.out.println(s.indexOf("  ")); 
        System.out.println(s.indexOf("   "));
        // return -1, means not found 
    }
}
