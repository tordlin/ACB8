package week1.day2;

import java.util.Scanner;

/**
 * Created by Tordlin on 21/06/2015.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a");
        int a = keyboard.nextInt();
        System.out.println("Enter b");
        int b = keyboard.nextInt();
        System.out.println("Enter c");
        int c = keyboard.nextInt();

        double desc = (b * b) - (double) (4 * a * c);
        System.out.println("Desc = " + desc);

        if (desc > 0) {
            double x1 = (((-1) * b) + (StrictMath.sqrt(desc))) / (2 * a);
            double x2 = (((-1) * b) - (StrictMath.sqrt(desc))) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (desc < 0) {
            System.out.println("Desc < 0!");
        } else {
            double x3 = (-b) / (2 * a);
            System.out.println("x = " + x3);
        }

    }
}
