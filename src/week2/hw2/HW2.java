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
        int min;
        int max;
        int indexMin;
        int indexMax;
        int temp;

        ArrayHelper.printArray(array);

        min = ArrayHelper.findMin(array);
        indexMin = ArrayHelper.findIndexMin(array);
        System.out.print(min + " ");
        System.out.println(indexMin);

        max = ArrayHelper.findMax(array);
        indexMax = ArrayHelper.findIndexMax(array);
        System.out.print(max + " ");
        System.out.println(indexMax);

        temp = min;
        array[indexMin] = array[indexMax];
        array[indexMax] = temp;

        ArrayHelper.printArray(array);

    }
}
