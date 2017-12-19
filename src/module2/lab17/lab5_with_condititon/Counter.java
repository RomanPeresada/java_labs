package module2.lab17.lab5_with_condititon;

public class Counter implements Runnable {

    private final Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            storage.getLock().lock();
            try {
                storage.getCondition().await();
                storage.increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                storage.getLock().unlock();
            }

        }
        System.out.println("Increment is over");
    }
}
