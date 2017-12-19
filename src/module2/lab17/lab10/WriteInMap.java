package module2.lab17.lab10;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WriteInMap implements Runnable {
    private Map<Integer, String> map = new ConcurrentHashMap<>();
    private int key;
    private String value;

    public WriteInMap(Map<Integer, String> map, int key, String value) {
        this.map = map;
        this.key = key;
        this.value = value;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " trying write a pair " + key + " = " + value);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        map.put(key, value);
    }
}
