package week1.hw11;

import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*�������� ��������� ���������� ��������� �����������, ���� �� �����-
��� � ������������ ��������������� 20% ������. ������ ������������-
����� ��������� � ���� ������ (����� �� 1 �� 7).*/

public class HW10 {
    public static void main(String[] args) {
        System.out.println("Enter length of calling and day");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int day = sc.nextInt();

        if(day == 6 || day == 7){
            System.out.println(length + " * x + ( x * 0.2 )");
        }else{
            System.out.println(length + " * x");
        }
    }
}
