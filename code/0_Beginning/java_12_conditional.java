// Conditional statements

public class java_12_conditional {
    public static void main(String[] args) {
        
        int age = 6;
        if (age > 18){
            System.out.println("You can drive");
        }
        else if (age == 18){
            System.out.println("Congratulation! You're eligible appling for licenses ");
        }

        // else is optional
        else{
            System.out.println("You can't drive");
        }

        // Relational Operators : >,<,==,<=,>=,!=
        // Note : '=' is used for assignment and '==' is used to check two values are equal or not

        // while eritting a if-elseif ladder write it in descendding order. 
        // Example : >90, >80, >70, >60, >50, <50 OR else

        // Logical opertors : and(&&), or(||), not(!)
        // &&,|| have associativity left to right
        // and = all true, OR = any one is false



        // Combination of relational and logical operator can create a complex condition


        // Switch case statements 
        String s = "Monday";

        switch(s){
            case "Monday" : System.out.println("Today is Monday"); break;
            case "Tuesday" : System.out.println("Today is Tuesday"); break;

            // default is optional
            default : System.out.println("Today is not Monday or Tuesday"); break;
        }

        // Java support int,char,string datatype in switch case statement


        // Special switch case in Java
        // Enhanced switch case statement. do not need to write break statement
        age = 17;
        switch (age) {
            
            
            case 18-> System.out.println("You're eligible for driving license");

            // This way execute multiple statements
            case 17 -> {
                System.out.println("You're on right track");
                System.out.println("You can drive after 1 year");
            }

            // for both age=15 age=16 true 
            // like : if(age==15 || age==16)
            case 15,16-> System.out.println("you should wait now");            
            default -> System.out.println("Enjoy java code");
        }

        
    }
}
