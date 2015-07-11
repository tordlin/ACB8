package week3.day2;

import java.util.Scanner;

/**
 * Created by Tordlin on 05/07/2015.
 */
public class Game2 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 10);
        System.out.println("Find number from 0 to 10");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 1;

        while(a != number && count < 3) {
            if (a > number) {
                System.out.println("More");
                count++;
            }else{
                System.out.println("Less");
                count++;
            }

            number = sc.nextInt();
        }

        if(a == number){
            System.out.println("Yep. It is " + a);

        }else{
            System.out.println("You tried 3 times=(");
        }
    }
}
