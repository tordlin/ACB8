package week1.hw11;

import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*Написать программу, которая в зависимости от характера ветра выдает
сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).*/

public class HW12 {
    public static void main(String[] args) {
        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        int wind = sc.nextInt();
        String message = "";

        switch (wind){
            case 1:
                message = " 1 - 4 ";
                break;
            case 2:
                message = " 5 - 10 ";
                break;
            case 3:
                message = " 9 - 18 ";
                break;
            case 4:
                message = " 19 - ";
                break;
        }

        System.out.println(message);
    }
}
