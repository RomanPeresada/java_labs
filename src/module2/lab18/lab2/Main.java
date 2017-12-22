package module2.lab18.lab2;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        BigDecimal[] priceOfProducts = new BigDecimal[10];
        int i = 0, countOfBought = 0;
        BigDecimal money = BigDecimal.ONE;
        for (BigDecimal bD = new BigDecimal("0.1"); bD.compareTo(new BigDecimal("1")) <= 0; bD = bD.add(new BigDecimal("0.1")), i++) {
            priceOfProducts[i] = bD;
        }
        Random random = new Random();
        for (BigDecimal bigDecimal : priceOfProducts) {
            System.out.println(numberFormat.format(bigDecimal));
        }
        System.out.println();
        for (int j = 0; j < priceOfProducts.length; j++) {
            int index = random.nextInt(10);
            if (money.subtract(priceOfProducts[index]).compareTo(BigDecimal.ZERO) >= 0) {
                money = money.subtract(priceOfProducts[index]);
                System.out.println(numberFormat.format(priceOfProducts[index]) + " - the product was bought");
                countOfBought++;
            }
        }
        if (money.compareTo(new BigDecimal("0.1")) >= 0) {
            for (BigDecimal bigDecimal : priceOfProducts) {
                if (money.subtract(bigDecimal).compareTo(BigDecimal.ZERO) >= 0) {
                    money = money.subtract(bigDecimal);
                    System.out.println(numberFormat.format(bigDecimal) + " - the product was bought");
                    countOfBought++;
                }
            }
        }
        System.out.println(countOfBought + " items bought.");
        System.out.println("Money left over:" + numberFormat.format(money));


    }

}
