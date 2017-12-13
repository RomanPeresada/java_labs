package module2.lab17.lab1;

public class Main {
    public static void main(String[] args) {
        MyTimeBomb myTimeBomb = new MyTimeBomb();
        Test test = new Test();
        Thread thread1 = new Thread(myTimeBomb);
        Thread thread2 = new Thread(myTimeBomb);
        Thread tests = new Thread(test);
        System.out.println("Starting threads");
        thread1.start();
        thread2.start();
        tests.start();
        System.out.println("Joining");
        try {
            tests.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("end program");


    }
}
