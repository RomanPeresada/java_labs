package module2.lab17.semphare_test.sem;


import java.util.concurrent.Semaphore;

public class Test {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        Cart cart = new Cart();
        Thread t1 = new AddWorker(cart,semaphore,"First");
        Thread t2 = new AddWorker(cart,semaphore,"Second");
        Thread red = new ReduceWorker(cart,semaphore,"Reduce");
        t1.start();
        t2.start();
        red.start();
        try {
            Thread.sleep(5000);
            red.interrupt();
            t1.interrupt();
            t2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
