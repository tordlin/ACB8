package week3.hw;

import helper.ArrayHelper;
import helper.MatrixHelper;
import helper.StringHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 11/07/2015.
 */

/*Найти самое длинное слово в строке(разделенное одним пробелом)*/

public class HW7 {
    public static void main(String[] args) {
        System.out.println("Enter word");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int wordLength = word.length();
        String separator = " ";

        char[] ch = word.toCharArray();

        int[] indexSeparators = StringHelper.findIndexSeparator(ch,separator);

        ArrayHelper.printArray(indexSeparators);

        String[] partString = StringHelper.takePartString(word,indexSeparators);

        StringHelper.printArrayOfString(partString);

        String biggerStringFromArray = StringHelper.findBiggerStringFromArray(partString);

        System.out.println(biggerStringFromArray);
    }
}
