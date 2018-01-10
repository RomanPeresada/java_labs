package module3.lab1.lab1;

import java.io.File;
import java.util.Arrays;

public class MyFilesList {
    public static void main(String[] args) {
        File file = new File("\\Users\\Ам\\IdeaProjects\\lab1_4\\src");
        System.out.println(Arrays.toString(file.list()));
        System.out.println("can read:" + file.canRead());
        System.out.println("can execute: " + file.canExecute());
        System.out.println("can write: 7" + file.canWrite());
        System.out.println("absolute path: "+ file.getAbsolutePath());
        System.out.println("path: "+ file.getPath());
        System.out.println("is absolute: " + file.isAbsolute());
        System.out.println("parent: "+file.getParent());
        System.out.println("name: " + file.getName());
        System.out.println("is file: "+ file.isFile());
        System.out.println("is directory: "+ file.isDirectory());

    }
}
