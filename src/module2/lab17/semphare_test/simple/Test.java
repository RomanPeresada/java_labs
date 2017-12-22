package module2.lab17.semphare_test.simple;

import java.util.concurrent.Semaphore;

public class Test {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 7; i++) {
            new Thread(new MyThread(semaphore)).start();
        }
    }
}
