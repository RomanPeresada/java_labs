package lab2_5.lab2_5_5;

import java.util.Random;

public class InitTest {
    private int id;
    private static int nextId;

    static {
        Random random = new Random();
        nextId = random.nextInt(999) + 1;
    }

    {
        nextId++;
    }

    public InitTest() {
        id = nextId;
    }

    public int getId() {
        return id;
    }
}
