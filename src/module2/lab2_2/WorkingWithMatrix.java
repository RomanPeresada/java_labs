package module2.lab2_2;

import java.util.Arrays;

class Matrix {
    private int width;
    private int height;
    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.height = this.matrix.length;
        this.width = this.matrix[0].length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void viewMatrix() {
        for (int[] row : this.matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    public Matrix additionMatrix(Matrix secondMatrix) {
        if (this.getHeight() != secondMatrix.getHeight()) {
            System.out.println("Addition is unreal");
            return this;
        }
        if (this.getWidth() != secondMatrix.getWidth()) {
            System.out.println("Addition is unreal");
            return this;
        }
        for (int row = 0; row < this.getHeight(); row++) {
            for (int cell = 0; cell < this.getWidth(); cell++) {
                this.matrix[row][cell] += secondMatrix.matrix[row][cell];
            }
        }
        return this;
    }

    public Matrix multiplicationMatrix(Matrix secondMatrix) {
        if (this.getWidth() != secondMatrix.getHeight()) {
            System.out.println("Multiplication is unreal");
            return this;
        }

        int[][] resultMatrix = new int[this.getHeight()][secondMatrix.getWidth()];
        for (int i = 0; i < this.getHeight(); i++) {
            for (int j = 0; j < secondMatrix.getWidth(); j++) {
                for (int k = 0; k < secondMatrix.getHeight(); k++) {
                    resultMatrix[i][j] += this.matrix[i][k] * secondMatrix.matrix[k][j];
                }
            }
        }
        this.setMatrix(resultMatrix);
        return this;
    }
}


public class WorkingWithMatrix {
    public static void main(String[] args) {
        int[][] templateMatrix1 = new int[][]{{1, 54, 88},
                {432, -312, 0},
                {32, -43, 11}};
        int[][] templateMatrix2 = new int[][]{{43, 123, -88},
                {4392, -212, 77},
                {39, -93, -11}};

        Matrix firstMatrix = new Matrix();
        firstMatrix.setMatrix(templateMatrix1);
        firstMatrix.viewMatrix();
        Matrix secondMatrix = new Matrix();
        secondMatrix.setMatrix(templateMatrix2);
        secondMatrix.viewMatrix();
        System.out.println("Addition is: ");
        firstMatrix.additionMatrix(secondMatrix);
        firstMatrix.viewMatrix();

        System.out.println("Multiplication is:");
        firstMatrix.multiplicationMatrix(secondMatrix);
        firstMatrix.viewMatrix();
    }
}

