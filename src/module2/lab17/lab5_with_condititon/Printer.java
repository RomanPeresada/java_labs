package module2.lab17.lab5_with_condititon;

public class Printer implements Runnable {

    private final Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1);
                System.out.println(storage.getValue());
                storage.getLock().lock();
                try {
                    storage.getCondition().signal();

                } finally {
                    storage.getLock().unlock();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("print is over");
    }
}