package module2.lab18.lab4;

import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] programs = new String[4];
        programs[0] = "notepad.exe";
        programs[1] = "D:\\Program files\\Steams\\Steam.exe";
        programs[2] = "calc.exe";
        programs[3] = "C:\\Program Files\\Git\\git-bash.exe";
        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = runtime.exec(programs[new Random().nextInt(programs.length)]);
            Thread.sleep(5000);
            process.destroy();
        } catch (InterruptedException e) {
            e.getCause();
            e.getMessage();
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}
