package week1.hw11;

import java.util.Scanner;

/**
 * Created by Tordlin on 27/06/2015.
 */

/*�������� ���������, ������� ��� ����� ����� � ��������� �� 1 �� 99
��������� � ���� ����� "�������" � ���������� �����. ��������, 1
�������, 5 ������, 42 ������� .*/

public class HW11 {
    public static void main(String[] args) {
        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int result = value % 10;

        if(result == 1){
            System.out.println(value + " coin");
        }else{
            System.out.println(value + " coins");
        }
    }
}
