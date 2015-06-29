package week2.hw2;

import helper.ArrayHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 29/06/2015.
 */

/*Найти среднее арифметическое массива*/

public class HW6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size and diapason");
        int size = sc.nextInt();
        int diapason = sc.nextInt();
        int[] array = ArrayHelper.createRandomArray(size, diapason);
        int sum = 0;
        double middle;

        ArrayHelper.printArray(array);
        System.out.println();

        for(int i = 0; i < size; i++){
            sum += array[i];
        }

        System.out.println(sum);

        middle = (double)sum / (double)size;

        System.out.println(middle);
    }
}
