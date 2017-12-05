package module2.lab14.lab2_3;

public class MyTestMethod {

    public static <T extends Number> int calculateNumber(T[] array, T maxElement) {
        int count = 0;
        for (T element : array) {
            if (element.doubleValue() > maxElement.doubleValue()) {
                count++;
            }
        }
        return count;
    }
    //обычно если мы получаем результат вычислений в методе, мы должны его вернуть
    public static <T extends Number> Double calculateSun(T[] array, T maxValue) {
        Double result = Double.valueOf(0);
        for (T element : array) {
            if (element.doubleValue() > maxValue.doubleValue()) {
                result += element.doubleValue();
            }
        }
        return result;
    }
}
