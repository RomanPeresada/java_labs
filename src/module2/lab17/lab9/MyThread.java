package module2.lab17.lab9;

public class MyThread extends  Thread {

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
        synchronized (obj1) {
            System.out.println("Thread simple: Holding lock simple...");
            System.out.println("Thread simple: Waiting for lock 2...");
            synchronized (obj2) {
                System.out.println("Thread simple: Holding lock 2...");
                System.out.println("Thread simple: Waiting for lock 3...");
                synchronized (obj3) {
                    System.out.println("Thread simple: Holding lock 3...");
                }
            }
        }
    }
}
