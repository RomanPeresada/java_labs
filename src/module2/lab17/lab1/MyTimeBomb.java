package module2.lab17.lab1;

public class MyTimeBomb implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + " " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("I`m interrupted" + Thread.currentThread().getName());
            }
        }
        System.out.println(Thread.currentThread().getName()+ " Boom!!!");
    }

}
