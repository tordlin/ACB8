package week1.hw11;

import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*�������� ���������, ������� � ����������� �� ��������� ����� ������
��������� � ��� �������� �� 1�� 4 �/� - ������ (1); �� 5-10 �/c -
��������� (2); �� 9-18 �/c - ������� (3); ������ 19 �/c - ��������� (4).*/

public class HW12 {
    public static void main(String[] args) {
        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        int wind = sc.nextInt();
        String message = "";

        switch (wind){
            case 1:
                message = " 1 - 4 ";
                break;
            case 2:
                message = " 5 - 10 ";
                break;
            case 3:
                message = " 9 - 18 ";
                break;
            case 4:
                message = " 19 - ";
                break;
        }

        System.out.println(message);
    }
}
