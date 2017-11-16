package module1.lab1_5.lab1_5_7;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = Integer.parseInt(sc.nextLine());
        int result;
        for (int i = 1; i <= x; i++) {
            result = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0)
                    result += j;
            }
            if (result == i)
                System.out.println(i);


        }

    }
}
