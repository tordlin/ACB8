package week3.day2;

import helper.MatrixHelper;

/**
 * Created by Tordlin on 05/07/2015.
 */
public class Swap {
    public static void main(String[] args) {
        int[][] matrix = MatrixHelper.createRandomMatrix(3,4,10);
        MatrixHelper.printMatrix(matrix);
        System.out.println();

        MatrixHelper.swap(0, 0, 2, 3, matrix);

        MatrixHelper.printMatrix(matrix);
        System.out.println();

        MatrixHelper.swapRows(0, 2, matrix);
        MatrixHelper.printMatrix(matrix);
    }
}
