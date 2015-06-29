package week2.hw21;

import helper.ArrayHelper;

import java.util.Scanner;

/**
 * Created by Tordlin on 29/06/2015.
 */

/*2.3 ѕосчитать колличество букв 'a' в строке (искомый символ может быть разным)*/

public class HW23 {
    public static void main(String[] args) {
        String word = "ababac";
        char check = 'a';

        int length = word.length();
        int count = 0;

        for(int i = 0; i < length; i++){
            if(word.charAt(i) == check){
                count++;
            }
        }

        System.out.println(count);
    }
}
