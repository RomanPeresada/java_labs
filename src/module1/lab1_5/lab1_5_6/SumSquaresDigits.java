package module1.lab1_5.lab1_5_6;

import java.util.Scanner;

public class SumSquaresDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = Integer.parseInt(sc.nextLine());
        int length = String.valueOf(Math.abs(x)).length();
        int result = 0;
        int[] mas = new int[length];

        for (int i = 0; i < length; i++) {
            int j = i - 1;
            mas[i] = (int)(x % Math.pow(10,i+1));
            if (i != 0) {
                while (j >= 0) {
                    mas[i] -= mas[j];
                    j--;
                }
                mas[i]/=Math.pow(10,i);
            }

        }
        for (int i = 0; i < mas.length; i++) {
            result += mas[i] * mas[i];
        }

        System.out.println("The sum of squares of digits of number = " + result);
    }
}
