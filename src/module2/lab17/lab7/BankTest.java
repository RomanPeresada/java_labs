package module2.lab17.lab7;

import java.util.Random;

public class BankTest {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String args[]) {
        Bank bank = new Bank(N_ACCOUNTS, INIT_BALANCE);
        Random random = new Random();
        Thread[] threads = new Thread[N_ACCOUNTS];
        for (int i = 0; i < N_ACCOUNTS; i++) {
            int from = random.nextInt(N_ACCOUNTS - 1);
            threads[i] = new Thread(new Transfer(bank,from, 1000));
            threads[i].start();
        }
    }
}
