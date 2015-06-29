package week2.day2;

import helper.ArrayHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 28/06/2015.
 */
public class ReplaceTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size and diapazon");
        int size = sc.nextInt();
        int diapazon = sc.nextInt();
        int[] array = ArrayHelper.createRandomArray(size, diapazon);
        int sizeHelper;

        ArrayHelper.printArray(array);
        System.out.println();


        if(size % 2 == 0){
            sizeHelper = size / 2;
        }else{
            sizeHelper = (size - 1) / 2;
        }


        for(int i = 0; i < sizeHelper; i++){
            int helper = array[i];
            array[i] = array[size - 1 - i];
            array[size - i - 1] = helper;
        }

        
        ArrayHelper.printArray(array);
    }
}
