package module2.lab14.lab4;

import java.util.Random;

public class MyMixer<T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public T[] shuffle() {
        Random random = new Random();

        for (int j = 0; j < array.length; j++) {
            int initial = random.nextInt(array.length - 1);
            T temp = array[initial];
            array[initial] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
