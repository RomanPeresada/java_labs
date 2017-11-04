package lab1_6.lab1_6_7;

import java.util.Scanner;

public class CounterValue {
    public static void main(String[] args) {
        int[][] matr = new int[3][3];
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill in the matrix");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matr[i][j] = Integer.parseInt(sc.nextLine());
        System.out.println("Our matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Enter the number that we need to find: ");
        int x = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matr[i][j] == x)
                    counter++;
            }
        }
        System.out.println("Counter = " + counter);
    }
}
