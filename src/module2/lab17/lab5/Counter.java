package module2.lab17.lab5;

public class Counter implements Runnable {
    private final Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        System.out.println("Start counting");
        for (int i = 0; i < 1000; i++) {
            synchronized (storage) {
                try {
                    storage.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                storage.increment();
            }
        }

        System.out.println("Finished counting");
    }

}
