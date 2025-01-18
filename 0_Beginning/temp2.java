public class temp2 {
    public static void main(String[] args) {

        // Different ways to create array.
        int arr[] = new int[10];
        int[] arr2 = new int[5];
        
        // Each elememnt of array is by deafult initialized with value 0.(Same as calloc() in C language) 
        System.out.println("arr[0] = "+ arr[0]);
        System.out.println("arr[1] = "+ arr[1]);

        // -----------------------------

        // creating a string by assigning it a string literal(value)
        String s = "World";


        // Creating String
        String s1 = new String("Hello");


        // creating string from an array of characters
        char ch[] = {'s','i','n','g'};
        String s2 = new String(ch);
        String s3 = "MyString";

        System.out.println(s2);
        System.out.println(s3);

        // ---------------------------------

        String s4 = "Once upon a time there is King";
        String[] stringArray = s4.split(" ");
        System.out.println(stringArray[0]);

        System.out.println("Index of = " +s4.indexOf('t'));
        System.out.println(s4.indexOf('t',15));
    

        // -------------------------------
        StringBuffer sb = new StringBuffer(s4);

        System.out.println("String Buffer = " +sb);
        
        System.out.println(sb.indexOf("King"));

        // System.out.println(sb.length());


        // sb.replace(start, end, length);
        // here start is inclusive and end is exclusive.
        sb.replace(sb.indexOf("King"),sb.length(), "Queen" );
        
        System.out.println("After changes = " +sb);




    }
}
