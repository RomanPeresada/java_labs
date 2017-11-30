package module2.lab14.lab2;

public class Main {
    public static void main(String[] args) {
        Double[] doubles = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        Integer[] integers = {1,2,3,4,5,6,7,8,9};
        MyTestMethod.calculateNumber(doubles,3);
        MyTestMethod.calculateNumber(integers,3);

        MyTestMethod.calculateSun(doubles,3);
        MyTestMethod.calculateSun(integers,3);
    }
}
