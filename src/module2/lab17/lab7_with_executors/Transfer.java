package module2.lab17.lab7_with_executors;

import java.util.Random;

public class Transfer implements Runnable {
    private Bank bank;
    private int from;
    private int max;

    public Transfer(Bank bank, int from, int max_amount) {
        this.bank = bank;
        this.from = from;
        max = max_amount;
    }

    @Override
    public void run() {
        Random random = new Random();
        int to = random.nextInt(bank.getNumberAccounts());
        int amount = random.nextInt(max);
        int countOfLoop = random.nextInt(bank.getNumberAccounts());
        while (countOfLoop-- > 0) {
            bank.transfer(from, to, amount);
        }
    }
}
