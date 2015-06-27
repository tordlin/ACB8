package week1.hw1;

import java.util.Scanner;

/**
 * Created by Tordlin on 23/06/2015.
 */

/*4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.*/

public class HW46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int first = sc.nextInt();
        System.out.println("Enter second value");
        int second = sc.nextInt();

        int sum = first + second;
        if(sum >= 11 && sum <= 19){
            System.out.println(sum);
        }
    }
}
