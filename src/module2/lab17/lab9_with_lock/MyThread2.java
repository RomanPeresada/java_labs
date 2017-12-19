package module2.lab17.lab9_with_lock;

public class MyThread2 extends Thread {
    private final MyObject obj1;
    private final MyObject obj2;
    private final MyObject obj3;

    public MyThread2(MyObject obj1, MyObject obj2, MyObject obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public void run() {
        obj2.getLock().lock();
        try {
            System.out.println("Thread 2: Holding lock 2...");
            System.out.println("Thread 2: Waiting for lock 3...");
            obj3.getLock().lock();
            try {
                System.out.println("Thread 2: Holding lock 3...");
                System.out.println("Thread 2: Waiting for lock simple...");
                obj1.getLock().lock();
                try {
                    System.out.println("Thread 2: Holding lock simple...");
                } finally {
                    obj1.getLock().unlock();
                }
            } finally {
                obj3.getLock().unlock();
            }
        } finally {
            obj2.getLock().unlock();
        }
    }
}