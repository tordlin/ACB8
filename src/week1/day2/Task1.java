package week1.day2;

import java.util.Scanner;

/**
 * Created by Tordlin on 21/06/2015.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first value.");
        int a = keyboard.nextInt();
        System.out.println("Enter second value");
        int b = keyboard.nextInt();

        int sum = a + b;
        int substraction = a - b;
        int mult = a * b;
        double del = a / (double)b;

        System.out.println("Sum = " + sum);
        System.out.println("Minus = " + substraction);
        System.out.println("Multiple = " + mult);
        System.out.println("Del = " + del);
    }
}
