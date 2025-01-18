public class java_17_practice_array2 {
    public static void main(String[] args) {
        // Another way of array reverse

        /* Logic
         * 1 2 3 4 5 6 7 8 9
         * Find mid point. here it is 5
         * then swap fist with last 1,9
         * swap second with second_last 2,8
         * same way, ....
         * 
         * if array has even length
         *  1 2 3 4
         * then mid = 2
         * 
         * both time mid is floor_of(length/2) 
         * floor is also known as "Greatest integer"
         * 
         * programming logic swap(i,l-1-i)  where,l=length of array
         * 
         * arr   = 1 2 3 4 5 6 7 8 9
         * index = 0 1 2 3 4 5 6 7 8
         * 
         * At index 0 we want index 8
         * At index 1 we want index 7
         * At index 2 we want index 7
         * At index 3 we want index 5
         * 
         * Let's form formula for it. ( Array length = 9)
         * i =0 and to get 8. 
         * i =1 and to get 7. 
         * we create formula. that satisfies this two lines then we see further
         *  can we do i+length ? no. then i=1 not statisfie
         * 
         * for i=1 we nee to get 7
         * length-1  
         * 9 - 1 = 8 But we want 7
         * seems good but we something is missing
         * 
         * fustrate.....
         * let's create formula. for i=2
         * i =2 and to get 6.
         * lenth - 1 => 9 - 1  => 8 but we want 6
         * 
         * We have to decrease 1, 2 like this
         * if ibserve this is the value that given to us by `i` so subtract it 
         * 
         * lenth-1-i
         * i = 1 => 9-1-1 => 7
         * i = 2 => 9-1-2 => 6
         * 
         * and for 0 we can subract 0 and nothing will change that is what we want beccaue at lenth-1 is statisfied but at that i=0 subracting will not make any change
         */

         int a = Math.floorDiv(5,2);  // return floor value of 5/2
         System.out.println(a);



        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.print("Original array: " );
        for(int e : arr)
            System.out.print(e + " ");
        System.out.println();
        
        int n = Math.floorDiv(arr.length, 2);

        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.print("After reversing array: " );
        for(int e : arr)
            System.out.print(e + " ");
        System.out.println();
    }
}
