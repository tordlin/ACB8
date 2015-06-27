package week1.hw11;

import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*ƒаны три числа A,B,C. ”величить числа в два
раза, если A+B+C>0, в противном случае заменить
на нули.*/

public class HW13 {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if( a + b + c > 0){
            a = a * 2;
            b = b * 2;
            c = c * 2;
        }else{
            a = 0;
            b = 0;
            c = 0;
        }
    }
}
