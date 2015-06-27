package week1.hw11;

import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
времени года. Если пользователь введет недопустимое число, программа
должна выдать сообщение об ошибке.*/

public class HW7 {
    public static void main(String[] args) {
        System.out.println("Enter month");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        String season;

        switch(value){
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                season = "error";
        }
        System.out.println(season);
    }
}
