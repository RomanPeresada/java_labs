package module2.lab15.lab4;

import java.util.*;

public class MyNumGenerator {
    private int numOfElem;
    private int maxNumb;

    public MyNumGenerator(int numOfElem, int maxNumb) {
        this.numOfElem = numOfElem;
        this.maxNumb = maxNumb;
    }

    public List<Integer> generate() {
        List<Integer> list = new ArrayList(numOfElem);
        Random random = new Random();
        for (int i = 0; i < numOfElem; i++) {
            list.add(random.nextInt(maxNumb));
        }
        return list;
    }

    public Set<Integer> generateDistinct() {
        Random random = new Random();
        Set<Integer> set = new HashSet<>(numOfElem);
        for (int i = 0; i < numOfElem; i++){
            while(!set.add(random.nextInt(maxNumb)));
        }
        return set;
    }

}
