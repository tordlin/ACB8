package week1.hw1;

import java.util.Scanner;

/**
 * Created by Tordlin on 23/06/2015.
 */

/*4.1. ������������ ������ �������� � ������� (������� ��� �� 0 �� 24)
    ���� ����� �� 9 �� 18, �� ������� "� �� ������", � ������ ������ "� �������")*/

public class HW41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();

        if(hour >= 9 && hour <=18){
            System.out.println("I`am working");
        }else{
            System.out.println("I`m resting");
        }
    }
}
