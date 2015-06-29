package week2.hw1;

import helper.ArrayHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 29/06/2015.
 */

/*Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй*/

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size and diapason");
        int size = sc.nextInt();
        int diapason = sc.nextInt();
        int[] firstArray = ArrayHelper.createRandomArray(size, diapason);
        int[] secondArray = ArrayHelper.createRandomArray(size, diapason);
        ArrayHelper.printArray(firstArray);
        System.out.println();
        ArrayHelper.printArray(secondArray);
        System.out.println();

        for(int i = 0; i < size; i++){
            secondArray[i] = firstArray[i];
        }

        ArrayHelper.printArray(firstArray);
        System.out.println();
        ArrayHelper.printArray(secondArray);

    }
}
