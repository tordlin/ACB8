package week2.hw21;

import java.util.Scanner;

/**
 * Created by Tordlin on 29/06/2015.
 */

/*2.2 Проверить или является число простым*/

public class HW22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        double value = sc.nextInt();
        System.out.println(value);

        if(value % 2 != 0 && value % 3 != 0 && value % 5 != 0){
            System.out.println("simple");
        }else{
            System.out.println("difficult");
        }
    }
}
