import java.io.*;

public class Java_67_practice {
    public static void main(String[] args) {
        File file = new File("table.txt");

        int num = 5;
        String table="";

        try {
            file.createNewFile();
            for (int i = 1; i <= 10; i++) {
               table += num + " X " + i + " = " + num*i + "\n"; 
            }

            // System.out.println(table);

            FileWriter fileWriter = new FileWriter("table.txt");
            fileWriter.write(table);
            System.out.println("Done");
            fileWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
