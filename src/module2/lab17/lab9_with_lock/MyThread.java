package module2.lab17.lab9_with_lock;

public class MyThread extends Thread {

    private final MyObject obj1;
    private final MyObject obj2;
    private final MyObject obj3;

    public MyThread(MyObject obj1, MyObject obj2, MyObject obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    @Override
    public void run() {
        obj1.getLock().lock();
        try {
            System.out.println("Thread simple: Holding lock simple...");
            System.out.println("Thread simple: Waiting for lock 2...");
            obj2.getLock().lock();
            try {
                System.out.println("Thread simple: Holding lock 2...");
                System.out.println("Thread simple: Waiting for lock 3...");
                obj3.getLock().lock();
                try {
                    System.out.println("Thread simple: Holding lock 3...");
                } finally {
                    obj3.getLock().unlock();
                }
            } finally {
                obj2.getLock().unlock();
            }
        } finally {
            obj1.getLock().unlock();
        }
    }
}