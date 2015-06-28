package week1.hw1;

import java.util.Scanner;

/**
 * Created by Tordlin on 23/06/2015.
 */

/*Вычислить факториал числа.*/

public class HW52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int value = sc.nextInt();
        int sum = 1;

        for(int i = 1; i < value + 1; i++){ // recursion
            sum = i * sum;
        }

        System.out.println("Sum = " + sum );
    }
}
