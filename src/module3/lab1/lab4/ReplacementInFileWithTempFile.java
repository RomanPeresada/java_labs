package module3.lab1.lab4;

import java.io.*;

public class ReplacementInFileWithTempFile {
    public static void main(String[] args) throws IOException {
        BufferedReader readerFromOriginal = null;
        BufferedReader readerFromTemp = null;
        Writer writerInOriginal = null;
        Writer writerInTemp = null;
        try {
            File file = new File("C:\\Users\\Ам\\IdeaProjects\\lab1_4\\src\\IsValid2.txt");
            readerFromOriginal = new BufferedReader(new FileReader("C:\\Users\\Ам\\IdeaProjects\\lab1_4\\src\\Main.java"));
            writerInTemp = new FileWriter(file);
            System.out.println("can write: " + file.canWrite());
            System.out.println("is file: " + file.isFile());
            String oneString;
            while ((oneString = readerFromOriginal.readLine()) != null) {
                writerInTemp.write(oneString.replaceAll("public", "private"));
                writerInTemp.write("\n");
                //System.out.println(oneString);
            }
            assert readerFromOriginal != null;
            readerFromOriginal.close();
            assert writerInTemp != null;
            writerInTemp.close();
            readerFromTemp = new BufferedReader(new FileReader(file));
            writerInOriginal = new FileWriter("C:\\Users\\Ам\\IdeaProjects\\lab1_4\\src\\Main.java",false);
            while ((oneString = readerFromTemp.readLine()) != null) {
                writerInOriginal.write(oneString);
                writerInOriginal.write("\n");
            }
        } finally {
            assert readerFromTemp != null;
            readerFromTemp.close();
            assert writerInOriginal != null;
            writerInOriginal.close();
        }

    }
}
