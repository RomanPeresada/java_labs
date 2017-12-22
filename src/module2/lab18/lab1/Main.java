package module2.lab18.lab1;

import java.math.BigInteger;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = new Random().nextInt(40) + 10;
        System.out.print(n + "! = ");
        System.out.println(factorial(n));
    }

    public static BigInteger factorial(int n) {
        BigInteger bigN = new BigInteger(String.valueOf(n));
        BigInteger result = BigInteger.ONE;
        for (BigInteger bi = BigInteger.ONE; bi.compareTo(bigN) <= 0; bi = bi.add(BigInteger.ONE)) {
            result = result.multiply(bi);
        }
        return result;
    }
}
