package week1.hw1;

import java.util.Scanner;

/**
 * Created by Tordlin on 23/06/2015.
 */

/*4.2. ѕользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее*/

public class HW42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int first = sc.nextInt();
        System.out.println("Enter second value");
        int second = sc.nextInt();
        System.out.println("Enter third value");
        int third = sc.nextInt();

        int min;
        int max;

        if (first < second && first < third) {
            min = first;
            System.out.println("Min = " + min);
        } else if (second < first && second < third) {
            min = second;
            System.out.println("Min = " + min);
        } else if (third < first && third < second) {
            min = third;
            System.out.println("Min = " + min);
        }


        if (first > second && first > third) {
            max = first;
            System.out.println("Max = " + max);
        } else if (second > first && second > third) {
            max = second;
            System.out.println("Max = " + max);
        } else if (third > first && third > second) {
            max = third;
            System.out.println("Max = " + max);
        }
    }
}
