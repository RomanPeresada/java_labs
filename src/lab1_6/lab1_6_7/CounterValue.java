package lab1_6.lab1_6_7;

import java.util.Arrays;
import java.util.Scanner;

public class CounterValue {
    public static void main(String[] args) {
        int[][] matr = new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill in the matrix");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                matr[i][j] = Integer.parseInt(sc.nextLine());
        System.out.println("Our matrix: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Enter the number that we need to find: ");
        int x = Integer.parseInt(sc.nextLine());
        int[] index = new int[4];
        Arrays.fill(index, -1);
        int k = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Line " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                if (matr[i][j] == x)
                    index[k] = j;
                k++;
            }
            k = 0;
            System.out.print("[");
            if (index[2] - index[0] == 2 && index [1]!=-1)
                System.out.print(index[0] + "-" + index[2] + "]");
            else if (index[3]-index[0]==3 && index [2]!=-1 && index [1]!=-1) {
                System.out.print(index[0] + "-" + index[3] + "]");
            }
            else if(index[3]-index[1]==2 && index [2]!=-1)
            {
                System.out.print(index[1] + "-" + index[3] + "]");
            }
            else {

                for (int el = 0; el < index.length; el++) {

                    if (index[el] != -1) {
                        System.out.print(index[el]);
                        if(el<index.length-1 && (index[el+1]!=-1 ||(el<index.length-2&& (index[el+2]!=-1)) ||(el<index.length-3 && index[el+3]!=1)))
                            System.out.print(",");
                    }
                    if (el == index.length - 1)
                        System.out.print("]");
                }
            }
            Arrays.fill(index, -1);
            System.out.println();
        }
    }
}