package module2.lab17.lab10;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public class ReadFromMap implements Callable<String> {
    private Map<Integer,String> map = new ConcurrentHashMap<>();
    private int key;

    public ReadFromMap(Map<Integer, String> map, int key) {
        this.map = map;
        this.key = key;
    }

    @Override
    public String call() throws Exception {
        System.out.print(Thread.currentThread().getName()+ " result is: ");
        return map.getOrDefault(key," not found");
    }
}
