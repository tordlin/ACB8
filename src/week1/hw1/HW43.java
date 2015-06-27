package week1.hw1;

import java.util.Scanner;

/**
 * Created by Tordlin on 23/06/2015.
 */

/*4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.*/

public class HW43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if(value % 7  == 0){
            System.out.println(value * value);
        }
    }
}
