package module3.lab2.lab4;

import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alisa", "Langraf", 19);
        User user2 = new User("Mur", "Tyan", 22);
        Collection<User> users = new HashSet<>();
        users.add(user);
        users.add(user2);
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream("users.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeInt(users.size());
            for (User us:users){
               oos.writeObject(us);
           }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            System.out.println(readUser("users.ser"));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static Collection<User> readUser(String file) throws IOException, ClassNotFoundException {
        Collection<User> users = new HashSet<>();
        FileInputStream fis = new FileInputStream(file);
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            int size = ois.readInt();
            for (int i = 0; i < size; i++) {
                User user = (User) ois.readObject();
                users.add(user);
            }
        }
        return users;
    }
}
