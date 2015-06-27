package week1.hw1;

import java.util.Scanner;

/**
 * Created by Tordlin on 23/06/2015.
 */

/*4.7. Вводим два числа, если одно из них делиться на другое без остатка,
то выводим тру и показываем результат деления (целую часть от деления  и остачу)
в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)*/

public class HW47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int first = sc.nextInt();
        System.out.println("Enter second value");
        int second = sc.nextInt();

        int res1 = first % second;
        int res2 = second % first;
        int del1 = first / second;
        int del2 = second / first;
        boolean answer1;
        boolean answer2;

        if(res1 == 0){
            answer1 = true;
        }else{
            answer1 = false;
        }

        if(res2 == 0){
            answer2 = true;
        }else{
            answer2 = false;
        }

        if(answer1 == true){
            System.out.println(answer1 + " " + del1 + " " + res1);
        }else{
            System.out.println(answer1 + " " + del1 + " " + res1);
        }

        if(answer2 == true){
            System.out.println(answer2 + " " + del2 + " " + res2);
        }else{
            System.out.println(answer2 + " " + del2 + " " + res2);
        }
    }
}
