package lab1_5.lab1_5_1;

public class PrintConsole {


    public static void main(String[] args) {
        int i = 0;
        int j = 8;
        while (j > i) {
            i++;
            int c = i;
            while (i > 0) {
                System.out.print(i + " ");
                i--;
            }
            System.out.println();
            i = c;
        }
    }
}

