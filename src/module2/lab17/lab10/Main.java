package module2.lab17.lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Map<Integer, String> map = new ConcurrentHashMap<>();

        WriteInMap w1 = new WriteInMap(map, 2, "two");
        WriteInMap w2 = new WriteInMap(map, 3, "three");
        WriteInMap w3 = new WriteInMap(map, 1, "one");
        WriteInMap w4 = new WriteInMap(map, 4, "four");
        WriteInMap w5 = new WriteInMap(map, 5, "five");
        WriteInMap w6 = new WriteInMap(map, 6, "six");
        WriteInMap w7 = new WriteInMap(map, 7, "seven");

        List<WriteInMap> writeInMaps = new ArrayList<>();
        writeInMaps.add(w1);
        writeInMaps.add(w2);
        writeInMaps.add(w3);
        writeInMaps.add(w4);
        writeInMaps.add(w5);
        writeInMaps.add(w6);
        writeInMaps.add(w7);

        ReadFromMap r1 = new ReadFromMap(map, 1);
        ReadFromMap r2 = new ReadFromMap(map, 2);
        ReadFromMap r3 = new ReadFromMap(map, 3);
        ReadFromMap r4 = new ReadFromMap(map, 4);
        ReadFromMap r5 = new ReadFromMap(map, 5);
        ReadFromMap r6 = new ReadFromMap(map, 6);
        ReadFromMap r7 = new ReadFromMap(map, 7);

        List<ReadFromMap> readFromMaps = new ArrayList<>();
        readFromMaps.add(r1);
        readFromMaps.add(r2);
        readFromMaps.add(r3);
        readFromMaps.add(r4);
        readFromMaps.add(r5);
        readFromMaps.add(r6);
        readFromMaps.add(r7);

        for (WriteInMap write : writeInMaps) {
            executorService.submit(write);
        }
        Thread.sleep(3000);

        for (ReadFromMap read : readFromMaps) {
            try {
                System.out.println(executorService.submit(read).get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        try {
            System.out.println("if key = 1123, result = " + executorService.submit(new ReadFromMap(map,1123)).get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
