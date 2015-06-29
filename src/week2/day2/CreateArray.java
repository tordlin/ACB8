package week2.day2;

import helper.ArrayHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 28/06/2015.
 */
public class CreateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array and diapazon");
        int size = sc.nextInt();
        int diapazon = sc.nextInt();

        int[] resultOfMethod = ArrayHelper.createRandomArray(size, diapazon);

        for(int i = 0; i < size; i++){
            System.out.print(resultOfMethod[i] + " ");
        }
    }


}
