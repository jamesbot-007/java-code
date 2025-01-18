public class Java_21_practice {
    static int sumOfNNumbers(int n){

        if (n<=0){
            return 0;
        }
        return n + sumOfNNumbers(n-1);
    }

    static void forwardStarPattern( int n){
        for (int i=0; i < n ; i++){
            for (int j=0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void reverseStarPttern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void forwardStarPattern_r(int n){
        if (n>0){
            forwardStarPattern_r(n-1); 
            for (int i=0; i < n ; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // goes for 5 then 4 then 3 then 2 then 1  
        // print 1 star, then print 2 stars , 3 star ....

    }
    static void reverseStarPattern_r(int n){
        if (n>0){

            for (int i=0; i < n ; i++){
                    System.out.print("* ");
            }
            System.out.println();
            reverseStarPattern_r(n-1);

            // first print 5 start then, run same function for printing 4 start then, same function for 3 star
        }
    }

    public static void main(String[] args) {
        int result = sumOfNNumbers(2);
        System.out.println(result);

        // forwardStarPattern(5);
        // reverseStarPttern(5);

        forwardStarPattern_r(5);
        // reverseStarPattern_r(5);
    }
}

//  5 
//  5 4 3 2 1 0