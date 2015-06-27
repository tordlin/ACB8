package week1.hw11;

import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*Определить, является ли шестизначное число "счастливым" (сумма
первых трех цифр равна сумме последних трех цифр).*/

public class HW14 {
    public static void main(String[] args) {
        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        String stringValue = Integer.toString(value);
        char value1 = stringValue.charAt(0);
        char value2 = stringValue.charAt(1);
        char value3 = stringValue.charAt(2);
        char value4 = stringValue.charAt(3);
        char value5 = stringValue.charAt(4);
        char value6 = stringValue.charAt(5);

        int int1 = Character.getNumericValue(value1);
        int int2 = Character.getNumericValue(value2);
        int int3 = Character.getNumericValue(value3);
        int int4 = Character.getNumericValue(value4);
        int int5 = Character.getNumericValue(value5);
        int int6 = Character.getNumericValue(value6);

        if((int1 + int2 + int3) == (int4 + int5 + int6)){
            System.out.println("Lucky");
        }else{
            System.out.println("Not lucky");
        }
    }
}
