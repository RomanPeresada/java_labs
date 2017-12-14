package module2.lab17.generate;

class Generator implements Runnable {

    @Override
    public void run() {

        System.out.println("Start generating a data...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Data is ready!");
        synchronized (this) {
            this.notify();
        }
    }
}

class Sender extends Thread {
    private final Generator generator;

    public Sender(String name, Generator generator) {
        super(name);
        this.generator = generator;
    }

    @Override
    public void run() {
        System.out.println("Waiting for a data " + getName() + " ...");
        synchronized (generator) {
            try {
                generator.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Data of " + getName() + " sent!");

    }
}


public class Test {
    public static void main(String[] args) {
        Generator generator = new Generator();
        Thread gener = new Thread(generator);
        gener.start();
        for (int i = 1; i <= 3; i++) {
            new Sender("sender" + i, generator).start();
        }

    }
}
