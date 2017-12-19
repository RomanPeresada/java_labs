package module2.lab17.lab5_with_condititon;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        new Thread(new Printer(storage)).start();
        new Thread(new Counter(storage)).start();
    }
}
