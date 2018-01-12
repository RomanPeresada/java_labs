package module3.lab1.lab4;

import java.io.*;
import java.util.Scanner;

public class ReplacementInFileWithoutTempFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name of file:");
        File file = new File(scanner.nextLine());
        if (file.isFile()) {
            try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
                String s;
                while ((s = raf.readLine()) != null) {
                    if (s.contains("public")) {
                        raf.seek(raf.getFilePointer() - s.length() - 2);
                        raf.write(s.replaceAll("public", "private").getBytes());
                    }
                }
                raf.seek(0);
                while (raf.getFilePointer() < raf.length()) {
                    System.out.println(raf.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
