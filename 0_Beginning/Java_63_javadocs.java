

/** 
 * This class is to demonstrate the java doc 
 * this is <b>bold</b> <p>paragraph</p>
 * @author Mark
 * @version 1.0
 * @since 2024
 * @see <a href="file:///D:/Code%20Playground/12_Java/Java%20Tutorial/src/0_Beginning/doc/Java_63_javadoc.html">Java Docs</a>
*/

// fist line is the documentation section
// we can render html by adding to the 
// java doc should be enclosed in /**  */
// see is the link or suggestion to visit

// Recap
// each java class is by defulat child class of java.lang.object class
// if package is not delared in java file then it is called default package 

public class Java_63_javadocs{

    // first line is description
    /**
     * This is method that simply sum two numbers
     * @param x an integer value 
     * @param y an integer value
     * @return type is int.
     * @throws ArithmeticException
     */
    public static int sum(int x, int y) throws ArithmeticException{

        if ((x < 0) && (y < 0)){
            throw new ArithmeticException("x and y can not be less than 0");
        }

        System.out.println(x+y);
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
