package week2.day2;

import helper.ArrayHelper;

/**
 * Created by Tordlin on 28/06/2015.
 */
public class TestCreateArray {
    public static void main(String[] args) {
        int[] array = ArrayHelper.createRandomArray(5, 10);

        ArrayHelper.printArray(array);
    }


}
