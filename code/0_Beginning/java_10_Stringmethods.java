public class java_10_Stringmethods {
    public static void main(String[] args) {
        String s = "Java Tutorial";

        // We can not manipulate sting. Some methods of java looks like they change
        // existing string such as lowercase. Actually it creates new string which is
        // lowercase version of existing string.

        int len = s.length();
        System.out.println(len);

        // make entire string lowercase
        String s2 = s.toLowerCase();
        System.out.println(s2);

        // uppercase
        String uString = s.toUpperCase();
        System.out.println(uString);

        s = s.toUpperCase();
        System.out.println(s);
        // now, variable 's' points to new sting who has uppercase letters
        // but original string will not change in memory. Only the reference pointing to
        // another string

        String t = "      hello world            ";
        System.out.println(t);
        System.out.println(t.trim());

        System.out.println(s.substring(5));
        System.out.println(s.substring(5, 10));

        System.out.println(s.substring(0));
        System.out.println(s.substring(0, 13));
        // It works ( start, end)✅ not like (start,end-1)❌

        int a = "h".length();
        System.out.println(a);

        /*
         * IDE gives lable to arguments so that we can know what is first argument what
         * is 2nd argument like that it gives readability and better understanding
         */

        // replace character
        String replace = s.replace("O", "0");
        System.out.println(replace);
        // replace sub-string
        replace = s.replace("JAVA", "PYTHON");
        System.out.println(replace);

        replace = s.replace("O", "Oooo");
        System.out.println(replace);

        System.out.println(s.startsWith("JAVA")); // return boolean value
        System.out.println(s.endsWith("."));

        // character at which index
        System.out.println(s.charAt(5));

        // index of given substring ( if multiple then return first occurrence )
        System.out.println(s.indexOf("ORIAL"));

        // provinde starting index for searching
        System.out.println("Twinkle Twinkle little star".indexOf("Twinkle", 3));
        System.out.println("Twinkle Twinkle little star".indexOf("Twinkle", 16)); // return -1 means, not found

        System.out.println("star Twinkle Twinkle little star".indexOf("star")); // first occurence from start
        System.out.println("star Twinkle Twinkle little star".lastIndexOf("star")); // first occurrence from last

        // give start index.
        // check from index 0 to 7 if 'star' is present or not
        System.out.println("last indexof with start value = " + "Twinkle star Twinkle little star".lastIndexOf("star", 12));

        // To check two strings are equal or not use equals() method insted of '=='
        // operator
        String p = "Leo";
        System.out.println(p.equals("Leo"));

        /*
         * method is 'equals'. not 'equal' remember that
         * 
         * == operator check the refereence is same or not
         * equals() check content
         * 
         * String s1 = new String("hello");
         * String s2 = new String("hello");
         * 
         * System.out.println(s1 == s2); // false
         * System.out.println(s1.equals(s2)); // true
         * 
         */

        // equals() is case sensitive, equalIgnorecase() is not case sensitive.
        System.out.println("hello".equalsIgnoreCase("HElLo"));





        // Escape sequence chracter 
        // Combinaton of character written as more than one character and consider as one character
        System.out.println("\tHello \nWorld\\ \"");
    }

}
