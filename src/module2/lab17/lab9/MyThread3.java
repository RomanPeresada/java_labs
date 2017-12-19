package module2.lab17.lab9;

public class MyThread3 extends Thread {

    private final MyObject obj1;
    private final MyObject obj2;
    private final MyObject obj3;

    public MyThread3(MyObject obj1, MyObject obj2, MyObject obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public void run() {
        synchronized (obj3) {
            System.out.println("Thread 3: Holding lock 3...");
            System.out.println("Thread 3: Waiting for lock simple...");
            synchronized (obj1) {
                System.out.println("Thread 3: Holding lock simple...");
                System.out.println("Thread 3: Waiting for lock 2...");
                synchronized (obj2) {
                    System.out.println("Thread 3: Holding lock 2...");
                }
            }
        }
    }
}
