package lab2_4.lab2_4_6;

public class MyPyramid {
    public static void printPyramid(int h) {
        if (h >= 1 && h <= 9) {
            int counterOfRows = 1;
            for (int i = 1; i <= h; i++) {
                for (int emptyCell = i; emptyCell <= h; emptyCell++) {
                    System.out.print(" ");
                }
                for (int digitCell = 1; digitCell <= counterOfRows; digitCell++) {
                    System.out.print(digitCell);
                    if (digitCell == counterOfRows) {
                        for (int reverseDigit = counterOfRows - 1; reverseDigit > 0; reverseDigit--) {
                            System.out.print(reverseDigit);
                        }
                    }
                }
                System.out.println();
                counterOfRows++;
            }
        }
    }
}
