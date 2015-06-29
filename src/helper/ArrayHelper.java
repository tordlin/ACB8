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
}
