
// File handling 
// There are many ways to for file handling but we'll see basic operations so that you can atlest create something but not efficiently
// for efficiency you can search on Google, YouTube, ChatGPT, etc ...

// java file io is supported by java.io.*; package

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class File1 {

    public static void method1(File obj) throws IOException {
        obj.createNewFile();
    }

    public static void main(String[] args) {

        // Create object
        File file = new File("text.txt"); // it must require an argument
        /*
         * try {
         * file.createNewFile(); // create if not exists
         * } catch (Exception e) {
         * System.out.println(e.getMessage());
         * }
         */

        // The method createNewFile() throws Exception we need to handle it. there are
        // two ways to do this
        // 1. use try..catch : that we seen above
        // 2. declare exceotion in method's signature : that we can see in method1().
        // or you can define exception in main() method's signature because even if you
        // create another method still when you use in main() method you need to handle
        // exception(s).

        try {
            method1(file);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }


        // code to write content in file.
        try{

            FileWriter writer = new FileWriter("text.txt");
            writer.write("hello world!\nnew line");
            writer.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        // Reading a file
        File myfile = new File("text.txt");
        try {
            
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // delete file
        if (myfile.delete()){
            System.out.println(myfile.getName() + " has been deleted");
        }else{
            System.out.println(myfile.getName() + " fail to be deleted");
        }


    }
}
