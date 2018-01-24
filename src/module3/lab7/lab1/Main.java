package module3.lab7.lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) - 20;
        }
        Arrays.sort(arr, (a, b) -> b.compareTo(a));
        System.out.println(Arrays.toString(arr));

        System.out.println(sumEven(arr, a -> a > 40));
        List<String> list = new ArrayList<>();
        list.add("Qwwqf");
        list.add("asdw");
        list.add("ewfa");
        list.add("asdw");
        list.add("Aaddwfe");
        printJStr(list, s -> s.toLowerCase().startsWith("a"));
        updateList(list, s -> s.toUpperCase());
        System.out.println(list);

    }

    private static int sumEven(Integer[] array, Predicate<Integer> predicate) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (predicate.test(array[i])) {
                res += array[i];
            }
        }
        return res;
    }

    private static void printJStr(List<String> list, Predicate<String> predicate) {
        for (String s : list) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }

    private static void updateList(List<String> list, MyConverter mc) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, mc.comvertStr(list.get(i)));
        }
    }
}
