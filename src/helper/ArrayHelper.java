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

        System.out.println();
    }

    public static int findMin(int[] array) {
        /*int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }*/
        return array[findIndexMin(array)];
    }

    public static int findIndexMin(int[] array) {
        int min = array[0];
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static int findMax(int[] array) {
        /*int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }*/
        return array[findIndexMax(array)];
    }

    public static int findIndexMax(int[] array) {
        int max = array[0];
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
        }
        return indexMax;
    }
}
