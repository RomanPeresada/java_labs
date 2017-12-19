package module2.lab17.lab7_with_executors;


import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class BankTest {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String args[]) {

        Bank bank = new Bank(N_ACCOUNTS, INIT_BALANCE);
        Executor executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            executor.execute(new Transfer(bank, new Random().nextInt(N_ACCOUNTS), 1000));
        }



    }
}
