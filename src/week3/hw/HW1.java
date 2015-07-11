package week3.hw;

import helper.MatrixHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 11/07/2015.
 */

/*Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8*/

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = sc.nextInt();
        System.out.println("Enter columns");
        int columns = sc.nextInt();
        System.out.println("Enter diapason");
        int diapason = sc.nextInt();

        int [][] matrix = MatrixHelper.createRandomMatrix(rows,columns,diapason);
        MatrixHelper.printMatrix(matrix);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] % 5 == 0){
                    matrix[i][j] = 8;
                }
            }
        }

        MatrixHelper.printMatrix(matrix);
    }
}
