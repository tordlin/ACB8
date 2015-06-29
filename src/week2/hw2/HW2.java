package week2.hw2;

import helper.ArrayHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 29/06/2015.
 */

/*2) Поменять местами наибольший и наименьший элементы в массиве*/

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size and diapason");
        int size = sc.nextInt();
        int diapason = sc.nextInt();
        int[] array = ArrayHelper.createRandomArray(size, diapason);
        int min = array[0];
        int max = array[0];
        int indexMin = 0;
        int indexMax = 0;
        int temp;

        ArrayHelper.printArray(array);
        System.out.println();

        min = ArrayHelper.findMin(size, min, array);
        indexMin = ArrayHelper.findIndexMin(size, min, indexMin, array);
        System.out.print(min + " ");
        System.out.println(indexMin);

        max = ArrayHelper.findMax(size, max, array);
        indexMax = ArrayHelper.findIndexMax(size, max, indexMax, array);
        System.out.print(max + " ");
        System.out.println(indexMax);

        temp = min;
        array[indexMin] = array[indexMax];
        array[indexMax] = temp;

        ArrayHelper.printArray(array);

    }
}
