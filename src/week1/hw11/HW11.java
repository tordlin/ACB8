package week1.hw11;

import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*Написать программу, которая при вводе числа в диапазоне от 1 до 99
добавляет к нему слово "копейка" в правильной форме. Например, 1
копейка, 5 копеек, 42 копейки .*/

public class HW11 {
    public static void main(String[] args) {
        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int result = value % 10;

        if(result == 1){
            System.out.println(value + " coin");
        }else{
            System.out.println(value + " coins");
        }
    }
}
