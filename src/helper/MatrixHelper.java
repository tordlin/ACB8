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
        System.out.println();
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

    public static int[] findMinIndexInMatrix(int[][] array) {
        int min = array[0][0];
        int[] minIndex = array[2];
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                    minIndex[0] = i;
                    minIndex[1] = j;
                }
            }
        }
        return minIndex;
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

    public static int[] findMaxIndexInMatrix(int[][] array) {
        int max = array[0][0];
        int[] maxIndex = array[2];
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    maxIndex[0] = i;
                    maxIndex[1] = j;
                }
            }
        }
        return maxIndex;
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

    public static boolean[][] createLogicMatrix(int rows, int columns) {
        boolean[][] matrix = new boolean[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(i == j){
                    matrix[i][j] = true;
                }else {
                    matrix[i][j] = false;
                }
            }
        }
        return matrix;
    }

    public static void printBooleanMatrix(boolean[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int sumRow(int[][] matrix, int row) {
        int sum = 0;

        for(int i = 0; i < matrix[row].length; i++){
            sum += matrix[row][i];
        }
        return sum;
    }

    public static int sumColumn(int[][] matrix, int column) {
        int sum = 0;

        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][column];
        }
        return sum;
    }
}
