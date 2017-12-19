package module2.lab17.semphare_test.simple;

import java.util.concurrent.Semaphore;

public class MyThread implements Runnable {

    private Semaphore semaphore;

    public MyThread(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " waiting for a place");
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " get a place");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " went from place");
        semaphore.release();
    }
}
