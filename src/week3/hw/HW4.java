package week3.hw;

import helper.ArrayHelper;
import helper.MatrixHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 11/07/2015.
 */

/*Создать массив, который будет состоять из диагонали матрици

		1 3 5
		4 5 7  -  1 5 6
		4 5 6*/

public class HW4 {
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

		int [] newMatrix = new int[3];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if(i == j){
					newMatrix[i] = matrix[i][j];
				}
			}
		}

		ArrayHelper.printArray(newMatrix);
	}
}
