public class java_17_practice_array {
    public static void main(String[] args) {

        // sum array elements
        int[] array = { 10, 1, 12 };
        
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);

        // find given number is present in array or not
        int num = 0;
        boolean isPresent = false;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                isPresent = true;
                break;
            }
        }
        if(isPresent){
            System.out.println("Number found");
        }
        else{
            System.out.println("Not found");
        }


        // Avg. marks
        int[] marks = {80, 85, 82};
        sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        float avg = sum / (float) array.length;
        System.out.format("Average = %.2f \n" , avg );
        
// Note : System.out.format() by deafult doesn't add new line 

        // reverse the array
        for (int i = array.length-1 ; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // find  minimum and maximum values from the array

        // java has some special variable to get minimum and maximum values of integer datatype.
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        // Actully, they are constant values defined in Integer class

        System.out.println("min : " + min); 
        System.out.println("max : "+ max); 

        // initialize the max and min values with this because for integer any value can not smlleer than Integer.MIN_VALUE and same for max.
        
        for (int i = 0; i < array.length; i++) {

            // find maximum
            if(array[i] > min )
                min = array[i];
            
            // find minimum
            if (array[i] < max)
                max = array[i];

        }

        // to avoid confusion
        int maximum_value = min;
        int minimum_value = max;

        // final result
        System.out.println("Maximum value : " + maximum_value);
        System.out.println("Minimum value : " + minimum_value);


        // Find array is sorted or not
        boolean isSorted = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] > array[i]) {
                isSorted = false;
            }
        }
        if (isSorted) 
            System.out.println("Array is sorted");
        else
            System.out.println("Not a sorted array");

    }
}
