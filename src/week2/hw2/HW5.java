package week2.hw2;

import helper.ArrayHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 29/06/2015.
 */

/*«аполнить массив случайными значени€ми. Ќа четных индексах парные значени€, на нечетных непарные*/

public class HW5 {
    public static void main(String[] args) {
        int[] mainArray = new int[6];
        int value;

        for(int i = 0; i < 5; i++){
            value = (int)(Math.random() * 10);
            if(value % 2 == 0 && i % 2 == 0){
                mainArray[i] = value;
            }else if(value % 2 != 0 && i % 2 == 0){
                mainArray[i] = value * 2;
            }else if(value % 2 != 0 && i % 2 != 0){
                mainArray[i] = value;
            }else if(value % 2 == 0 && i % 2 != 0){
                mainArray[i] = value + 1;
            }
        }

        ArrayHelper.printArray(mainArray);
    }
}
