package module3.lab1.lab5;

import java.io.*;
import java.util.Scanner;

public class AccountingUser {
    private File file = new File("users.txt");
    private RandomAccessFile raf;

    public AccountingUser() throws IOException {
        raf = new RandomAccessFile(file, "rw");
        if (!file.isFile()) {
            file.createNewFile();
        }
        raf.write("Sidorov:5\n".getBytes());
        raf.write("Govga:3\n".getBytes());
        raf.write("Bogdan:1\n".getBytes());
        raf.write("Danilina:3\n".getBytes());
        raf.write("Alex:2\n".getBytes());
        raf.write("Alisa:1\n".getBytes());
    }


    public static void main(String[] args) {

        try {
            AccountingUser accUser = new AccountingUser();
            accUser.printFile();
            Scanner scanner = new Scanner(System.in);
            accUser.testUsers(scanner.nextLine());
            accUser.testUsers(scanner.nextLine());
            accUser.testUsers(scanner.nextLine());
            accUser.testUsers(scanner.nextLine());
            accUser.printFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testUsers(String nameUser) throws IOException {
        String s;

        raf.seek(0);
        while ((s = raf.readLine()) != null) {
            int index = s.indexOf(":");
            if (index != -1 && s.substring(0, index).equals(nameUser)) {
                int countOfVisit = Integer.parseInt(s.substring(index + 1, s.length()));
                String newRecord = nameUser + ":" + (++countOfVisit) + "\n";
                raf.seek(raf.getFilePointer() - s.length() - 1);
                raf.write(newRecord.getBytes());
                return;
            }
        }
        String newRecord = nameUser + ":1\n";
        raf.write(newRecord.getBytes());
    }

    public void printFile() throws IOException {
        String temp;
        raf.seek(0);
        while ((temp = raf.readLine()) != null) {
            System.out.println(temp);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        raf.close();
    }
}

