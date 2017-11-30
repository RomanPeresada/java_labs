package module2.lab15.lab2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        List<String> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add("number_" +  random.nextInt(10));
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
