package week1.hw11;

import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*Дано трехзначное число. Определить: а) верно ли, что все его цифры
одинаковые; б) есть ли среди его цифр одинаковые.*/

public class HW3 {
    public static void main(String[] args) {
        System.out.println("Enter a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String stringA = Integer.toString(a);
        char a1 = stringA.charAt(0);
        char a2 = stringA.charAt(1);
        char a3 = stringA.charAt(2);

        if(a1 == a2 && a2 == a3){
            System.out.println("a1 = a2 = a3");
        }else if(a1 == a2 || a2 == a3 || a1 == a3){
            System.out.println("Someone equal");
        }
    }
}
