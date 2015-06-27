package week1.day2;

import java.util.Scanner;

/**
 * Created by Tordlin on 21/06/2015.
 */
public class LoopTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int value = sc.nextInt();
        int sum = 1;

        for(int i = 1; i < value + 1; i++){
            sum = i * sum;
        }

        System.out.println("Sum = " + sum );
    }
}
