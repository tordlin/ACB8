package week1.hw1;

import java.util.Scanner;

/**
 * Created by Tordlin on 23/06/2015.
 */

/*5.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
			5678  -   1
			5889  -   2
			8888  -   4
			989990  - 1*/

public class HW53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int value = sc.nextInt();
        char check = '8';

        String stringValue = Integer.toString(value);
        int valueLength = stringValue.length();
        int repeating = 0;
        for(int i = 0; i < valueLength; i++){
            if(stringValue.charAt(i) == check){
                repeating++;
            }
        }

        System.out.println(repeating);
    }
}
