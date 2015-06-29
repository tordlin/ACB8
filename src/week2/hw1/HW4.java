package week2.hw1;

import helper.ArrayHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 29/06/2015.
 */

/*Посчитать сколько цифр(цифра задается пользователем) в массиве*/

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size and diapason");
        int size = sc.nextInt();
        int diapason = sc.nextInt();
        int[] array = ArrayHelper.createRandomArray(size, diapason);
        System.out.println("Value to check");
        int check = sc.nextInt();
        ArrayHelper.printArray(array);
        System.out.println();
        int count = 0;

        for(int i = 0; i < size; i++){
            if(count == array[i]){
                count++;
            }
        }

        System.out.println(count);


    }
}
