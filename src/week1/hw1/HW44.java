package week1.hw1;

import java.util.Scanner;

/**
 * Created by Tordlin on 23/06/2015.
 */

/*4.4. ������ ����� � ��������� ������ � �������, � ��������� ����� �� ��� � ��������� �� 0 �� 1*/

public class HW44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();

        if(value >= 0 && value <= 1){
            System.out.println("Value between 0 and 1");
        }
    }
}
