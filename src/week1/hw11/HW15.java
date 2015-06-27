package week1.hw11;

import week1.day2.*;

import java.lang.Math;
import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*Известны площади круга и квадрата. Определить: а) уместится ли круг в
квадрат; б) уместится ли квадрат в круге.*/

public class HW15 {
    public static void main(String[] args) {
        System.out.println("Enter area round and area square");
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        int square = sc.nextInt();

        double diametr = Math.sqrt(4 * round / 3.14);
        double diagonal = Math.sqrt(square) * Math.sqrt(2);
        double squareSide = Math.sqrt(square);

        if(diametr > diagonal){
            System.out.println("Square in round");
        }else if(squareSide > diametr){
            System.out.println("Round in square");
        }
    }
}
