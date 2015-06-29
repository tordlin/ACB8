package helper;

/**
 * Created by Tordlin on 28/06/2015.
 */
public class ArrayHelper {
    public static int[] createRandomArray(int size, int diapazon){
        int[] arrayWithRandomValues = new int[size];

        for(int i = 0; i < size; i++){
            arrayWithRandomValues[i] = (int)(Math.random() * diapazon);
        }

        return arrayWithRandomValues;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void changeRow(){
        System.out.println();
    }

    public static int findMin(int size, int min, int[] array) {
        for (int i = 0; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findIndexMin(int size, int min, int indexMin, int[] array) {
        for (int i = 0; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static int findMax(int size, int max, int[] array) {
        for (int i = 0; i < size; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findIndexMax(int size, int max, int indexMax, int[] array) {
        for (int i = 0; i < size; i++) {
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
        }
        return indexMax;
    }
}
