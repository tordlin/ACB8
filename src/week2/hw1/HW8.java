package week2.hw1;

import helper.ArrayHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 29/06/2015.
 */

/*Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
	   который получается в результате суммы arr1[i] + arr2[i]*/

public class HW8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size and diapason");
        int size = sc.nextInt();
        int diapason = sc.nextInt();
        int[]firstArray = ArrayHelper.createRandomArray(size, diapason);
        int[]secondArray = ArrayHelper.createRandomArray(size, diapason);

        ArrayHelper.printArray(firstArray);
        System.out.println();
        ArrayHelper.printArray(secondArray);
        System.out.println();

        int[]sum = new int[size];

        for(int i = 0; i < size; i++){
            sum[i] = firstArray[i] + secondArray[i];
        }

        ArrayHelper.printArray(sum);
    }
}
