package week1.hw11;

import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
тельные заменить на 0.*/

public class HW2 {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > 0){
            a = a * a * a;
        }else if(a < 0){
            a = 0;
        }

        if(b > 0){
            b = b * b * b;
        }else if(b < 0){
            b = 0;
        }

        if(c > 0){
            c = c * c * c;
        }else if(c < 0){
            c = 0;
        }
    }
}
