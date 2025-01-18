public class Java_19_overloading {

    static void changeIndexZero(int[] arr, int val ){
        System.out.println("Array value at index zero is changed.");
        arr[0] = val;

    }
    // Method overloading

    // Two or more method can have same name with different no. of arguments(signature, parameters list), if data type is different still method overloading works. It is still changing parameters list.
    // data type, return value can be different 
    static void check( int a){
        System.out.println("You passed numeric values" + a);
    }
    static void check( char a){
        System.out.println("You passed character values" + a);
    }

    // ## if return type is different then method overloading not works

    // static char check( char a){      // Give error
    // }

    static void check( int a, int b){
        System.out.println("You passed 2 numeric values " + a + " " + b);
    }




    // ## vargs
    static int sum_numers(int... vargs) {

        // Inside the function it availabe as "vargs"
        int sum = 0;
        for (int e : vargs) {
            sum += e;
        }
        return sum;
    }

    static void sum_numers2(int a, int... vargs) {
        System.out.println("Fist argument : " + a);
        int sum = 0;
        for (int e : vargs) {
            sum += e;
        }
        sum = sum + a;
        System.out.println("Sum is "+sum);
    }

    public static void main(String[] args) {


        // Changing the method will not change the actual variable this is called "Call by value"
        // Argument A.K.A. actual parameter and Paremeter A.K.A. Formal parameter
        // When a method return nothing then we use void 
        // static method belongs to class not to object 


        // In case of array we pass we're passig the reference
        // means if we change array inside method then actual array will also change
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        changeIndexZero(arr, 10);
        System.out.println(arr[0]);

        // This is because we're passing the base address of array. and the method is also modifies the array using base address.
        // From C/C++ think like 'arr' is pointer pointing to a base address and then we can traverse ther array using pointer arithmatics. ptr++ going to base address(add size of array datatype to base address. we can get the value by dereferencing arr *(ptr++) ).

        // This is called "Call by reference".


        // # Method overloading
        check(1);
        check('a');
        check(1,2);


        // Parameter VS Argument
        // Function definition have parameters
        // Function call have Arguments

        /* -------------------------------------------------------------------------- */
        // # Vargs
        System.out.println("Vargs Parameter");
        int result = sum_numers(10, 20);
        System.out.println(result);

        // do not need to pass array as argument we can pass values or variable
        // containing value
        // we can pass arguments seprated by comma
        result = sum_numers(10, 20, 30, 40);
        System.out.println(result);

        // Passing the arguments to "vargs" is optional. That's we should put at the end
        // of parameter list
        result = sum_numers();
        System.out.println(result);

        // we can put compolsory parameters in the starting of parameter list
        // if we don't give any arguments then it give error
        // result = sum_numers2(); // error
        sum_numers2(10);
        

    }
}
