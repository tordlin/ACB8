package week2.hw1;

import helper.ArrayHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 29/06/2015.
 */

/*Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное*/

public class HW7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size and diapason");
        int size = sc.nextInt();
        int diapason = sc.nextInt();
        int[] array = ArrayHelper.createRandomArray(size, diapason);
        int sizeFirstHalf = 0;
        int sizeSecondHalf = 0;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        double middleFirstHalf;
        double middleSecondHalf;

        ArrayHelper.printArray(array);
        System.out.println();

        if(size % 2 == 0){
            sizeFirstHalf = size / 2;
            sizeSecondHalf = size / 2;
            for(int i = 0; i < sizeFirstHalf; i++){
                sumFirstHalf += array[i];
            }
            for(int i = size - 1; i > sizeSecondHalf - 1; i--){
                sumSecondHalf += array[i];
            }
        }else{
            sizeFirstHalf = (size + 1) / 2;
            sizeSecondHalf = (size + 1) / 2;
            for(int i = 0; i < sizeFirstHalf; i++){
                sumFirstHalf += array[i];
            }
            for(int i = size - 1; i > sizeSecondHalf - 2; i--){
                sumSecondHalf += array[i];
            }
        }

        System.out.println(sumFirstHalf);
        System.out.println(sumSecondHalf);

        middleFirstHalf = (double)sumFirstHalf / (double)sizeFirstHalf;
        middleSecondHalf = (double)sumSecondHalf / (double)sizeSecondHalf;

        System.out.println(middleFirstHalf);
        System.out.println(middleSecondHalf);
    }
}
