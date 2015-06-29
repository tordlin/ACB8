package week2.hw2;

import helper.ArrayHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 29/06/2015.
 */

/*«адать два массива случайными числами от 25 до 75. ќпределить у какого из массивов больше парных елементов.*/

public class HW9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] firstArray = new int[size];
        int[] secondArray = new int[size];
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < size; i++){
            int temp = (int)(Math.random() * 100);
            if(temp > 24 && temp < 76){
                firstArray[i] = temp;
            }else{
                i--;
            }
        }

        ArrayHelper.printArray(firstArray);
        System.out.println();

        for(int i = 0; i < size; i++){
            int temp = (int)(Math.random() * 100);
            if(temp > 24 && temp < 76){
                secondArray[i] = temp;
            }else{
                i--;
            }
        }

        ArrayHelper.printArray(secondArray);
        System.out.println();

        for(int i = 0; i < size; i++){
            if(firstArray[i] % 2 == 0){
                count1++;
            }
        }

        for(int i = 0; i < size; i++){
            if(secondArray[i] % 2 == 0){
                count2++;
            }
        }

        if(count1 < count2){
            System.out.println("In second massive we have more even values " + count2 + " > " + count1);
        }else if(count1 > count2){
            System.out.println("In first massive we have more even values " + count1 + " > " + count2);
        }else {
            System.out.println("Equal");
        }
    }
}
