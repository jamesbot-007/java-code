//  Byte stream
// it performs input(read), output(write) based on 8-bits (1 byte). Generally used to read, write text of file. 
// byte stream does not use any character encoding such as UNICODE.

// It is used for reading byte oriented data such as images, audio, video, etc.

import java.io.FileInputStream;
import java.io.FileOutputStream;




public class M_byte_stream {

    public static void input(String path){

        try{
            FileInputStream file = new FileInputStream(path);
            // It can throw an exception so surround it with try..catch

            System.out.println(file.available()); // no. of characters available in the file that we can read.

            // one character is encoded by 8 bits so it read  8 bits(1 byte ) at once
            int c = file.read();        // return -1 if file end or file is empty
            System.out.println("c = "+c);
            System.out.println((char)c); 


            // read whole file
            int i=0;
            while((i=file.read()) != -1){
                System.out.print((char)i);
            }
            file.close();

            System.out.println();
            
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
    
    
    public static void output(String path, String text){

        try {
            FileOutputStream file = new FileOutputStream(path);

            String s = text;
            
            // convert string to byte array
            byte[] b_arr = s.getBytes();

            file.write(b_arr);
            file.close();
            System.out.println("Success!");

        } catch (Exception e) {
            System.out.println(e);            
        }

    }

    public static void main(String[] args) {


        input("M_text.txt");
        output("M_text.txt", "A\nHello World !");

        
    }
}
