package week3.day1;

import helper.MatrixHelper;

/**
 * Created by Tordlin on 04/07/2015.
 */
public class MatrixExample {
    public static void main(String[] args) {
        int[][] matrix2 = {{1,2},{3,4},{5,6}};

        int[][] matrix = MatrixHelper.createRandomMatrix(3, 3, 10);

        MatrixHelper.printMatrix(matrix);

        int min = MatrixHelper.findMinInMatrix(matrix);

        int max = MatrixHelper.findMaxInMatrix(matrix);

        System.out.println(min);

        System.out.println(max);
    }
}
