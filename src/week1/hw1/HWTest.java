package week1.hw1;

import java.util.Scanner;

/**
 * Created by Tordlin on 23/06/2015.
 */
public class HWTest {

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a number");
            double a = keyboard.nextDouble();
            if (a>=0.0 && a<=1.0){
                System.out.println("The number ist in the correct range");

            } else if (a<0.0 || a>1.0) {
                System.out.println("The number ist NOT in the correct range");
            }

        }

}
