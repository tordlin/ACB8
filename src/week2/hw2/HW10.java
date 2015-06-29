package week2.hw2;

import helper.ArrayHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 29/06/2015.
 */

/*public static int[] splitArray(int[] arr, int start, int end) { // обрезать массив по границам start и end
	}*/

public class HW10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size and diapason");
        int size = sc.nextInt();
        int diapason = sc.nextInt();
        int[]arr = ArrayHelper.createRandomArray(size, diapason);

        ArrayHelper.printArray(arr);
        System.out.println();

        System.out.println("Enter start and end boundaries");
        int start = sc.nextInt();
        int end = sc.nextInt();

        arr = splitArray(arr, start, end);

        ArrayHelper.printArray(arr);
    }

    public static int[] splitArray(int[] arr, int start, int end) {
        int sizeArr = end - start + 1;
        int[] temp = new int[sizeArr];
        int j = 0;

        for(int i = start; i < end + 1; i++){
            temp[0 + j] = arr[i];
            j++;
        }
        return temp;
    }
}
