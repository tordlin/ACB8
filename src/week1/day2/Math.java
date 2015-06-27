package week1.day2;

import java.util.Scanner;

/**
 * Created by Tordlin on 21/06/2015.
 */
public class Math {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        int result = a + b;
        System.out.println("a + b = " + result);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first value");
        int first = keyboard.nextInt();
        System.out.println("Enter second value");
        int second = keyboard.nextInt();
        System.out.println(first + second);
    }
}
