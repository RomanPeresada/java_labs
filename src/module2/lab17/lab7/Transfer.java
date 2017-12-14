package module2.lab17.lab7;

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
        int countOfLoop = random.nextInt(bank.getNumberAccounts() - 1);
        while (countOfLoop-- > 0) {
            int amount = random.nextInt(max);
            int randomAccount = random.nextInt(bank.getNumberAccounts() - 1);
            bank.transfer(from, randomAccount, amount);
        }
     //    System.out.println(Thread.currentThread().getName()+" finished");
    }
}