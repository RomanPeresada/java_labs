package module2.lab17.lab6;

import java.util.IdentityHashMap;

public class DiningHall implements Runnable {
    static int pizzaNum;
    static int studentID = 1;
    private static int countOfCalled;

    public void makePizza() {
        pizzaNum++;
        countOfCalled++;
    }

    public boolean isMakeTenPizza() {
        return countOfCalled == 10;
    }

    public synchronized void servePizza() {
        String result;
        if (pizzaNum > 0) {
            result = "Served ";
            pizzaNum--;
        } else result = "Starved ";
        System.out.println(result + studentID);
        studentID++;
    }

    @Override
    public void run() {
        servePizza();
    }

    public static void main(String[] args) {
        DiningHall d = new DiningHall();
        for (int i = 0; i < 20; i++)
            d.makePizza();
        for (int i = 1; i <= 20; i++) {
            new Thread(d).start();
        }
    }
}
