// Reuslting datatype after arithmatic operation

public class java_07 {
    public static void main(String[] args) {

        // In java a number with decimal values consider as double by default
        float a = 9.2f;
        float b = 6.5f + 6;
        // float b = 6.5 + 6;           // Give error
                                        // because variable type is float and assigned value is double(i.e. double + int )
        double d = 6.5 + 6;
        System.out.println(b);


        short x = 7 ;
        int y = 8 ;
        System.out.println(x+y);

        // 'sout' for System.out.println();


        /* It is concept of type conversion     [By computer]
         * OR widening Casting (automatically)
         * samall -> big    char -> int
         * 
         * Another thing is Type costing        [By User/Programmer]
         * OR Narrowing casting (manually)
         * big -> small    int -> char 
         */

         // increment decrement operator

        int i = 1;
        System.out.println(i++);
        System.out.println(i);

        System.out.println(++i);
        System.out.println(i);


    }
}
