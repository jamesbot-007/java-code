public class java_16_practice_loop {
    public static void main(String[] args) {

        // Pattern
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            // Inner loop is same as above only outer loop's condition is checked
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Sum of first 'n' even numbers
        n = 2;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (2 * i);
        }
        System.out.println(sum);

        // Write multiplication table of given number
        n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n" , n, i, (n*i));
        }
        System.out.println();
        
        // reverse table
        for (int i = 10; i >= 1; i--) {
            System.out.format("%d X %d = %d\n" , n, i, (n*i));
        }
        System.out.println();



        // factorial
        int fact = 1;
        n = 5;
        for (int i = 1; i <= n; i++){ // make sure loop not start from 0 otherwise answer = 0
            fact *= i;
        }
        System.out.println(fact);

        int i =1;
        fact = 1;
        while(i <= n){     
            fact *= i;
            i++;
        }
        System.out.println(fact);


        // pattern using while loop
        int i1 = 0;
        int n1= 5;
        while(i1 < n1){
            int i2 = 0;
            while(i2 < i1 ){
                System.out.print("* ");
                i2++;
            }
            System.out.println();
            i1++;
        }
        i1 = 5;
        n1= 0;
        while(i1 > n1){

            // Inner loop is same as above only outer loop's condition is checked
            int i2 = 0;
            while(i2 < i1 ){
                System.out.print("* ");
                i2++;
            }
            System.out.println();
            i1--;
        }

        // Sum the result of multiplication table 
        int num = 8;
        sum = 0;
        for ( int n2 = 0 ; n2 <= num ; n2++){
            sum += 8*n2;
        }
        System.out.println(sum);








        
    }
}