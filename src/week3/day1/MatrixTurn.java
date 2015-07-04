package week3.day1;

import helper.MatrixHelper;

/**
 * Created by Tordlin on 04/07/2015.
 */
public class MatrixTurn {
    public static void main(String[] args) {
        int [][] matrix = MatrixHelper.createRandomMatrix(3,3,10);
        MatrixHelper.printMatrix(matrix);

        matrix = MatrixHelper.turnMatrix(matrix, 90);

        MatrixHelper.printMatrix(matrix);
    }
}
