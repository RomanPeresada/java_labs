package module2.lab14.lab2;

public class MyTestMethod {

    public static <T extends Number> void calculateNumber(T[] array, T maxElement) {
        int count = 0;
        for (T element : array) {
            if (element.doubleValue() > maxElement.doubleValue()) {
                count++;
            }
        }
        System.out.println("Number of elements that are greater than " + maxElement + ": " + count);
    }

    public static <T extends Number> void calculateSun(T[] array, T maxValue) {
        Double result = Double.valueOf(0);
        for (T element : array) {
            if (element.doubleValue() > maxValue.doubleValue()) {
                result += element.doubleValue();
            }
        }
        System.out.println("Sum of elements that are greater than " + maxValue + ": " + result);
    }
}