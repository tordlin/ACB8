package helper;

/**
 * Created by Tordlin on 04/07/2015.
 */
public class MatrixHelper {
    public static int[][] createRandomMatrix(int rows, int columns, int diapazon) {
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * diapazon);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findMinInMatrix(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public static int findMaxInMatrix(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int[][] turnMatrix(int[][] matrix, int degree) {
        int[][] matrixTemp = matrix;
        if(degree == 90){

        }else if(degree == 180){

        }else if(degree == 270){

        }
        return matrix;
    }


    public static void swap(int a, int b, int x, int y, int[][] matrix) {
        int temp = matrix[a][b];
        matrix[a][b] = matrix[x][y];
        matrix[x][y] = temp;
    }

    public static void swapRows(int a, int b, int[][] matrix) {
        /*for(int i = 0; i < matrix[a].length; i++){
            MatrixHelper.swap(a,i,b,i, matrix);
        }*/
        int[]temp = matrix[a];
        matrix[a] = matrix[b];
        matrix[b] = temp;
    }
}
