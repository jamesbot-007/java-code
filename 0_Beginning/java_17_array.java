public class java_17_array {
    public static void main(String[] args) {
        
        // Not same as C/C++
        // int arr[];   // give error



        // Different ways of array creation
        int[] arr;
        // Declaration
       
        
        int[] arr2 = new int[5];
        // Decalre + allocate memory of 5 elements in heap
        // then initialize
        arr2[0] = 1;
        arr2[2] = 2;

        int[] arr3 = {1,2,3};
        // Declare + Initialize array

        // print array
        // We can not print array directly by using it's name. It give array's base address
        System.out.println(arr3);       
        // Although, we can access one element at a time
        System.out.println(arr3[0]);
        System.out.println(arr3[2]);
        // this is native ( easy, simple, not advance) way to acccess the elements


        // ## Accessing elements ##
        // To access entire array and array size is large
        // We need to traverse array using loop
        System.out.println("Use array traversal");
        for ( int i =0 ; i < 3 ; i++){
            System.out.println(arr3[i]);
        }

        // ## Notes ##
        // int[3] arr3 = {1,2,3};       // Do not specify size like this. it give error. There is no need to specify size. java automatically take it
        // if arrays has size = 5 then we can store elements from 0 to 4. not 5.    From 0 to 4 there are total 5 elements 

        // float array
        float[] f_arr = {10,20,30};

        // float[] f_arr2 = {10.1,20.2,30.3};           // give erroronous behavior
        float[] f_arr2 = {10.1f,20.2f,30.3f};           // valid syntax


        // String array
        String[] s_arr = { "Apple", "banana", "cherry"};


        // length of array
        System.out.println("length = "  + arr3.length);

        // we can use it in for loop while traversing for loop



        // For each loop
        // it is forEach loop still we use "for" keyword keep in mind
        for(int element : arr3){
            System.out.println(element);
        }



        // Multi dimentional Array

        // 2D array : Each element of 1D array has reference of another OR pointing to another array. 
        // 2D array is array of arrays. In 2D array elements of array are actually an array(another array).
        
        

        int[][] arr4 = new int[3][];      // specify outer array size  and inner index wwill setted by java automatically.
        int[][] arr5 = new int[2][3];
        // Both are valid

        System.out.println("length of arr4 = " + arr4.length);
        System.out.println("length of arr5 = " + arr5.length);
        System.out.println("length of arr5[0] = " + arr5[0].length);
        System.out.println("length of arr5[1] = " + arr5[1].length);
        // System.out.println("length of arr5[2] = " + arr5[2].length); // indexOutOfBounds error
        // At each index of the array there is another array.


        // set element
        arr5[0][0] = 10;
        arr5[0][1] = 20;
        arr5[0][2] = 30;
        arr5[1][0] = 40;
        arr5[1][1] = 50;
        arr5[1][2] = 60;
        // arr5[2][1] = 10;         // give index out of bound error
       

        // Access element
        System.out.println(arr5[1][2]);

        // int[][] arr5 = new int[][];
        // here we have to set outer index otherwise it will give error 

        
        // Traversal of multi dimentional array requires nested loops
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[0].length; j++) {
                System.out.print(arr5[i][j] + " " );
            }
            System.out.println();
        }


        // Visualize 2D array as Table
        // most of the time we use 1D or 2D array. in rare case we use 3D array
        // After 3d there is not easy to visualise 



        // ## Check ##
        int[][] arr6 = new int[2][];      
    
        // if 2nd dimention is automatically managed by java then it can be diff
        // first let's check length 
        // System.out.println(arr6[0].length);  It say not setted it is "null"

        arr6[0][0] = 101;
        arr6[0][1] = 102;
        arr6[1][0] = 201;
        arr6[1][1] = 202;
        // arr6[1][2] = 203; // give error 

        // Ans. if not specified array length still it should be same. otherwise it gives error.



    }
}
