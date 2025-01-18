public class Java_20_recursion {

    static int factiorial_i(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static int factiorial_r(int n) {
        if (n >= 1) {
            if (n == 1 || n == 0)
                return 1;
            else
                return (n * factiorial_r(n - 1));
        }
        return 0;
    }

    static void fibonacci_i(int n) {

        int a = 0;
        int b = 1;
        System.out.print(a + " ");

        int c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            b = a;
            a = c;

        }
        System.out.println();
        // 0 0 1 1 2 3 5 8

    }

    static int fibonacci_i2(int n) {

        int a = 0;
        int b = 1;

        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            b = a;
            a = c;

        }
       return c;

    }

    static int fibonacci_r( int n){
        if (n <= 1)
            return n;
    
        return fibonacci_r(n-1) + factiorial_r(n-2);
    }



    public static void main(String[] args) {
        // Function calling it self is called recursion
        int result = factiorial_i(5);
        System.out.println(result);

        result = factiorial_r(5);
        System.out.println(result);

        fibonacci_i(10); // Generate first 10 fibonacci numbers

        result = fibonacci_i2(10); // return 10th element of fibonacci series
        System.out.println(result);

        result = fibonacci_r(5);
        System.out.println(result);

    }
}
