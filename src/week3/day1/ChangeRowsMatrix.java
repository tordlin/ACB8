package week3.day1;

import helper.MatrixHelper;

/**
 * Created by Tordlin on 04/07/2015.
 */
public class ChangeRowsMatrix {
    public static void main(String[] args) {
        int [][] matrix = MatrixHelper.createRandomMatrix(3, 4, 10);
        MatrixHelper.printMatrix(matrix);
        System.out.println();

        for(int i = 0; i < matrix[0].length; i++){
            /*int tmp = matrix[0][i];
            matrix[0][i] = matrix[matrix.length - 1][i];
            matrix[matrix.length - 1][i] = tmp;*/
            MatrixHelper.swap(0,i,matrix.length - 1, i, matrix);
        }

        MatrixHelper.printMatrix(matrix);
    }
}
