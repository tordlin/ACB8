package week1.hw11;

import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*»звестны две скорости, одна в километрах в час, друга€ в метрах в секун-
ду.  ака€ из них больше?*/

public class HW4 {
    public static void main(String[] args) {
        System.out.println("Enter km, m");
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        int m = sc.nextInt();

        int mkm = m * 1000 / 3600;

        if(km > mkm){
            System.out.println("km > m");
        }else if(km < mkm){
            System.out.println("km < m");
        }
    }
}
