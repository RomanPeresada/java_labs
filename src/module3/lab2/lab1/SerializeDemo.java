package module3.lab2.lab1;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee("Vasiliy", "Kiev", 123, 841);
        FileOutputStream fos = new FileOutputStream("serialize.lab1");
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(employee);
        }

        Employee employee1 = null;
        FileInputStream fis = new FileInputStream("serialize.lab1");
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            employee1 = (Employee)ois.readObject();
        }
        System.out.println(employee1);
    }
}
