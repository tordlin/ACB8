package week1.hw11;

import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*��������� ��������� ������� � ������ ������. ������ � 10% ������-
���������, ���� ����� ������� ��������� 1000 ������.*/

public class HW8 {
    public static void main(String[] args) {
        System.out.println("Enter price");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        if( price > 1000 ){
            System.out.println( price - (price / 10));
        }
    }
}
