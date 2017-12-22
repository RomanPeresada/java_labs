package module2.lab18;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        String name = "test";
        try {
            properties.load(new FileReader(String.format("C:\\Users\\Ам\\Desktop\\%s.properties", name)));
        } catch (IOException e) {
            System.out.println("File isn`t upload");
        }
        System.out.println(properties);
        String login = properties.getProperty("login");
        String password = properties.getProperty("password");
        System.out.printf("ur login is \"%s\", ur password is \"%s\"", login, password);
    }
}
