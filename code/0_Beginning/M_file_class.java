import java.io.File;
import java.util.Date;

public class M_file_class {
    public static void main(String args[]) {
        File f = new File("M_text.txt");
        // System.out.println(args[0]);

        System.out.println(f.exists());

        System.out.println("\nRead, Write, Execute :-");
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.canExecute());

        System.out.println("getName : " + f.getName());
        System.out.println("getParent : " + f.getParent());
        System.out.println("getPath : " + f.getPath());
        System.out.println("isHidden : " + f.isHidden());
        System.out.println("length : " + f.length());
        System.out.println("lastModified : " + new Date(f.lastModified()));

        System.out.println(f.isFile());
        System.out.println(f.isDirectory());

    }
}
