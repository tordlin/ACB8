package week2.hw2;


import helper.ArrayHelper;
import java.util.Scanner;

/**
 * Created by Tordlin on 29/06/2015.
 */

/*Найти минимальное и максимальное значения в массиве и вывести их на консоль*/

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size and diapason");
        int size = sc.nextInt();
        int diapason = sc.nextInt();
        int[] array = ArrayHelper.createRandomArray(size, diapason);
        int min = array[0];
        int max = array[0];

        ArrayHelper.printArray(array);

        System.out.println();

        min = ArrayHelper.findMin(array);
        System.out.println(min);

        max = ArrayHelper.findMax(array);
        System.out.println(max);

    }
}

