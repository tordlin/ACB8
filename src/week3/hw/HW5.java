package week3.hw;

import helper.ArrayHelper;
import helper.MatrixHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 11/07/2015.
 */

/*а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
	     b) Поменять наибольший и наименьший столбик в двухмерном массиве.*/

public class HW5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = sc.nextInt();
        System.out.println("Enter columns");
        int columns = sc.nextInt();
        System.out.println("Enter diapason");
        int diapason = sc.nextInt();

        int [][] matrix = MatrixHelper.createRandomMatrix(rows, columns, diapason);
        MatrixHelper.printMatrix(matrix);

        int[] sumRow = new int[rows];
        for (int i = 0; i < sumRow.length; i++) {
            sumRow[i] = MatrixHelper.sumRow(matrix, i);
        }

        ArrayHelper.printArray(sumRow);

        int[] sumColumn = new int[columns];
        for (int i = 0; i < sumColumn.length; i++) {
            sumColumn[i] = MatrixHelper.sumColumn(matrix, i);
        }

        ArrayHelper.printArray(sumColumn);

        int minIndexRow = ArrayHelper.findIndexMin(sumRow);
        int maxIndexRow = ArrayHelper.findIndexMax(sumRow);
        System.out.println(maxIndexRow);
        System.out.println(minIndexRow);

        MatrixHelper.swapRows(maxIndexRow, minIndexRow, matrix);
        MatrixHelper.printMatrix(matrix);

        int minIndexColumn = ArrayHelper.findIndexMin(sumColumn);
        int maxIndexColumn = ArrayHelper.findIndexMax(sumColumn);
        System.out.println(maxIndexColumn);
        System.out.println(minIndexColumn);

        MatrixHelper.swapRows(maxIndexColumn, minIndexColumn, matrix);
        MatrixHelper.printMatrix(matrix);


	}
}
