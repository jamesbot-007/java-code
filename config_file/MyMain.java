import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyMain {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis);

            // Access properties
            String name = properties.getProperty("app.name");
            String version = properties.getProperty("app.version");
            String temp = properties.getProperty("temp.dir");
            String dbuser = properties.getProperty("db.user");

            System.out.println(name);
            System.out.println(version);
            System.out.println(temp);
            System.out.println(dbuser);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
