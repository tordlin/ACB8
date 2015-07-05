package week3.day2;

import java.util.Scanner;

/**
 * Created by Tordlin on 05/07/2015.
 */
public class Game {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 10);
        System.out.println("Find number from 0 to 10");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while(a != number){
            System.out.println("Wrong");
            number = sc.nextInt();
        }
        System.out.println("Yep");
    }
}
