package module1.lab1_6.lab1_6_5;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                matrix[i][j] = (2*i + j);
        System.out.println("Origin matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int[][]transMatr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transMatr[i][j]=matrix[j][i];
            }
        }
        System.out.println("Transpose matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(transMatr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
