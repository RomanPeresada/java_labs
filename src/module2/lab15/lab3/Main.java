package module2.lab15.lab3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add("Number_" + i);
            linkedList.add("Number_" + i);
        }
        Iterator<String> iteratorForArray = arrayList.iterator();
        Iterator<String> iteratorForLinked = linkedList.iterator();

        System.out.println("Array list:");
        while (iteratorForArray.hasNext()) {
            System.out.println(iteratorForArray.next());
        }
        System.out.println("*****************");
        System.out.println("Linked list:");
        while (iteratorForLinked.hasNext()) {
            System.out.println(iteratorForLinked.next());
        }
        System.out.println("*****************");

        int index = 0;
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext() && index < arrayList.size()) {

            listIterator.next();
            listIterator.add(arrayList.get(index));
            index++;
        }

        index = 0;
        while (listIterator.hasPrevious() && index < arrayList.size()) {
            listIterator.previous();
            listIterator.previous();
            listIterator.add(arrayList.get(index));
            listIterator.previous();
            index++;

        }

        System.out.println("Update linked list:");
        printElements(linkedList);
    }

    public static <T> void printElements(Collection<T> collection) {
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
