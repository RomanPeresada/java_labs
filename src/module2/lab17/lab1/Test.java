package module2.lab17.lab1;

public class Test implements Runnable {
    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            System.out.println("Test thread");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("test thread is interrupted");
            }
        }
    }
}
