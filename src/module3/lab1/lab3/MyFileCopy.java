package module3.lab1.lab3;

import java.io.*;

public class MyFileCopy {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        OutputStream out  = System.out;
        try {
            inputStream = new BufferedInputStream(new FileInputStream("D:\\21.txt"));
            outputStream = new BufferedOutputStream(new FileOutputStream("D:\\Folder_for_project\\MyFileCopy.txt"));

            int oneByte;
            while ((oneByte = inputStream.read()) != -1) {
                outputStream.write(oneByte);
                out.write((char)oneByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
