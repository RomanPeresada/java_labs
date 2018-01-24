package module3.lab7.lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = Stream.iterate(10, x -> x + 10)
                .limit(10)
                .map(x -> x / 2)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list);
        List<String> strings = new ArrayList<>();
        strings.add("dwqd");
        strings.add("qwWDWFDFwefqc");
        strings.add("asd2r");
        strings.add("dqwfewqcx");
        strings.add("dqwr32rfewsaas");
        strings.add("ADDWFFefwe");

        List<Person> people = new ArrayList<>();
        people.add(new Person(22, "O'Konnor", "male"));
        people.add(new Person(12, "Owen", "male"));
        people.add(new Person(15, "Runney", "male"));
        people.add(new Person(25, "SCholles", "male"));
        people.add(new Person(64, "SChudelle", "male"));
        people.add(new Person(26, "QWetwg", "female"));

        people.stream()
                .filter(p -> p.getAge() > 17 && p.getAge() < 28 && p.getGender().equals("male"))
                .forEach(System.out::println);


        strings.stream()
                .sorted((a, b) -> b.compareTo(a))
                .filter(a -> a.toLowerCase().startsWith("d"))
                .forEach(System.out::println);
    }
}
