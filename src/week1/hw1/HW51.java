package week1.hw1;

import java.util.Scanner;

/**
 * Created by Tordlin on 23/06/2015.
 */

/*5.1. ������� � ����� � ���������� ������� ��������� � ��������, � ��������. ������������ ��� ������ �����*/

public class HW51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int value = sc.nextInt();
        int[] array = new int[20];
        int result = value;
        int count = 0;

        for (int i = 0; result > 1; i++) {
            array[i] = result % 2;
            result = result / 2;
            count++;
        }

        array[count] = 1;

        for (int i = count; i > -1; i--) {
            System.out.println(array[i]);
        }
    }
}
