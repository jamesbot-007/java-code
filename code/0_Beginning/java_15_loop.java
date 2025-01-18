public class java_15_loop {
    public static void main(String[] args) {
        
        // Loop are used to reduce the repeatations 

        // While loop
        int i = 1;
        while( i < 5 ){
            System.out.println(i);
            i++;
        }

        // while loop works on boolean expression 
        /*
        while(true){
            // This is infinite loop
            // If you have Ants in your laptop then you should start it and take a break it will heat your laptop and all the ants will go outside.
        }
        */

        /* 
         while(1){ // error 
         // Even in programming language like C/C++, Python this runs because their 1 refers to boolen value true. But in java it is not like that
        }
        */

        // Event this thing not works in if..else also
        // same way don't work with varible also

        /*
          
         char a = "A";
         if (a) {
            System.out.println("variable has some value");
        }
        */



        // Some time you should ""Dry Run"" the program to understand how things actually work
        // what is execution order
        // where the program control(each line of code that visited while execution of program one by one) goes


        

        // if while loop is not executed in our program (as per condition) still program gives error.  
        /*
        i = 10;
        while (i < 5){  // condition false loop will not execute
            int j = 19;
            j++;

            // some invalide code
            fajjfjflkfjdlf;    
        }
        */

        // Program must be valid program wheather condition meet or false. 



        /******************* Do while Loop *******************/

        // Execute at least once even condition is false.

        i = 1;
        while(i < 0)        // Condition false
        {       
            System.out.println("While loop executed " + i);
            i--;
        }

        do{
            System.out.println("Do While loop executed " + i);
            i--;
        }while(i < 0);  // At last semicolon. Do not miss it 


        i =5;
        do{
            System.out.println("Again Do While executed " + i);
            i--;
        }while(i != 0);  // At last semicolon. Do not miss it 




        /******************* For Loop *******************/
        // for ( int i = 0; i < 5 ; i++ )       // 'i' is already created so we can not use variable 'i' 
        for ( int j = 0; j < 5 ; j++ ){     
            // declaration, condition , updation(increment/decrement)

            // The variable 'j' is decalred in local scopt of main method. and it stay untill the loop terminate 
            // now this thing make sense how we can use syntax like 
            /* 
             int i;
             for ( i = 0; i < n; i++ ){
                // stmt
            }
            */

            // Another thing is, Above exmple even 'i' is inside the for loop still it give error because 'i' is already decalred above. But if it is function/method then we can create i inside it and it not give error because, it creates it's local scope inside it.  

            System.out.println("hi " + j);

        }   
        // For loop ends varaible 'j' is destroyed 


        // Print even numbers
        for (int n = 1; n < 5 ; n++)
        System.out.print( (2*n) + " ");

        System.out.println();           // println() by default gives a new line
        
        // Print odd numbers
        for (int n = 1; n < 5 ; n++)
            System.out.print( (2*n+1) + " ");


        // If for loop have only one line then brackets are optional same thing with if condition


        // Reverse for loop
        for ( int n = 10 ; n>5; n--){
            System.out.print(n + " ");
        }
        System.out.println();


        // One more example of for loop
        for ( int n = 1 ; n != 10; ++n){
            System.out.print(n + " ");
        }
        System.out.println();

        // conditionals : >, <, !=
        // We can use post increment also, output will not change.





        /******************* break ***** continue *******************/
        
        for( int i4 = 1 ; i4 < 10 ; i4++ ){
            if(i4 ==3)
                continue;
            System.err.println("Statement executed " + i4);
            if (i4 == 7)
                break;
        }
        
        // Generally,
        // Continue statement added at the starting of the loop so that after that any statement will not execute and the iteration will skip 
        // Break statement added at the last so that after that loop will not execute

        // But it depens on your code what is your need and logic
    }
}
