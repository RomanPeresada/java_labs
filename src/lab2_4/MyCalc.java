package lab2_4;

public class MyCalc {

    public static double calcPi(int n) {
        double pi = 4;
        int counter = 0, denominator = 3;
        for (int i = 0; i < n; i++) {
            if (counter % 2 == 0) {
                pi -= 4. / denominator;
            } else {
                pi += 4. / denominator;
            }
            counter++;
            denominator += 2;
        }
        return pi;
    }
}
