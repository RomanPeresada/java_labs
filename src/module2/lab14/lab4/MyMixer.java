package module2.lab14.lab4;

public class MyMixer<T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public T[] shuffle() {
        for (int i = 0, j = array.length - 1; i < j; i++, j--){
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
