package week1.hw11;

import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*Написать программу вычисления идеального веса пользователя (рост-
100). Выдать рекомендации о необходимости поправиться либо поху-
деть.*/

public class HW9 {
    public static void main(String[] args) {
        System.out.println("Enter height and weight");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int weight = sc.nextInt();

        if(height - weight > 80){
            System.out.println("You should -");
        }else if(height - weight < 80){
            System.out.println("You should +");
        }
    }
}
