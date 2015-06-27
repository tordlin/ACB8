package week1.day2;

import java.util.Scanner;

/**
 * Created by Tordlin on 21/06/2015.
 */
public class IfTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int first = sc.nextInt();
        System.out.println("Enter second value");
        int second = sc.nextInt();
        System.out.println("Enter third value");
        int third = sc.nextInt();

        int min;

        if(first < second && first < third){
            min = first;
            System.out.println("Min = " + min);
        }else if(second < first && second < third){
            min = second;
            System.out.println("Min = " + min);
        }else if(third < first && third < second){
            min = third;
            System.out.println("Min = " + min);
        }
    }
}
