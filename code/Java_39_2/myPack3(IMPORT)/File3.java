// If you want to import java file and it is public then you can import it like this:

import com.google.render.File1;
import com.google.render.File2;

// or you can use the following,
// import com.google.render.*;

public class File3 {
    public static void main(String[] args) {

        // we can succesfully create object without gettting error
        File1 obj1 = new File1();
        File2 obj2 = new File2();

        System.out.println("Done");

    }

}

// complile : javac File3.java
// run : java File3
