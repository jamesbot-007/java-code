// Character stream

// used to perfrom input output for 16-bit (Unicode)
// It supposrts all type of character encoding utf-8, ascii, unicode, utf-16, etc ...

// byte stream is byte oriented
// character stream is character oriented

import java.io.FileReader;
import java.io.FileWriter;

public class M_Character_Stream {
    public static void main(String[] args) {
        
        try {
            FileReader reader = new FileReader("M_text_2.txt");

            int c = reader.read();
            System.out.println("c = "+c);
            System.out.println((char)c);

        } catch (Exception e) {
            // TODO: handle exception
        }

        // same as byte stream
        // same for "fileWriter" class

    }
}
