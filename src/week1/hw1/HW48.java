package week1.hw1;

import java.util.Scanner;

/**
 * Created by Tordlin on 23/06/2015.
 */

/*4.8. ¬водим два числа, сравнить последнии цифры этих чисел (пользоватьс€ оператором %)
			124    4    -   true
			1456   567  -   false
			1      2    -   false
			18     98   -   true*/

public class HW48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int first = sc.nextInt();
        System.out.println("Enter second value");
        int second = sc.nextInt();

        /*String firstString = Integer.toString(first);
        int firstSize = firstString.length() - 1;
        String secondString = Integer.toString(second);
        int secondSize = secondString.length() - 1;

        char firstLast = firstString.charAt(firstSize);
        char secondLast = secondString.charAt(secondSize);

        if(firstLast == secondLast){
            System.out.println(true);
        }else{
            System.out.println(false);
        }*/

        int res1 = first % 10;
        int res2 = second % 10;

        if(res1 == res2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
