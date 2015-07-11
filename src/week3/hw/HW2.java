package week3.hw;

import helper.MatrixHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 11/07/2015.
 */

/*Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.*/

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = sc.nextInt();
        System.out.println("Enter columns");
        int columns = sc.nextInt();

        boolean[][] matrix = MatrixHelper.createLogicMatrix(rows, columns);
        MatrixHelper.printBooleanMatrix(matrix);
    }
}
