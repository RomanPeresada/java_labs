package module2.lab17.lab5;

public class Printer implements Runnable {
    private final Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(storage.get());
            synchronized (storage) {
                storage.notify();
            }
        }
    }
}
