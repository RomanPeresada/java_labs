package module2.lab17.lab5;

public class Test {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Thread counter = new Thread(new Counter(storage));
        Thread printer = new Thread(new Printer(storage));
        counter.start();
        printer.start();
    }
}
