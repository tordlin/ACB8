package week2.hw21;

import helper.ArrayHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 29/06/2015.
 */

/*2.4 Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
		Количество позиций и массив указывает пользователь*/

public class HW24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size and diapason");
        int size = sc.nextInt();
        int diapason = sc.nextInt();
        int[]arr = ArrayHelper.createRandomArray(size, diapason);

        ArrayHelper.printArray(arr);
        System.out.println();

        System.out.println("How much do we need to move?");
        int move = sc.nextInt();

        int[]res = new int[size];

        for(int i = 0; i < arr.length - move; i++){
            res[i + move] = arr[i];
        }

        for(int i = arr.length - move; i < arr.length; i++){
            res[i + move - arr.length] = arr[i];
        }

        ArrayHelper.printArray(res);
    }
}
