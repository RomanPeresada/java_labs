package module2.lab17.semphare_test.sem;

import java.util.concurrent.atomic.AtomicInteger;

public class Cart {
    private AtomicInteger weight = new AtomicInteger(0);
    public void addWeight(){
        weight.getAndIncrement();
    }
    public void reduceWeight(){
        weight.getAndDecrement();
    }

    public int getWeight() {
        return weight.intValue();
    }
}
